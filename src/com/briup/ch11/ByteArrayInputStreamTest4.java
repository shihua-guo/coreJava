package com.briup.ch11;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ByteArrayInputStreamTest4 {

	public static void main(String[] args) {
		
		//流对象的声明：
		InputStream in=null;
		try {
			byte[] buf="helloworld".getBytes();
			//为流对象赋值，操作数据
			in=new ByteArrayInputStream(buf);
			System.out.println("该流是否支持mark标记："+in.markSupported());
			long num = in.skip(11);
			System.out.println("num="+num);
			int data = in.read();
			System.out.println((char)data);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	}
}




