package com.briup.ch10;

public class StopTest extends Thread{

	private boolean stop;
	
	
	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public void run(){
		while(!stop){
			System.out.println("hello");
		}
	}
	
	public static void main(String[] args) {
		StopTest tt=new StopTest();
		tt.start();
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		stt.stop();
//		tt.setStop(true);
	}
}
