package com.briup.ch10;

public class InterruptTest extends Thread{

	public void run(){
		for(int i=0;i<=100;i++){
			System.out.println(currentThread().getName()+"---"+i);
//			System.out.println("是否有人中断我："+interrupted());
			System.out.println("是否有人中断我："+isInterrupted());
//			try {
//				sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
	
	public static void main(String[] args) {
		InterruptTest tt=new InterruptTest();
		System.out.println(currentThread().getName()+"---hello");
		tt.start();
		try {
			sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tt.interrupt();
		System.out.println(currentThread().getName()+"---world");
	}
}
