package com.briup.ch11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class OutputStreamTest {

	public static void main(String[] args) throws Exception {
	
		OutputStream out=System.out;
		InputStream in=System.in;
		int len=0;
		byte[] buf=new byte[10];
		while((len=in.read(buf))!=-1){
			System.out.println("len="+len);
			String s=new String(buf,0,len-2);
			if("over".equals(s)){
				break;
			}
			out.write(buf, 0, len);
			out.flush();
		}
		
//		byte[] b=new byte[10];
//		b[0]=104;
//		out.write(b,0,1);
//		out.flush();
//		System.out.println(Arrays.toString(b));
		/*OutputStream out=System.out;
		System.out.println(out.getClass());
		out.write("hello".getBytes());
		out.write("hello".getBytes(),2,3);
		out.write(97);
		out.flush();
		out.close();*/
	}
}
