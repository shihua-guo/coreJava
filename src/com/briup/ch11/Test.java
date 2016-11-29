package com.briup.ch11;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		long start = System.currentTimeMillis();
		for(int i=0;i<5;i++){
			Thread.sleep(1000);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
	}
}
