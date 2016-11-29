package com.briup.ch11;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ByteArrayInputStreamTest2 {

	public static void main(String[] args) throws Exception {
		
		byte[] buf="helloworld".getBytes();
		
		InputStream in=new ByteArrayInputStream(buf);
		
		System.out.println("该流是否支持mark标记："+in.markSupported());
		
		int data = in.read();
		System.out.println((char)data);
		System.out.println("标记开始");
		in.mark(5);
		data = in.read();
		System.out.println((char)data);
		data = in.read();
		System.out.println((char)data);
		data = in.read();
		System.out.println((char)data);
		in.reset();
		System.out.println("重置结束");
		data = in.read();
		System.out.println((char)data);
		
		/*in.read();
		in.read();
		in.read();
		in.read();
		in.read();
		in.read();
		in.read();
		in.read();
		in.read();
		in.read();
		
		int len = in.available();
		
		System.out.println("data="+len);*/
		
	}
}




