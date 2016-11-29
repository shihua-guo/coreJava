package com.briup.ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamTest {

	public static void main(String[] args) {
			InputStream in=null;
			OutputStream out=null;
				try {
					in=new FileInputStream("src/com/briup/ch11/a.txt");
					out=System.out;
			
				 byte[] buf=new byte[1024];
					int len=0;
					long start = System.currentTimeMillis();
					while((len=in.read(buf))!=-1){
						out.write(buf, 0, len);
						out.flush();
					}
					long end = System.currentTimeMillis();
					System.out.println(end-start);
					
				/*	int data=-1;
					long start = System.currentTimeMillis();
					while((data=in.read())!=-1){
						out.write(data);
						out.flush();
					}
					long end = System.currentTimeMillis();
					System.out.println(end-start);//1968
				 */					
				/*	byte[] buf=new byte[1024];
					int len = in.read(buf);
					out.write(buf, 0, len);
					System.out.println("-----------------");
					out.flush();*/
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
