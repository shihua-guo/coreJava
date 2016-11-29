package com.briup.ch11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TranStreamTest {

	public static void main(String[] args) throws Exception {
//		InputStreamReaderTest();
//		InputStreamWriterTest();
//		encodeReader();
		encodeWriter();
		
	}

	private static void encodeWriter() throws Exception {
		FileOutputStream fos=
				new FileOutputStream("src/haha");
		OutputStreamWriter osw=
				new OutputStreamWriter(fos, "gbk");
		osw.write("你好");
		osw.close();
		fos.close();
		
	}

	//设置编码格式
	private static void encodeReader() throws Exception {
		FileInputStream fis=
				new FileInputStream("src/haha");
		InputStreamReader isr=
				new InputStreamReader(fis,"GBK");
		
		char[] buf=new char[20];
		
		int len = isr.read(buf);
		
		System.out.println(new String(buf,0,len));
		
	}

	//将字节输出流转化为字符输出流
	private static void InputStreamWriterTest() throws Exception {
		
/*		BufferedReader br=
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream(
										new File(""))));
		
		PrintWriter pw=new PrintWriter(
				new OutputStreamWriter(
						new FileOutputStream(
								new File(""))), true);*/
		
		
		FileInputStream fis=
				new FileInputStream("src/file1");
		FileOutputStream fos=
				new FileOutputStream("src/out");
		
		InputStreamReader isr=
				new InputStreamReader(fis);
		
		OutputStreamWriter ow=
				new OutputStreamWriter(fos);
		
		BufferedReader br=
				new BufferedReader(isr);

		PrintWriter pw=new PrintWriter(ow, true);
		
		String line=null;
		while((line=br.readLine())!=null){
			pw.println(line);
		}
		
		pw.close();
		br.close();
	}

	//将字节输入流转化为字符输入流
	private static void InputStreamReaderTest() throws Exception {
		
		InputStream in=System.in;
		InputStreamReader isr=
				new InputStreamReader(in);
		BufferedReader br=
				new BufferedReader(isr);
		
		String line=null;
		while((line=br.readLine())!=null){
			if("over".equals(line)){
				break;
			}
			System.out.println(line.toUpperCase());
		}
		
		br.close();
	}
}



