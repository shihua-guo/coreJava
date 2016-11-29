package com.briup.ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest {

	public static void main(String[] args) throws Exception {
//		fileReaderTest();
//		fileWriterTest();
		readerWriterTest();
	}

	private static void readerWriterTest() throws Exception {
		FileReader reader=new FileReader("src/com/briup/ch11/a.txt");
		FileWriter fw=new FileWriter("src/file");
		int len=0;
		char[] buf=new char[1024];
		while((len=reader.read(buf))!=-1){
			fw.write(buf, 0, len);
		}
		fw.close();
		reader.close();
	}

	private static void fileWriterTest() throws Exception {
		
		FileWriter fw=new FileWriter("src/file");
		fw.write("hello,world");
		fw.write("briup".toCharArray());
		fw.close();
		
	}

	
	private static void fileReaderTest() throws Exception {
		FileReader reader=new FileReader("src/com/briup/ch11/a.txt");
		int len=0;
		char[] c=new char[1024];
		while((len=reader.read(c))!=-1){
			System.out.println(new String(c,0,len));
		}
		
		
//		char c = (char) reader.read();
//		char[] c=new char[10];
//		int len = reader.read(c);
//		char[] c=new char[20];
//		int len = reader.read(c,2,10);
//		System.out.println(new String(c,2,len));
//		System.out.println("====="+c);
		
		reader.close();
		
	}
}





