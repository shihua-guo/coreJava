package com.briup.ch11;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayOutputStreamTest {

	public static void main(String[] args) throws Exception {
	
//		OutputStream out=new ByteArrayOutputStream();
		ByteArrayOutputStream out=
				new ByteArrayOutputStream();
		
		out.write("hello".getBytes());
		for(int i=1;i<=100;i++){
			out.write(104);
		}
		byte[] arr = out.toByteArray();
		System.out.println(out.size());
		System.out.println(Arrays.toString(arr));
		out.flush();
	}
}
