package com.djhu.hiup.message.server.service.util;


import com.djhu.hiup.message.server.service.common.HIPMessageKeyConstant;
import com.djhu.hiup.message.server.service.common.HIPMessageServerServiceCode;
import com.djhu.hiup.message.server.service.common.MedicalRecordDocConstant;
import com.djhu.hiup.message.server.service.common.SharedDocConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;

/**
 * 文件操作工具类
 */
public class FileUtils {

    public static final String UTF_8 = "UTF-8";
    public static final String DOC_SUFFIX = ".xml";
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");
    private static final Logger LOGGER = LoggerFactory.getLogger(FileUtils.class);


    /**
     * 读取文件内容
     *
     * @param path 读取文件路径
     * @return
     */
    public static String read(String path) throws Exception {
        return read(path, UTF_8);
    }

    /**
     * 读取文件内容
     *
     * @param path     读取文件路径
     * @param encoding 读取文件编码
     * @return
     */
    public static String read(String path, String encoding) throws Exception {
        LOGGER.debug("读取文件内容开始");
        //LOGGER.debug("输入读取文件路径：{}", path);
        LOGGER.debug("输入读取文件编码：{}", encoding);
        String content = "";
        File file = new File(path);
        if (StringUtils.isNotEmpty(file)) {
            LOGGER.debug("文件存在：{}", file.exists());
        }
        if (!file.exists()) {
            throw new FileNotFoundException("文件不存在：" + path);
        }
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        try {
            fileInputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(fileInputStream, encoding);
            bufferedReader = new BufferedReader(inputStreamReader);
            while ((line = bufferedReader.readLine()) != null) {
                content += line;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
        //LOGGER.debug("读取文件内容结束，返回文件内容：{}", content);
        //LOGGER.info("读取文件路径：{}内容，返回文件内容：{}", path, content);
        return content;
    }

    /**
     * 內容写入文件
     *
     * @param path    写入文件路径
     * @param content 写入文件内容
     */
    public static void write(String path, String content) throws Exception {
        write(path, content, UTF_8);
    }

    /**
     * 內容写入文件
     *
     * @param path     写入文件路径
     * @param content  写入文件内容
     * @param encoding 写入文件编码
     */
    public static void write(String path, String content, String encoding) throws Exception {
        LOGGER.debug("内容写入文件开始");
        LOGGER.debug("输入写入文件路径：{}", path);
        //LOGGER.debug("输入写入文件内容：{}", content);
        LOGGER.debug("输入写入文件编码：{}", encoding);
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(path);
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            fileOutputStream = new FileOutputStream(file);
            outputStreamWriter = new OutputStreamWriter(fileOutputStream, encoding);
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(content);
        } catch (Exception e) {
            throw e;
        } finally {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            if (outputStreamWriter != null) {
                outputStreamWriter.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
        LOGGER.debug("内容写入文件结束");
        //LOGGER.info("内容：{}，写入文件：{}", content, path);
    }

    /**
     * 內容写入文件
     *
     * @param content 写入文件内容
     */
    public static File writeTmplFile(String content) throws Exception {
        LOGGER.debug("内容写入文件开始");
        //LOGGER.debug("输入写入文件内容：{}", content);
        LOGGER.debug("输入写入文件编码：{}", UTF_8);
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedWriter bufferedWriter = null;
        File file = null;
        try {
            file = File.createTempFile("tmpl_", ".xml");
            LOGGER.info("临时文件路径：{}", file.getAbsoluteFile());
            fileOutputStream = new FileOutputStream(file);
            outputStreamWriter = new OutputStreamWriter(fileOutputStream, UTF_8);
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(content);
        } catch (Exception e) {
            throw e;
        } finally {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            if (outputStreamWriter != null) {
                outputStreamWriter.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
        LOGGER.debug("内容写入文件结束");
        //LOGGER.info("内容：{}，写入文件：{}", content, file.getAbsoluteFile());
        return file;
    }

    /**
     * 生成单项路径
     */
    public static String getFileItemPath(String dirPath, String msgId, String docTypeCode) {

        // 计算本日路径
        Date dateNow = new Date();
        //默认是：电子病历共享文档
        String msgType = "EmrShareDoc";
        if (HIPMessageServerServiceCode.getCodeAndServiceMap().keySet().contains(docTypeCode)) {
            msgType = "ServiceCallLog";
        }
        String dirRoot = dirPath + "/" + msgType + "/" + DATE_FORMAT.format(dateNow) + "/" + msgId + "/";
        // 创建路径
        File file = new File(dirRoot);
        if (!file.exists()) {
            file.mkdirs();
        }
        String messageItemPath = dirRoot + msgId + DOC_SUFFIX;
        return messageItemPath;
    }

    /**
     * 生成单项路径(新）
     */
    public static String getFileItemPathNew(String dirPath, String msgId, String docTypeCode, Map<String, Object> keyAndXmlValMap) {

        // 文档类型 如：EmrShareDoc | ServiceCallLog
        String docType;
        // 文件名称  如：患者注册 | 20-生命体征测量记录
        String fileName;
        // 文件名全路径 如：EMR-PL-01患者注册 | EMR-SD-20-生命体征测量记录
        String allFilePath;
        String docNum;
        if (msgId.length()>8) {
            msgId=msgId.substring(0,8);
        }

        String name = (String) keyAndXmlValMap.get(HIPMessageKeyConstant.NAME);
        if (HIPMessageServerServiceCode.getCodeAndServiceMap().keySet().contains(docTypeCode)) {
            docType = "ServiceCallLog";
            docNum = MedicalRecordDocConstant.getDocNumber(docTypeCode);
            fileName = HIPMessageServerServiceCode.getCodeAndServiceMap().get(docTypeCode).getComment();
            allFilePath = "EMR-PL-" + docNum + "-" + fileName;
        } else {
            if (!StringUtils.isEmpty(msgId)) {
                msgId = msgId.substring(0, msgId.length() > 4 ? 4 : msgId.length()) + new Random().nextInt(100000);
            }
            docType = "EmrShareDoc";
            fileName = (String) keyAndXmlValMap.get(HIPMessageKeyConstant.DOC_TYPE_DEPICT);
            docNum = SharedDocConstant.getNumber(fileName);
            allFilePath = "EMR-SD-" + docNum + "-" + fileName;
        }
        String dirRoot = dirPath + "/" + docType + "/" + docNum + "-" + fileName + "/" +
                DATE_FORMAT.format(new Date()) + "/" + name + "/";
        // 创建路径
        File file = new File(dirRoot);
        if (!file.exists()) {
            file.mkdirs();
        }
        String messageItemPath = dirRoot + allFilePath + "-" + msgId + DOC_SUFFIX;
        LOGGER.info("{} path is {}", docType, messageItemPath);
        return messageItemPath;
    }

}
