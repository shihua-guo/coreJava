package com.briup.ch10;

public class SynTest3 {

	public static void main(String[] args) {
		
		MyNum num=new MyNum();
		
		MyThread3 t1=new MyThread3("线程1",num);
		MyThread3 t2=new MyThread3("线程2",num);
		
		t1.start();
		t2.start();
	}
}

class MyThread3 extends Thread{
	private MyNum my;
	
	public MyThread3() {
	}
	
	public MyThread3(String name,MyNum my){
		super(name);
		this.my=my;
	}
	
	@Override
	public void run() {
		my.print();
	}
}

class MyNum{
	private int i;
	public void print(){
		synchronized (this) {
			for (; i <= 20; i++) {
				System.out.println(Thread.currentThread().getName() + "-----"
						+ i);
				if(i==10){
					i++;
					break;
				}
			}
		}
	}
	
}


