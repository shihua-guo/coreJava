package com.briup.ch11;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayOutputStreamTest2 {

	public static void main(String[] args) throws Exception {
	
		ByteArrayOutputStream out=
				new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(out);
		dos.writeInt(100);
//		System.out.println(new String(out.toByteArray()));
		out.flush();
		//读取
		ByteArrayInputStream bis=new ByteArrayInputStream(out.toByteArray());
		DataInputStream dis=new DataInputStream(bis);
		int data = dis.readInt();
		System.out.println(data);
		
		dis.close();
		dos.close();
		
	}
}
