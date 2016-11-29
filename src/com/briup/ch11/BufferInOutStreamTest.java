package com.briup.ch11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInOutStreamTest {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			
			fis=new FileInputStream("src/com/briup/ch11/a.txt");
			fos=new FileOutputStream("src/com/briup/ch11/b.txt");
			
			BufferedInputStream bis=
					new BufferedInputStream(fis);
			BufferedOutputStream bos=
					new BufferedOutputStream(fos);
			
			byte[] buf=new byte[1024];
			int len=0;
			long start=System.currentTimeMillis();
			while((len=bis.read(buf))!=-1){
				bos.write(buf, 0, len);
				bos.flush();
			}
			long end=System.currentTimeMillis();
			System.out.println(end-start);
		/*	fis=new FileInputStream("src/com/briup/ch11/a.txt");
			fos=new FileOutputStream("src/com/briup/ch11/b.txt");
			byte[] buf=new byte[1024];
			int len=0;
			long start=System.currentTimeMillis();
			while((len=fis.read(buf))!=-1){
				fos.write(buf, 0, len);
				fos.flush();
			}
			long end=System.currentTimeMillis();
			System.out.println(end-start);//47
*/			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(fos!=null){
					fos.close();
				}
				if(fis!=null){
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
