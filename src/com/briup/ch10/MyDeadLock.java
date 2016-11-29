package com.briup.ch10;

public class MyDeadLock implements Runnable{

	public boolean flag;
	private static Object o1=new Object();
	private static Object o2=new Object();
	@Override
	public void run() {
		if(flag==true){
			synchronized (o1) {
				System.out.println("o1被锁定");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("o2被锁定");
				}
			}
		}
		
		if(flag==false){
			synchronized (o2) {
				System.out.println("o2被锁定");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (o1) {
					System.out.println("o2被锁定");
				}
			}
			
		}
	}

	public static void main(String[] args) {
		MyDeadLock d1=new MyDeadLock();
		MyDeadLock d2=new MyDeadLock();
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		d1.flag=true;
		d2.flag=false;
		
		t1.start();
		t2.start();
		
	}
}
