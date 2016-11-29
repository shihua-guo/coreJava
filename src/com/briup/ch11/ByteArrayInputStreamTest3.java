package com.briup.ch11;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ByteArrayInputStreamTest3 {

	public static void main(String[] args) throws Exception {
		
		byte[] buf="helloworld".getBytes();
		
		InputStream in=new ByteArrayInputStream(buf);
		
		System.out.println("该流是否支持mark标记："+in.markSupported());
		
		int data=-1;
		while((data=in.read())!=-1){
			System.out.print((char)data+" ");
			if(101==data){
				in.mark(5);
			}
			if(119==data){
				in.reset();
			}
			Thread.sleep(1000);
		}
	
	}
}




