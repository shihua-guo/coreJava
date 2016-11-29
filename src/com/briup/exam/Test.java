package com.briup.exam;

public class Test {
	public static void method(byte x, double y) {
		double a = (short) x / y * 2;
		float f = 1;
		double f1 = 1;
		int i = 23;
final int  i2 =22;
		int j = 3 & ++i;
		System.out.println("i:" + i + "  j:" + j);
	}
public void Test(){}
	public static int method1(){
		int num=10;
	    try{
	        if(num<20){
               System.out.print("num is 10.");
	           return num;
	        }
	        num=40;
	    }catch(Exception e){
            System.out.print("num is 50.");
	     	num = 50;
	    }finally{
	      num=60;
	      System.out.print("num is 60.");
	    }
	    return num;
	}

	public static void main(String[] args) {
		method((byte) 1, 1);
		int num = method1();
		System.out.println(num);
		int  total=0;
		for(int  i=0;i<4;i++) {
		  if(i==1)continue;
		  if(i==2)break;
		  total +=i;
		}
		System.out.println("total:"+total);

		String str1 = "hello";
		String str2 = "he" + "llo";
		String str3 = new String("hello");
		System.out.println(str1 == str2);
		System.out.println(str3 == str2);
		
		num=900999999;
		int k = 2;
		System.out.print(num+"=");

		for(;k<=num;k++){
			while(k!=num){
				if(num%k==0){
					System.out.print(k+"*");
					num = num/k;
				}else
					break;
			}
		}
		System.out.print(k-1);
		System.out.println();
		String str = null;
		str.length();
	}
}
