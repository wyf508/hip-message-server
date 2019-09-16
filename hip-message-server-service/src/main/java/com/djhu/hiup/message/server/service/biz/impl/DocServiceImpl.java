package com.djhu.hiup.message.server.service.biz.impl;

import com.ats.ihe.utils.OID;
import com.djhu.hiup.message.server.core.dao.IDocDao;
import com.djhu.hiup.message.server.core.model.Doc;
import com.djhu.hiup.message.server.core.model.SystemDir;
import com.djhu.hiup.message.server.service.biz.IHIPMessageServerService;
import com.djhu.hiup.message.server.service.common.HIPMessageKeyConstant;
import com.djhu.hiup.message.server.service.common.ServiceName;
import com.djhu.hiup.message.server.service.exception.DataExistedException;
import com.djhu.hiup.message.server.service.exception.DataNotExistException;
import com.djhu.hiup.message.server.service.exception.DataTooManyException;
import com.djhu.hiup.message.server.service.future.FutureJob;
import com.djhu.hiup.message.server.service.util.Base64Utils;
import com.djhu.hiup.message.server.service.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 文档
 * Created by jiangmei on 2018/6/7.
 */
@Component(ServiceName.DOC)
public class DocServiceImpl implements IHIPMessageServerService {

    private static final Logger LOG = LoggerFactory.getLogger(DocServiceImpl.class);

    @Resource
    private IDocDao docDao;
    @Resource
    private SystemDirServiceImpl systemDirService;

    @Value("${doc.url}")
    private String docUrl;

    private static SystemDir systemDir;

    @Override
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception {
        long st = System.currentTimeMillis();
        int count = docDao.selectCountBySelective(keyAndXmlValMap);
        if (count > 0) {
            LOG.info("thread {} -文档检查耗时耗时：{}ms", Thread.currentThread().getName(), System.currentTimeMillis() - st);
            throw new DataExistedException();
        }
        LOG.info("thread {} -文档检查耗时耗时：{}ms", Thread.currentThread().getName(), System.currentTimeMillis() - st);
        st = System.currentTimeMillis();
        String docBase64Content = (String) keyAndXmlValMap.get(HIPMessageKeyConstant.DOC_BASE64_CONTENT);
        String docTypeCode = (String) keyAndXmlValMap.get(HIPMessageKeyConstant.DOC_TYPE_CODE);
        String docTypeDepict = (String) keyAndXmlValMap.get(HIPMessageKeyConstant.DOC_TYPE_DEPICT);
        Object name = keyAndXmlValMap.get(HIPMessageKeyConstant.NAME);
        final String docContent = Base64Utils.getFromBase64(docBase64Content);
        String docId = OID.createOIDGivenRoot("1.2.3.4");
        if (systemDir == null) {
            systemDir = systemDirService.getOneSystemDir();
        }
        String dirPath = systemDir.getDirPath();
        final String filePath = FileUtils.getFileItemPathNew(dirPath, docId, docTypeCode, keyAndXmlValMap);
        keyAndXmlValMap.put(HIPMessageKeyConstant.SYSTEM_DIR_PK, systemDir.getPk());
        keyAndXmlValMap.put(HIPMessageKeyConstant.DOC_PATH, filePath.replace(dirPath, ""));
        keyAndXmlValMap.put(HIPMessageKeyConstant.DOC_HTTP, docUrl + "/" + filePath.replace(dirPath, ""));
        LOG.info("thread {} -文档创建路径耗时耗时：{}ms", Thread.currentThread().getName(), System.currentTimeMillis() - st);
        FutureJob.involke(() -> {
            try {
                FileUtils.write(filePath, docContent);
            } catch (Exception e) {
                LOG.error("{}保存失败，内容{}", filePath, docContent);
                LOG.error("失败原因", e);
            }
        });

        int i = docDao.insertSelective(keyAndXmlValMap);
        LOG.info("保存doc表成功，documentId={}", keyAndXmlValMap.get("documentId"));
        return i;
    }

    @Override
    public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception {
        int count = docDao.selectCountBySelective(keyAndXmlValMap);
        if (count <= 0) {
            throw new DataNotExistException();
        }
        if (count > 1) {
            throw new DataTooManyException();
        }
        List<Doc> docList = docDao.selectBySelective(keyAndXmlValMap);

        String docBase64Content = (String) keyAndXmlValMap.get(HIPMessageKeyConstant.DOC_BASE64_CONTENT);
        final String docContent = Base64Utils.getFromBase64(docBase64Content);
        FutureJob.involke(() -> {
            String dirPath = null;
            for (Doc doc : docList) {
                try {
                    dirPath = systemDirService.getSystemDirMap().get(doc.getSystemDirPk()).getDirPath();
                    FileUtils.write(dirPath + doc.getDocPath(), docContent);
                } catch (Exception e) {
                    LOG.error("{}保存失败，内容{}", dirPath + doc.getDocPath(), docContent);
                    LOG.error("失败原因", e);
                }
            }
        });

        return docDao.updateBySelective(keyAndXmlValMap);
    }

    @Override
    public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception {
        List<Doc> docList = docDao.selectBySelective(keyAndXmlValMap);
        if (docList.size() == 0) {
            return new ArrayList();
        }
        Doc doc = docList.get(0);
        String action = (String) keyAndXmlValMap.get(HIPMessageKeyConstant.ACTION);
        if ("S0015".equals(action)) {
            //调阅
            String dirPath = systemDirService.getSystemDirMap().get(doc.getSystemDirPk()).getDirPath();
            String docContent = FileUtils.read(dirPath + doc.getDocPath());
            doc.setDocBase64Content(Base64Utils.getBase64(docContent));
            doc.setDocUrl(docUrl + "/" + doc.getDocPath());

        } else if ("S0016".equals(action)) {
            //检索
            final FutureJob job = new FutureJob(docList.size());
            docList.forEach(doc1 ->
                    job.add(() -> {
                        doc1.setDocUrl(docUrl + "/" + doc1.getDocPath());
                        return 0;
                    }));
            job.awaitTermination(600);
        }
        return docList;
    }
}
