package com.briup.ch10;

public class JoinTest extends Thread{

	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println(currentThread().getName()+"---"+i);
			//	throw new RuntimeException("哈哈");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		JoinTest tt=new JoinTest();
		System.out.println(currentThread().getName()+"---hello");
		tt.start();
		try {
			//main线程执行这句代码，main线程阻塞，
			//等待tt开启的这个线程执行完，main再执行
			tt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(currentThread().getName()+"---world");
	}
}
