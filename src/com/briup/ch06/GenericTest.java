package com.briup.ch06;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("hello");
		list.add(true);
		list.add(123);
		list.add(new Object());
		
//		for(Object obj:list){
//			String s=(String)obj;
//			System.out.println(s);
//		}
		
		List<String> list2=new ArrayList<String>();
		list2.add("hello");
		list2.add("hello2");
		list2.add("hello4");
		list2.add("hello3");
//		
//		for(String s:list2){
//			System.out.println(s);
//		}
		
	}
}
