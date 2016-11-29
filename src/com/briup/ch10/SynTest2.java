package com.briup.ch10;

public class SynTest2 {

	public static void main(String[] args) {
		MyThread2 t1=new MyThread2();
		MyThread2 t2=new MyThread2();
		
		t1.start();
		t2.start();
	}
}

class MyThread2 extends Thread{

	private static  int i;
	@Override
	public void run() {
		
			synchronized (MyThread2.class) {
				for (; i <= 10; i++) {
					System.out.println(currentThread().getName() + "---" + i);
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		
	}
}



