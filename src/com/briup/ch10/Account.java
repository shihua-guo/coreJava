package com.briup.ch10;

public class Account {
	//账号余额
	private int balance;
	
	public Account(int balnace) {
		this.balance = balnace;
	}
	
	
	//存钱
	public synchronized void pos(int money){
		this.balance+=money;
		String name = Thread.currentThread().getName();
		System.out.println(name+" 挣了"+money+"现在账号共有"+balance+"元");
		//wait方法和notifyAll方法都是调用锁对象中的,当前的所对象是this,所以直接调用当前对象this中的方法
		//如果所的是Class对象,那么就要调用Class对象的wait或者notifyAll方法
		this.notifyAll();
		
	}
	//消费
	public synchronized void wit(int money){
		while(balance-money<0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance-=money;
		String name = Thread.currentThread().getName();
		System.out.println(name+" 消费了"+money+"还剩下"+balance+"元");
		
	}
	
	
	/*
	public void pos(int money){
		this.balance+=money;
		String name = Thread.currentThread().getName();
		System.out.println(name+" 挣了"+money+"现在账号共有"+balance+"元");
		
	}
	public  void wit(int money){
		balance-=money;
		String name = Thread.currentThread().getName();
		System.out.println(name+" 消费了"+money+"还剩下"+balance+"元");
		
	}
   */
	
	
}
