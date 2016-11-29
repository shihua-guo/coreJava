package com.briup.ch10;

public class ThreadTest2 {

	public static void main(String[] args) {
		
		Thread t=new Thread(){
			public void run(){
				
			}
		};
		t.start();
		//------------------------------------------------
		new Thread(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
			}
			
		}.start();
		
		//-----------------------------------------------
		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				
			}
		});
		
		t2.start();
		//-----------------------------------------------
		new Thread(new Runnable() {
			@Override
			public void run() {
				
			}
		}).start();
		
	}
}
