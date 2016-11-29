package com.briup.review.jdk_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandle implements InvocationHandler  {
	private Object target;
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//实现类的方法镜像,obj:目标对象，存放的是对象。
		//调用前
		System.out.println("i am before");
		//调用目标对象
		Object o  = method.invoke(target, args);//方法的返回类型
		System.out.println("i am after");
		return o;//返回方法的返回类型
	}
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
}