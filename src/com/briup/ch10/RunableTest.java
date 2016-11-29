package com.briup.ch10;

public class RunableTest{
	
	public static void main(String[] args) {
		Runnable r=new MyThread();
		Thread t=new Thread(r);
		System.out.println(Thread.currentThread().getName()+"hello");
//		t.run();
		t.start();
		System.out.println(Thread.currentThread().getName()+"world");
	}
}


class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++){
			System.out.println(Thread.currentThread().getName()+"---"+i);
		}
	}
}
