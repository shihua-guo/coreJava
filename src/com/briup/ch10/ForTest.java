package com.briup.ch10;

public class ForTest {

	public static void main(String[] args) {
		ForTest ft=new ForTest();
		ft.test();
	}
	
	public void test(){
		int sum=0;
		for(int i=1;i<=100;i++){
			sum+=i;
		}
		System.out.println("sum="+sum);
	}
}
