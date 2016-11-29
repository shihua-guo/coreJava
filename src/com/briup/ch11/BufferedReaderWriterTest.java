package com.briup.ch11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderWriterTest {

	public static void main(String[] args) throws Exception {
		
//		bufferReaderTest();
		bufferWriterTest();
		bufferreaderWriterTest();
	}

	private static void bufferWriterTest() throws IOException {
		FileWriter fw=new FileWriter("src/file");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("你好，很高兴认识你！");
		bw.flush();
		fw.close();
	}

	private static void bufferReaderTest() throws Exception {
		FileReader reader=new FileReader("src/com/briup/ch11/a.txt");
		
		BufferedReader br=new BufferedReader(reader);
		
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
		br.close();
		
	}

	private static void bufferreaderWriterTest() throws Exception {
		FileReader reader=new FileReader("src/com/briup/ch11/a.txt");
//		FileWriter fw=new FileWriter("src/file");
		PrintWriter pw=new PrintWriter("src/file1");
		BufferedReader br=new BufferedReader(reader);
//		BufferedWriter bw=new BufferedWriter(fw);
		
		String line=null;
		while((line=br.readLine())!=null){
			pw.println(line);
			pw.flush();
		}
		
		pw.close();
		
		
		/*String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();//换行
			bw.flush();
		}
		
		bw.close();*/
		br.close();
	}
}





