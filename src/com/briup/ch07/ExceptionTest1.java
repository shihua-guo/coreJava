package com.briup.ch07;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
//		String s=null;
//		s.toLowerCase();
		
//		Class.forName("");
		
		ExceptionTest1 et=new ExceptionTest1();
		et.test();
		
	}
	
	public void test(){
		System.out.println("test2开始调用");
		test2();
		System.out.println("test2调用结束");
	}
	public void test2(){
		System.out.println("test3开始调用");
		test3();
		System.out.println("test3调用结束");
	}
	public void test3(){
		System.out.println("test4开始调用");
		test4();
		System.out.println("test4调用结束");
	}
	public void test4(){
		
		int a=10;
		int b=10/0;
	}
	
}
