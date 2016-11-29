package com.briup.ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
	
		FileOutputStream fos=null;
		try {
//			File file=new File("src/com/briup/ch11/a.txt");
//			fos=new FileOutputStream(file);
			fos=new FileOutputStream("src/com/briup/ch11/a.txt", true);
			fos.write(" briup".getBytes());
			fos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
