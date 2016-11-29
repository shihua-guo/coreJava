package com.briup.ch11;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) throws Exception {
		
		InputStream in=System.in;
//		System.out.println(in.getClass());
//		System.out.println("aa\rbb");
//		\r回车   \n换行
/*		int data = in.read();
		System.out.println("data="+data);
		data = in.read();
		System.out.println("data="+data);
		data = in.read();
		System.out.println("data="+data);
		data = in.read();
		System.out.println("data="+data);
		data = in.read();
		System.out.println("data="+data);*/
		
		
		int data=-1;
		while((data=in.read())!=-1){
			System.out.println("data="+data);
		}
		
		
	}
}




