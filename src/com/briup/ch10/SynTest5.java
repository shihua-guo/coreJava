package com.briup.ch10;

public class SynTest5 {

	public static void main(String[] args) {


		MyThread5 t1 = new MyThread5("线程1");
		MyThread5 t2 = new MyThread5("线程2");

		t1.start();
		t2.start();
	}
}

class MyThread5 extends Thread {

	private static int i;

	public MyThread5(String name) {
		super(name);
	}

	@Override
	public void run() {
		synchronized (this.getClass()) {
			for (; i <= 20; i++) {
				System.out.println(Thread.currentThread().getName() + "-----"
						+ i);
				if(i==10){
					try {
						this.getClass().notify();
						this.getClass().wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				this.getClass().notify();
			}
		}
	}
}

