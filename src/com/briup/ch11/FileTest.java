package com.briup.ch11;

import java.io.File;
import java.io.FilenameFilter;
public class FileTest {

	public static void main(String[] args) throws Exception {
//		File file=new File("src\\com\\briup\\ch11\\a.txt");
//		File file=new File("d:/a/b/a.txt");
//		File file=new File("d:/a", "a.txt");
		File file=new File("src/com/briup/ch11/a.txt");
		System.out.println(file);
		boolean b = file.exists();
		System.out.println(b);
		if(!b){
			file.createNewFile();
		}
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
/*		if(b){
			file.delete();
		}
*/	
	
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getAbsoluteFile().toString());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getParentFile());
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		System.out.println(file.length());
		System.out.println("============================");	
		
		File pf = file.getParentFile();
		String[] list = pf.list();
		for(String s:list){
			System.out.println(s);
		}
		System.out.println("++++++++++++++++++++++++");
		
		String[] list2 = pf.list(new FilenameFilter(){

			@Override
			public boolean accept(File dir, String name) {
//				return name.endsWith("java");
				return name.startsWith("Byte");
			}
		});
		
		for(String s:list2){
			System.out.println(s);
		}
		
		
		
	}
}



