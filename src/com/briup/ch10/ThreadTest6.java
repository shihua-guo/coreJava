package com.briup.ch10;

public class ThreadTest6 extends Thread{
	static int i=0;
	public void run(){
		//thread-0
		for(;i<=10;i++){
			System.out.println(currentThread().getName()+"---"+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadTest6 tt=new ThreadTest6();
		ThreadTest6 tt2=new ThreadTest6();
		System.out.println(currentThread().getName()+"---hello");
		tt.start();
		tt2.start();
		System.out.println(currentThread().getName()+"---world");
	}
}
