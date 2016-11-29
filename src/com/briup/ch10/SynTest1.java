package com.briup.ch10;

public class SynTest1 {

	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		MyThread1 t2=new MyThread1();
		
		t1.start();
		t2.start();
	}
}

class MyThread1 extends Thread{

	private static  int i;
	private static Object o=new Object();
	@Override
	public void run() {
		
			synchronized (MyThread1.class) {
				for (; i <= 10; i++) {
					System.out.println(currentThread().getName() + "---" + i);
				}
			}
		
	}
}



