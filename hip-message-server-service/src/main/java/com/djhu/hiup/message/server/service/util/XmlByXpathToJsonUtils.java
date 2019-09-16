package com.djhu.hiup.message.server.service.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;
import org.hl7.v3.DocEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.djhu.hiup.message.server.service.future.FutureJob;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jiangmei on 2018/4/26.
 */
public class XmlByXpathToJsonUtils {

    private static final String ROOT = ".root";
    private static final Logger LOG = LoggerFactory.getLogger(XmlByXpathToJsonUtils.class);

    private static JAXBUtils jaxb = new JAXBUtils();

    public static void main(String[] args) {
        String xml = "<PRPA_IN402003UV02 ITSVersion=\\\"XML_1.0\\\" xmlns:xsi=\\\"http://www.w3.org/2001/XMLSchema-instance\\\" xmlns:v3=\\\"urn:hl7-org:v3\\\" xsi:schemaLocation=\\\"urn:hl7-org:v3 ../multicacheschemas/PRPA_IN402003UV02.xsd\\\" xmlns=\\\"urn:hl7-org:v3\\\"><id root=\\\"2.16.156.10011.0\\\" extension=\\\"10922766\\\"/><creationTime value=\\\"20180102094742\\\"/><interactionId root=\\\"2.16.840.1.113883.1.6\\\" extension=\\\"PRPA_IN201301UV02\\\"/><processingCode code=\\\"P\\\"/><processingModeCode code=\\\"R\\\"/><acceptAckCode code=\\\"AL\\\"/><receiver typeCode=\\\"RCV\\\"><device classCode=\\\"DEV\\\" determinerCode=\\\"INSTANCE\\\"><id root=\\\"2.16.156.10011.0.1.1\\\" extension=\\\"2.16.840.1.113883.4.487.12.1\\\"/></device></receiver><sender typeCode=\\\"RSP\\\"><device classCode=\\\"CER\\\" determinerCode=\\\"INSTANCE\\\"><id root=\\\"2.16.156.10011.0.1.2\\\" extension=\\\"2.16.840.1.113883.4.487.12.1.4\\\"/></device></sender><controlActProcess classCode=\\\"INFO\\\" moodCode=\\\"PRP\\\"><subject typeCode=\\\"SUBJ\\\"><encounterEvent classCode=\\\"ENC\\\" moodCode=\\\"EVN\\\"><!--住院号 就诊流水号--><id root=\\\"2.16.156.10011.0.5.2\\\" extension=\\\"01099939\\\"/><!--就诊事件类别代码 1.门诊 2.急诊 3.住院 9.其他--><code code=\\\"01\\\" codeSystem=\\\"2.16.156.10011.2.3.1.271\\\" codeSystemName=\\\"患者类型代码表\\\" displayName=\\\"自费\\\"/><statusCode code=\\\"completed\\\"/><!--出院日期时间   数据元：HDSD00.02.005DE06.00.017.00--><effectiveTime value=\\\"20180102\\\"/><lengthOfStayQuantity value=\\\"11\\\" unit=\\\"天\\\" xsi:type=\\\"PQ\\\"/><!--出院诊断代码（治疗结果代码   数据元：HDSD00.02.061DE05.10.113.00）--><dischargeDispositionCode code=\\\"DE05.01.025.00\\\" codeSystem=\\\"2.16.156.10011.2.3.3.11.1\\\" codeSystemName=\\\"诊断代码表（ICD-10）\\\" displayName=\\\"诊断名称\\\"/><!--患者--><subject typeCode=\\\"SBJ\\\"><patient classCode=\\\"PAT\\\"><!--平台注册的患者ID --><id code=\\\"1941718\\\"/><!--患者基本信息--><patientPerson><!--姓名  数据元：HDSD00.02.027DE02.01.039.00 --><name use=\\\"L\\\">刘艳平</name><administrativeGenderCode codeSystem=\\\"2.16.156.10011.2.3.3.4\\\" codeSystemName=\\\"生理性别代码表(GB/T 2261.1)\\\" code=\\\"2\\\" displayName=\\\"女\\\"/><birthTime value=\\\"19651019\\\"/></patientPerson><providerOrganization classCode=\\\"ORG\\\" determinerCode=\\\"INSTANCE\\\"><!--医疗机构组织机构代码  数据元：HDSD00.02.055DE08.10.052.00--><id root=\\\"2.16.156.10011.1.5\\\" extension=\\\"41275513-5\\\"/><!--医疗机构名称 数据元：HDSD00.02.054DE08.10.026.00--><name>吉林大学第二医院</name><contactParty classCode=\\\"CON\\\" xsi:nil=\\\"true\\\"/></providerOrganization></patient></subject><!--登记人--><discharger typeCode=\\\"DIS\\\"><time/><assignedPerson classCode=\\\"ASSIGNED\\\"><!--登记人职工号--><id root=\\\"2.16.156.10011.0.3.3\\\" extension=\\\"P12539\\\"/><assignedPerson classCode=\\\"PSN\\\" determinerCode=\\\"INSTANCE\\\"><!--登记人姓名--><name>张婷婷</name></assignedPerson></assignedPerson></discharger></encounterEvent></subject></controlActProcess></PRPA_IN402003UV02>";
        DocEntity docEntity = (DocEntity) jaxb.unmarshaller(xml, DocClassUtil.getClassByType("S0032"));
        System.out.println(docEntity.toString());
        System.out.println(docEntity.toMap().toString());
    }

