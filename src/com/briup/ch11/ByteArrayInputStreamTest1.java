package com.briup.ch11;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ByteArrayInputStreamTest1 {

	public static void main(String[] args) throws Exception {
		
		byte[] buf="helloworld".getBytes();
		
//		System.out.println((char)97);
//		System.out.println(Arrays.toString(buf));
		
		InputStream in=new ByteArrayInputStream(buf);
		
//		int data = in.read();
//		System.out.println((char)data);
//		int len = in.read(buf);
		
//		System.out.println((char)11);
		
//		int data=-1;
//		while((data=in.read())!=-1){
//			System.out.println((char)data);
//		}
		
		
//		byte[] b=new byte[15];
//		System.out.println(Arrays.toString(b));
//		int len = in.read(b,2,12);
//		System.out.println("len="+len);
//		System.out.println(Arrays.toString(b));
//		System.out.println(new String(b,0,12));
		
//		int len = in.read();
//		int len = in.read(buf);
//		int len = in.read(buf,3,6);
//		System.out.println(Arrays.toString(buf));
//		System.out.println("len="+len);
		
	
//		byte[] b="中".getBytes("utf-8");
//		System.out.println(new String(b,0,b.length));
		
	}
}




