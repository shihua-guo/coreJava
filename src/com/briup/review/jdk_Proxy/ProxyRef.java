package com.briup.review.jdk_Proxy;

import java.lang.reflect.Proxy;

/*
 * 产生代理对象
 */
public class ProxyRef {
	public static void main(String[] args) {
//		Class d = UserDao.class; 
		Class c = UserDaoImpl.class;
		MyHandle handle  = new MyHandle();
		try {
			handle.setTarget(c.newInstance());
			UserDao u = (UserDao) 
					Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), handle);
			u.addUSer();
			u.delete();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


