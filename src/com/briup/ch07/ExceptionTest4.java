package com.briup.ch07;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionTest4 {

	public static void main(String[] args){
		ExceptionTest4 et=new ExceptionTest4();
		
		/*try {
			et.login("tom", "123");
		} catch (UserException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}*/
		et.test(10);
	}

	public void test(int num){
		System.out.println("hello");
		assert num>10:"输入的值必须大于10";
		System.out.println("sss");
	}
	
	public void login(String name,String passwd)throws UserException{
		
		if(!"tom".equals(name)){
			throw new UserException("username error!!");
		}
		if(!"123".equals(passwd)){
			throw new UserException("passwd error!!");
		}
		
	}
	
}
