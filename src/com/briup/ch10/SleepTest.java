package com.briup.ch10;

public class SleepTest extends Thread{

	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println(currentThread().getName()+"---"+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		SleepTest tt=new SleepTest();
		System.out.println(currentThread().getName()+"---hello");
		tt.start();
		try {
			sleep(11000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(currentThread().getName()+"---world");
	}
}
