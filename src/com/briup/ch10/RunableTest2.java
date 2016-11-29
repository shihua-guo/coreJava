package com.briup.ch10;

import javax.swing.plaf.SliderUI;

public class RunableTest2{
	
	public static void main(String[] args) {
		Runnable r=new RunImp();
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		System.out.println(Thread.currentThread().getName()+"hello");
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName()+"world");
	}
}


class RunImp implements Runnable{
	int i=0;
	@Override
	public void run() {
		for(;i<=10;i++){
			System.out.println(Thread.currentThread().getName()+"---"+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
