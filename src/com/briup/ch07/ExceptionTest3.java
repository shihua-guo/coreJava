package com.briup.ch07;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionTest3 {

	public static void main(String[] args){
		ExceptionTest3 et=new ExceptionTest3();
		try {
			et.test();
		} catch (Exception e) {
				System.out.println(e.getMessage());
		}
		
	}

	public void test()throws Exception {
		
		try {
			
			throw new RuntimeException("哈哈，异常啦");
		} catch (Exception e) {
			//System.out.println(e.getMessage()+"===");
			throw new Exception("来捕捉异常啦");
		} 
//		System.out.println("sss");
	}
	
	
}
