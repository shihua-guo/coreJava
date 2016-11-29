package com.briup.ch06;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectTest {

	public static void main(String[] args)throws Exception {
		
		Worker w=new Worker();
		Class c = w.getClass();
//		Class c2 =Worker.class;
//		Class c3 =Class.forName("com.briup.ch06.Worker");
		
//		System.out.println(c==c2);
//		System.out.println(c2==c3);
//		System.out.println(c==c3);
		
		/*
		 * public Field[] getDeclaredFields()
		 * public Field getField(String name)
		 */
		
//		Field f = c.getField("name");
//		System.out.println(f.getModifiers());
//		System.out.println(f.getType());
//		System.out.println(f.getName());
//		System.out.println(f.get(w));
		
//		Field[] fs = c.getDeclaredFields();
//		for(Field f:fs){
//			f.setAccessible(true);
//			System.out.println(f.getModifiers());
//			System.out.println(f.getType());
//			System.out.println(f.getName());
//			System.out.println(f.get(w));
//			System.out.println("========");
//		}
		
		/**
		 * public Method[] getMethods()
		 * public Method getMethod(String name,
         *      Class<?>... parameterTypes)
         *    public Method[] getDeclaredMethods()
		 * 
		 */
		
//		Method m = c.getMethod("say");
		Method m = c.getMethod("show",String.class,int.class);
//		Class[] ts = m.getParameterTypes();
//		String name = m.getName();
//		int mod = m.getModifiers();
//		Class rt = m.getReturnType();
//		System.out.println(Arrays.toString(ts));
//		System.out.println(name);
//		System.out.println(mod);
//		System.out.println(rt);
//		m.invoke(w);
//		String s=(String) m.invoke(w, "hello",100);
//		System.out.println(s);
	
//		Worker w2 = (Worker) c.newInstance();
		Constructor con = c.getConstructor(String.class,int.class);
		Worker w2 = (Worker) con.newInstance("briup",10);
		System.out.println(w2);
		
		
	}
}

class Worker{
	public String name="zhangsan";
	private int age=20;
	
	public Worker() {
		System.out.println("hahah");
	}

	public Worker(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void say(){
		System.out.println("say.....");
	}
	
	public String show(String msg,int num){
		System.out.println("show....");
		return msg+","+num;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + "]";
	}
}
