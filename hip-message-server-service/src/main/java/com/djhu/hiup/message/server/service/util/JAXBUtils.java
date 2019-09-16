package com.djhu.hiup.message.server.service.util;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * jaxb xml解析器
 * @author mengbin.tang
 * @date:   2018年12月7日 下午2:16:39   
 */
public class JAXBUtils {
	
	private JAXBContext jaxbContext;
	private Marshaller marshaller;
	private Unmarshaller unmarshaller;
	
	/**预加载 class 用于较大较复杂的对象（这种对象加载较慢），该方式建议在方法对象创建时加载，或使用静态加载
	 * @param c
	 */
	public JAXBUtils(Class<?> c){
		try {
			init(c);
		} catch (Exception e) {
			throw new RuntimeException("JAXB初始化失败",e);
		}
	}
	
	public JAXBUtils() {
		
	}
	
	/**
	 * 初始化jaxb解析器
	 * @param c
	 * @throws JAXBException
	 */
	public void init(Class<?> c) throws JAXBException{
		jaxbContext = JAXBContext.newInstance(c);
		marshaller = jaxbContext.createMarshaller();
		unmarshaller = jaxbContext.createUnmarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
	}
	
	/**
	 * 对象转xml
	 * @param obj
	 * @param c
	 * @return
	 */
	public synchronized String marshaller(Object obj){
		String xml = null;
		StringWriter writer = null;
		long st = System.currentTimeMillis();
		try {
			writer = new StringWriter();
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
			marshaller.marshal(obj, writer);
			xml=writer.getBuffer().toString();
		} catch (JAXBException e) {
			throw new RuntimeException("JAXB生成xml对象时失败",e);
		}finally{
			try {
				if(writer!=null) {
					writer.close();
				}
			} catch (IOException e) {
				throw new RuntimeException("JAXB生成xml对象时失败",e);
			}
		}
		long ed = System.currentTimeMillis();
		return xml;
	}
	
	/**
	 * xml转对象
	 * @param message
	 * @param c
	 * @return
	 */
	public synchronized  Object unmarshaller(String message){
		Object obj = null;
		StringReader reader = null;
		try {
            reader = new StringReader(message);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            obj = unmarshaller.unmarshal(reader);
            reader.close();
		} catch (JAXBException e) {
			throw new RuntimeException("JAXB生成对象时失败",e);
		}finally{
			try {
				if(reader!=null) {
					reader.close();
				}
			} catch (Exception e) {
				throw new RuntimeException("JAXB生成对象时失败",e);
			}
		}
		return obj;
	}
	
	/**
	 * 对象转xml （指定对象类型）
	 * @param obj
	 * @param c
	 * @return
	 */
	public synchronized String marshaller(Object obj,Class c){
		String xml = null;
		StringWriter writer = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(c);
			Marshaller marshaller = jaxbContext.createMarshaller();
			writer = new StringWriter();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
			marshaller.marshal(obj, writer);
			xml=writer.getBuffer().toString();
		} catch (JAXBException e) {
			throw new RuntimeException("JAXB生成xml对象时失败（对象类型："+c.getSimpleName()+"）",e);
		}finally{
			try {
				if(writer!=null) {
					writer.close();
				}
			} catch (IOException e) {
				throw new RuntimeException("JAXB生成xml对象时失败",e);
			}
		}
		return xml;
	}
	
	/**
	 * xml转对象 （指定对象类型）
	 * @param message
	 * @param c
	 * @return
	 */
	public synchronized  Object unmarshaller(String message,Class c){
		Object obj = null;
		StringReader reader = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(c);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            reader = new StringReader(message);
            obj = unmarshaller.unmarshal(reader);
		} catch (JAXBException e) {
			throw new RuntimeException("JAXB生成对象时失败（对象类型："+c.getSimpleName()+"）",e);
		}finally{
			try {
				if(reader!=null) {
					reader.close();
				}
			} catch (Exception e) {
				throw new RuntimeException("JAXB生成对象时失败",e);
			}
		}
		return obj;
	}

	/**
	 * xml转换成object对象
	 * @param xml   xml内容
	 * @param cls   需要转换的目标类型
	 * @param <T>
	 * @return
	 * @throws Exception
	 */
	public <T> T xmlToObject(String xml,Class<T> cls) throws Exception{
		JAXBContext jaxbContext = JAXBContext.newInstance(cls);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		//XML节点中内容为空字符串处理
		unmarshaller.setListener(new Unmarshaller.Listener() {
			@Override
			public void afterUnmarshal(Object target, Object parent) {
				super.afterUnmarshal(target, parent);
				Field[] fields = target.getClass().getDeclaredFields();
				for (Field f : fields) {
					f.setAccessible(true);
					try {
						if (f.getType() == String.class && f.get(target) != null&& f.get(target).toString().trim().length()==0) {
							f.set(target, null);
						}
					} catch (IllegalAccessException e) {
						throw new RuntimeException("JAXB生成对象时失败",e);
					}
				}
			}
		});
		return (T)unmarshaller.unmarshal(new StringReader(xml.trim()));
	}

	/**
	 * 内容为null的话节点保留
	 */
	class MarshallerListener extends Marshaller.Listener{
		public static final String BLANK_CHAR = "";
		@Override
		public void beforeMarshal(Object source) {
			super.beforeMarshal(source);
			Field[] fields = source.getClass().getDeclaredFields();
			for (Field f : fields) {
				f.setAccessible(true);
				try {
					if (f.getType() == String.class && f.get(source) == null) {
						f.set(source, BLANK_CHAR);
					}
				} catch (IllegalAccessException e) {
					throw new RuntimeException("JAXB生成对象时失败",e);
				}
			}
		}
	}
}
