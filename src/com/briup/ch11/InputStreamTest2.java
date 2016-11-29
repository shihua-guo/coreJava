package com.briup.ch11;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest2 {

	public static void main(String[] args) throws Exception {
		
		InputStream in=System.in;
		int data=-1;
		//bye  98121101
		String s="";
		while((data=in.read())!=-1){
			System.out.println("data="+data);
			
			if(data==13){
				if("98121101".equals(s)){
					break;
				}else{
					s="";
				}
			}
			if(data!=13 && data!=10){
				s+=data;
			}
			System.out.println("s="+s);
		}
		
		
	}
}




