package com.briup.ch06;

import com.briup.bean.Student;

public class BaseTest {

	//ctrl+alt+down
	//alt+/
	//ctrl+f11 或者 ctrl+f11 +fn
	public static void main(String[] args) {
		
		Student s1=new Student("zhangsan", 20);
		Student s2=new Student("lisi", 20);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s2.getClass());
		
		Object obj=new Student();
		System.out.println(obj.getClass());
		
	//快捷注释 ：ctrl+/
//		Student s3=null;
//		System.out.println(s3);
//		System.out.println(s3.toString());//null.xxx空指针异常
		
		int a=20;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		Integer aa=new Integer(a);
		Integer s=new Integer("123");
		System.out.println(aa);
		System.out.println(s);
		
		//Integer.valueOf()
		Integer x=20;//jdk1.5以上 自动装箱 Integer x=new Integer(20);
		
		System.out.println(x.intValue());
		
		int y=x;//自动拆箱    //int y=x.intValue();
		
		int t=Integer.compare(200, 100);
		System.out.println(t);
		
		String ss="12345";
		int q=Integer.parseInt(ss);
		System.out.println(q);
		
		Integer i = Integer.valueOf(q);
		System.out.println(i);
		
		int p=-1000;
		String b1=Integer.toBinaryString(p);
		System.out.println(b1);
		
	}

}




