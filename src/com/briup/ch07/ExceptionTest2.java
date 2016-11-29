package com.briup.ch07;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionTest2 {

	public static void main(String[] args){
		ExceptionTest2 et=new ExceptionTest2();
//		et.test();
		int num=et.show2();
		System.out.println(num);
		
	}
	
	public int show2() {
		try{
			Class.forName("");
			//return 0;
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			//return 1;
		}finally{
			System.out.println("ssss");
			//return -1;
		}	
		System.out.println("haha");
		return 100;
	}

	
	public void show() {
		try{
			Class.forName("");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			System.out.println("ssss");
		}	
	}

	public void test(){
		try{
			Class.forName("");
			System.out.println("ssss");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public void test2(){
		try{
			Class.forName("");
			FileInputStream fis=null;
			fis.read();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			//....
		}catch(IOException e2){
			e2.printStackTrace();
			//....
		}
	}
		public void test3(){
			try{
				Class.forName("");
				FileInputStream fis=null;
				fis.read();
			}catch(ClassNotFoundException | IOException e){
				e.printStackTrace();
				//....
			}
	}
		
	public void test4(){
			try{
				Class.forName("");
				FileInputStream fis=null;
				fis.read();
			}catch(ClassNotFoundException e){
				e.printStackTrace();
				//....
			}catch(Exception e2){
				e2.printStackTrace();
				//....
			}
	}
	public void test5(){
		try{
			Class.forName("");
			FileInputStream fis=null;
			fis.read();
		}catch(Exception e2){
			e2.printStackTrace();
		}
}
}
