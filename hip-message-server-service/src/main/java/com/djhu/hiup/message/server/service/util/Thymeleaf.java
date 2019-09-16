package com.djhu.hiup.message.server.service.util;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.FileTemplateResolver;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 * @author        jiangzhenjian  2016-5-28 下午02:13:29
 * @see          
 * @version       v1.0.0.1
 */
public class Thymeleaf {
	// html 文件路径
	private static final String PREFIX = "config/return_thymeleaf/";
	private static final String CHARENCODE = "UTF-8";
	private static final String SUFFIX=".xml";
	private static final String TEMPLATE_NAME="XDS.TEMPLATE";
	private static TemplateEngine templateEngine = new TemplateEngine();
	
	static {
		FileTemplateResolver resolver = new FileTemplateResolver();
		resolver.setTemplateMode("XML");
		//设置后缀
		resolver.setSuffix(SUFFIX);
		//设置路劲（前缀）
		// 获取当前程序所在目录
		String strPath = System.getProperty("user.dir");
		resolver.setPrefix(strPath+"/config/return_thymeleaf/");
		resolver.setCharacterEncoding(CHARENCODE);
		resolver.setCacheTTLMs(10000L);
		templateEngine.setTemplateResolver(resolver);
	}

	/*
	 * 	hName：模版html的名称
	 * 	html模版中需要填入的数据：th:text="${MEDICALINSTITUTIONS}"
	 * 	“MEDICALINSTITUTIONS”是data中的key，需要填入的数据就是value
	 *
	 * 	例如：模版中显示姓名：阿春  data：data.put("name","阿春") 模版中应用：th:text="${name}"
	 * 	返回：返回xml的String
	 */
	public static String transXml(Map<String, Object> dateMap, String templateName)  {
		if(StringUtils.isEmpty(templateName)){
			templateName="DEFAULT";
		}
		
//		TemplateEngine templateEngine = new TemplateEngine();
		
		Context ctx = new Context();
		ctx.setVariables(dateMap);
		return templateEngine.process(templateName, ctx);
	}

	/*
	 * 	hName：模版html的名称
	 * 	html模版中需要填入的数据：th:text="${MEDICALINSTITUTIONS}"
	 * 	“MEDICALINSTITUTIONS”是data中的key，需要填入的数据就是value
	 * 
	 * 	例如：模版中显示姓名：阿春  data：data.put("name","阿春") 模版中应用：th:text="${name}"
	 * 	返回：返回xml的String
	 */
	public static void saveXml(Map<String, Object> dateMap,String savePath) throws Exception{
		XMLWriter xmlWriter=null;
		FileOutputStream fos=null;
		try {
			ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
			resolver.setTemplateMode("XML");
			//设置后缀
			resolver.setSuffix(SUFFIX);
			//设置路劲（前缀）
			resolver.setPrefix(PREFIX);
			resolver.setCharacterEncoding(CHARENCODE);
			resolver.setCacheTTLMs(10000L);
			TemplateEngine templateEngine = new TemplateEngine();
			templateEngine.setTemplateResolver(resolver);
			Context ctx = new Context();
			ctx.setVariables(dateMap);
			String xmlStr = templateEngine.process(TEMPLATE_NAME, ctx);
			Document document = DocumentHelper.parseText(xmlStr);
			// dom4j提供了专门写入文件的对象XMLWriter
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding("UTF-8");
			fos = new FileOutputStream(new File(savePath));
			xmlWriter = new XMLWriter(fos, format);
			xmlWriter.write(document);
			fos.close();
		}catch (Exception e){
			throw e;
		}finally {
			if(xmlWriter!=null){
				xmlWriter.flush();
				xmlWriter.close();
			}
			if(StringUtils.isNotEmpty(fos)){
				fos.close();
			}
		}
	}
	
	public static void main(String[] args)throws  Exception{
		//设置需要传递给模板的参数
		Map<String, Object> dateMap = new HashMap<String, Object>();
		dateMap.put("receivedTime", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		String savePath="d:/1.xml";
		File file = new File(savePath);
		if (!file.exists()) {
			file.mkdirs();
		}
		Thymeleaf.saveXml(dateMap, savePath);
	}
	
}
