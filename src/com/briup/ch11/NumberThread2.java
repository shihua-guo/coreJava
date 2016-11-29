package com.briup.ch11;

public class NumberThread2 {

	public static void main(String[] args) throws Exception {
		Thread t1 = new NumThread("�߳�1");
		Thread t2 = new NumThread("�߳�2");
		Thread t3 = new NumThread("�߳�3");
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		//new NumThread("�߳�4").start();
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
			System.out.println(Thread.currentThread().getName()+"ռ������");
			while ( i <=30) {
			//	System.out.println(Thread.currentThread().getName()+"ռ������");
				num1=i/5;
				num2=num1%3;
				if((Thread.currentThread().getName().equals("�߳�1")&&num2==0)||
					(Thread.currentThread().getName().equals("�߳�2")&&num2==1)||
					(Thread.currentThread().getName().equals("�߳�3")&&num2==2)){
					System.out.println(Thread.currentThread().getName() + "   " + ++i);
					System.out.println("i="+i);
					if(i%5==0){
						try {
		//					System.out.println("i��5ȡ�����0"+Thread.currentThread().getName()+"Ҫ˯����");
							this.getClass().notifyAll();
							this.getClass().wait();
							System.out.println("����"+Thread.currentThread().getName()+"	fy");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}else{
					try {
						Thread.sleep(3000);
						System.out.println("����������"+Thread.currentThread().getName());
						this.getClass().notify();
						this.getClass().wait();
						System.out.println("����"+Thread.currentThread().getName()+"++++"+Thread.activeCount());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			System.out.println("���ﱻִ����");
			this.getClass().notify();
		}
	}
}
