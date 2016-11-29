package com.briup.ch10;

public class ThreadTest1 extends Thread{

	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println(currentThread().getName()+"---"+i);
		}
	}
	
	public static void main(String[] args) {
		ThreadTest1 tt=new ThreadTest1();
		//1.主线程开启一个新的线程
		//2.由新线程执行线程类中的run方法
		System.out.println(currentThread().getName()+"---hello");
		tt.start();
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		tt.run();
		System.out.println(currentThread().getName()+"---world");
	}
}
