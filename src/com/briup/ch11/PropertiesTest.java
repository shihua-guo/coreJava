package com.briup.ch11;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws Exception {

		Properties prop = System.getProperties();
		
		Enumeration<String> en = (Enumeration<String>) prop.propertyNames();
		while(en.hasMoreElements()){
			String key = en.nextElement();
			String value=prop.getProperty(key);
			System.out.println("key="+key+",value="+value);
		}
		
//		Properties prop=new Properties();
//		
//		FileInputStream fis=new FileInputStream("src/com/briup/ch11/c.txt");
//		prop.load(fis);
//		
//		prop.setProperty("sex", "male");
//		
//		FileOutputStream fos=new FileOutputStream("src/com/briup/ch11/c.txt");
//		prop.store(fos, "hehe.........");
//		
//		prop.list(System.out);
//		
//		prop.setProperty("age", "20");
//		prop.setProperty("name", "zhangsan");
//		prop.setProperty("school", "河南大学");
		
//		prop.list(System.out);
		
//		String age = prop.getProperty("age");
//		System.out.println("age="+age);
		
	/*	Enumeration<String> en = (Enumeration<String>) prop.propertyNames();
		while(en.hasMoreElements()){
			String key = en.nextElement();
			String value=prop.getProperty(key);
			System.out.println("key="+key+",value="+value);
		}*/
		
	/*	Set<Object> set = prop.keySet();
		for(Object obj:set){
			String key=(String) obj;
			String value = prop.getProperty(key);
			System.out.println("key="+key+",value="+value);
		}*/
		
	}
}



