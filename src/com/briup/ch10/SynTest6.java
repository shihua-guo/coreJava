package com.briup.ch10;

public class SynTest6 {

	public static void main(String[] args) {


		MyThread6 t1 = new MyThread6("线程1");
		MyThread6 t2 = new MyThread6("线程2");
		MyThread6 t3 = new MyThread6("线程3");

		t1.start();
		t2.start();
		t3.start();
	}
}

class MyThread6 extends Thread {

	private static int i;
	private static int count;

	public MyThread6(String name) {
		super(name);
	}

	@Override
	public void run() {
		synchronized (this.getClass()) {
			for (; i <= 20;) {
				System.out.println(Thread.currentThread().getName() + "-----"
						+ (i++));
				count++;
				if(count==3){
					count=0;
					try {
						this.getClass().notifyAll();
						this.getClass().wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				this.getClass().notifyAll();
			}
		}
	}
}

