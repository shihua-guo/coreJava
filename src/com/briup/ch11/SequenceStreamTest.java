package com.briup.ch11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * 将多个源串联起来（合并成一个），操作便捷
 * @author lihong
 *
 */
public class SequenceStreamTest {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis1=
				new FileInputStream("src/com/briup/ch11/a.txt");
		FileInputStream fis2=
				new FileInputStream("src/com/briup/ch11/c.properties");
		FileInputStream fis3=
				new FileInputStream("src/haha");
		
		Vector<FileInputStream> v=new Vector<FileInputStream>();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		
		Enumeration<FileInputStream> en = 
				v.elements();
		SequenceInputStream sis=
				new SequenceInputStream(en);
		
		BufferedOutputStream bos=
				new BufferedOutputStream(
						new FileOutputStream("src/test.txt"));
		
		byte[] buf=new byte[1024];
		int len=0;
		while((len=sis.read(buf))!=-1){
			bos.write(buf, 0, len);
			bos.flush();
		}
		
		bos.close();
		sis.close();
		fis3.close();
		fis2.close();
		fis1.close();
		
	}
	
}





