package com.briup.ch11;

public class NumberThread2 {

	public static void main(String[] args) throws Exception {
		Thread t1 = new NumThread("线程1");
		Thread t2 = new NumThread("线程2");
		Thread t3 = new NumThread("线程3");
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		//new NumThread("线程4").start();
	}
}

class NumThread extends Thread{
	static int i=0;
	static int num1=0;
	static int num2=0;
	public NumThread(String string) {
		// TODO Auto-generated constructor stub
		this.setName(string);
	}
	
	@Override
	public void run() {
		
		synchronized (this.getClass()){
			System.out.println(Thread.currentThread().getName()+"占用了锁");
			while ( i <=30) {
			//	System.out.println(Thread.currentThread().getName()+"占用了锁");
				num1=i/5;
				num2=num1%3;
				if((Thread.currentThread().getName().equals("线程1")&&num2==0)||
					(Thread.currentThread().getName().equals("线程2")&&num2==1)||
					(Thread.currentThread().getName().equals("线程3")&&num2==2)){
					System.out.println(Thread.currentThread().getName() + "   " + ++i);
					System.out.println("i="+i);
					if(i%5==0){
						try {
		//					System.out.println("i对5取余等于0"+Thread.currentThread().getName()+"要睡眠了");
							this.getClass().notifyAll();
							this.getClass().wait();
							System.out.println("醒了"+Thread.currentThread().getName()+"	fy");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}else{
					try {
						Thread.sleep(3000);
						System.out.println("不符合条件"+Thread.currentThread().getName());
						this.getClass().notify();
						this.getClass().wait();
						System.out.println("醒了"+Thread.currentThread().getName()+"++++"+Thread.activeCount());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			System.out.println("这里被执行了");
			this.getClass().notify();
		}
	}
}