    /**
     * 通过Jaxb转换成Map
     *
     * @param requestMsgType
     * @param requestBody
     * @return
     * @throws Exception
     */
    public static Map<String, Object> xmlToJsonMapJAXB(String requestMsgType, String requestBody) throws Exception {
        long st = System.currentTimeMillis();
        DocEntity docEntity = (DocEntity) jaxb.xmlToObject(requestBody, DocClassUtil.getClassByType(requestMsgType));
        LOG.info("jaxb转换耗时：{}毫秒", System.currentTimeMillis() - st);
        st = System.currentTimeMillis();
        Map<String, Object> xml = docEntity.toMap();
        LOG.info("toMap转换耗时：{}毫秒", System.currentTimeMillis() - st);
        return xml;

    }

    /**
     * 在map中追加xml
     *
     * @param requestMsgType
     * @param requestBody
     * @throws Exception
     */
    public static Map<String, Object> xmlToJsonMap(String requestMsgType, String requestBody) throws Exception {
        long st = System.currentTimeMillis();

        Document document = null;
        Map<String, Object> jsonKeyAndXmlValMap = new HashMap<>();
        try {

            Map<String, String> xmlToJsonConfMap = JsonMappingXmlXpathReaderUtils.getXmlToJsonConfPropertiesMap(requestMsgType);

            LOG.info("JsonMappingXmlXpath耗时：{}毫秒", System.currentTimeMillis() - st);
            //命名空间xmlns进行处理，自定义一个名称，否则使用xpath 轴无效
            requestBody = requestBody.replaceAll("xmlns\\s*=", "s=");
            document = DocumentHelper.parseText(requestBody);
            String val = null;
            String xpath = null;
            //获取子节点key前缀
            String sonKeyPrefix = null;
            String sonRootXpath = null;
            String sonKey = null;
            List<Node> nodes = null;
            Map<String, Object> sonKeyAndXmlValMap = null;
            List<Map<String, Object>> sonKeyAndXmlValMapList = null;

            for (String key : xmlToJsonConfMap.keySet()) {
                xpath = xmlToJsonConfMap.get(key);
                //不存在子节点情况下（没有循环）
                if (key.indexOf(".") == -1) {
                    val = selectSingNodeVal(document, xpath);
                    if (StringUtils.isEmpty(val)) {
                        continue;
                    }
                    jsonKeyAndXmlValMap.put(key, val);
                } else {
                    //需要循环的内容
                    sonKeyPrefix = key.substring(0, key.indexOf("."));
                    sonRootXpath = xmlToJsonConfMap.get(sonKeyPrefix + ROOT);
                    if (StringUtils.isEmpty(sonRootXpath)) {
                        throw new Exception("子节点必须配置：" + sonKeyPrefix + ROOT);
                    }
                    nodes = document.selectNodes(sonRootXpath);
                    sonKey = key.substring(key.indexOf(".") + 1, key.length());
                    if (ROOT.contains(sonKey)) {
                        continue;
                    }
                    for (int i = 0; i < nodes.size(); i++) {
                        val = XmlReaderUtils.selectSingleNodeVal(nodes.get(i), xmlToJsonConfMap.get(key));
                        if (StringUtils.isEmpty(val)) {
                            continue;
                        }
                        //判断最外层是否已经包含该键
                        if (jsonKeyAndXmlValMap.keySet().contains(sonKeyPrefix)) {
                            //设置list 1+，Map的第一个值
                            if (sonKeyAndXmlValMapList.size() < (i + 1)) {
                                sonKeyAndXmlValMap = new HashMap<>();
                                sonKeyAndXmlValMap.put(sonKey, val);
                                sonKeyAndXmlValMapList.add(sonKeyAndXmlValMap);
                                jsonKeyAndXmlValMap.put(sonKeyPrefix, sonKeyAndXmlValMapList);
                            } else {
                                //设置list中Map的，除第一个值以外的其他值
                                ((List<Map<String, String>>) (jsonKeyAndXmlValMap.get(sonKeyPrefix))).get(i).put(sonKey, val);
                            }
                        } else {
                            //设置List 0，Map的第一个值
                            sonKeyAndXmlValMap = new HashMap<>();
                            sonKeyAndXmlValMap.put(sonKey, val);
                            sonKeyAndXmlValMapList = new ArrayList<>();
                            sonKeyAndXmlValMapList.add(sonKeyAndXmlValMap);
                            jsonKeyAndXmlValMap.put(sonKeyPrefix, sonKeyAndXmlValMapList);
                        }
                    }
                }
            }
            LOG.info("在map中追加xml耗时：{}毫秒", System.currentTimeMillis() - st);
        } catch (Exception e) {
            throw e;
        } finally {
            if (document != null) {
                document.clearContent();
            }
        }
        return jsonKeyAndXmlValMap;
    }

    /**
     * 根据文档对象及xpath获取对应的内容
     *
     * @param document xml文档对象
     * @param xpath    xpath
     * @return
     * @throws DocumentException
     */
    private static String selectSingNodeVal(Document document, String xpath) throws DocumentException {
        String val;
        String[] tmpXpaths;
        if (xpath.indexOf(",") == -1) {
            val = XmlReaderUtils.selectSingleNodeVal(document, xpath);
        } else {
            //存在多个字段进行处理
            tmpXpaths = xpath.split(",");
            val = "";
            for (int i = 0; i < tmpXpaths.length; i++) {
                val += XmlReaderUtils.selectSingleNodeVal(document, tmpXpaths[i]);
                if (i < tmpXpaths.length - 1) {
                    val += "_";
                }
            }
        }
        return val;
    }
}
