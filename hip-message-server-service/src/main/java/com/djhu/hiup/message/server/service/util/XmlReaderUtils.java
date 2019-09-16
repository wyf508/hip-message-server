package com.djhu.hiup.message.server.service.util;

import org.dom4j.*;
import java.util.HashMap;

/**
 * Created by jiangmei on 2018/4/26.
 */
public class XmlReaderUtils {

    /**
     * 获取节点中对应的内容
     * @param document
     * @param xpath
     * @return
     * @throws DocumentException
     */
    public static String selectSingleNodeVal(Document document,String xpath) throws DocumentException {
        Node node=document.selectSingleNode(xpath);
        return StringUtils.isEmpty(node)?"":node.getText();
    }

    /**
     * 获取节点中对应的内容
     * @param node
     * @param xpath
     * @return
     * @throws DocumentException
     */
    public static String selectSingleNodeVal(Node node,String xpath) throws DocumentException {
        Node tmplNode=node.selectSingleNode(xpath);
        return StringUtils.isEmpty(tmplNode)?"":tmplNode.getText();
    }

    /**
     * 当xpath中存在轴时，并且xml有命名空间，获取内容存在问题，该方法先预留，使用上面方法
     * @param document
     * @param xpath
     * @return
     * @throws DocumentException
     */
    public static String selectSingleNodeValBak(Document document,String xpath) throws DocumentException {
        String uri=document.getRootElement().getNamespaceURI();
        Node node=selectSingleNode(document.getRootElement(),uri,xpath);
        return StringUtils.isEmpty(node)?"":node.getText();
    }

    private static Node selectSingleNode(Node rootNode, String uri, String xpathStr) {
        XPath xPath = buildXpat(rootNode, uri, xpathStr);
        return xPath.selectSingleNode(rootNode);
    }

    private static XPath buildXpat(Node rootNode, String uri, String xpathStr) {
        HashMap nameSpaceMap = new HashMap();
        nameSpaceMap.put("xmlns", uri);
        String newXpathStr=formatXpath(xpathStr);
        XPath xPath = rootNode.createXPath(newXpathStr);
        xPath.setNamespaceURIs(nameSpaceMap);
        return xPath;
    }

    private static String formatXpath(String xpathStr) {
        return xpathStr.replaceAll("/(\\w)", "/xmlns:$1").replaceAll("^(\\w)", "xmlns:$1").replaceAll("(xmlns:(\\w{0,}-{0,}\\w{0,}::))", "$2");
    }

}
