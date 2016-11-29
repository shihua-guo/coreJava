package com.briup.ch10;

public class SynTest4 {

	public static void main(String[] args) {
		
		MyNum2 num=new MyNum2();
		
		MyThread4 t1=new MyThread4("线程1",num);
		MyThread4 t2=new MyThread4("线程2",num);
		
		t1.start();
		t2.start();
	}
}

class MyThread4 extends Thread{
	private MyNum2 my;
	
	public MyThread4() {
	}
	
	public MyThread4(String name,MyNum2 my){
		super(name);
		this.my=my;
	}
	
	@Override
	public void run() {
//		my.print();
		MyNum2.staticPrint();
	}
}

class MyNum2{
	private static int i;
	
	//锁对象是this
	public synchronized void print(){
			for (; i <= 20; i++) {
				System.out.println(Thread.currentThread().getName() + "-----"
						+ i);
//				if(i==10){
//					i++;
//					break;
//				}
			}
	}
	
	////锁对象是this.getClass()
	public static synchronized void staticPrint(){
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


