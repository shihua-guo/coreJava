package com.briup.ch11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("src/com/briup/ch11/a.txt");
			fos=new FileOutputStream("src/com/briup/ch11/b.txt");
			int bs = fis.available();
			fis.skip(bs/2+10);
			byte[] buf=new byte[50];
			int len=0;
			while((len=fis.read(buf))!=-1){
				fos.write(buf, 0, len);
				fos.flush();
			}
			
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
