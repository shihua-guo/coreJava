package com.briup.ch11;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RandomAccessFileTest {

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf=
				new RandomAccessFile("src/qq", "r");
//		byte b = raf.readByte();
//		byte b2 = raf.readByte();
//		byte b3 = raf.readByte();
//		
//		System.out.println((char)b);
//		System.out.println((char)b2);
//		System.out.println((char)b3);
//		raf.seek(18);
//		byte b = raf.readByte();
//		System.out.println((char)b);
		
//		byte[] buf=new byte[6];
//		int len = raf.read(buf);
//		System.out.println(Arrays.toString(buf));
//		System.out.println(new String(buf,0,len));
		System.out.println(raf.length());
		String line = raf.readLine();
		 line = raf.readLine();
		 long count=raf.getFilePointer();
		 raf.seek(count);
		 line=raf.readLine();
		 System.out.println(count);
		System.out.println(line);
		
		
	/*	RandomAccessFile raf=
				new RandomAccessFile("src/qq", "rw");
		raf.write("hello".getBytes());
		long point = raf.getFilePointer();
		System.out.println(point);
		raf.seek(point);
		raf.write("world".getBytes());
		 point = raf.getFilePointer();
		 raf.seek(point);
		 raf.write("你好".getBytes());
		 point = raf.getFilePointer();
		 System.out.println(point);
		 raf.seek(16);
		 raf.write("\r\n很高兴认识你".getBytes());
		raf.close();*/
	}
}
