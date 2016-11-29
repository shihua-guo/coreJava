package com.briup.ch06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set set=new HashSet();
		
		set.add("hello");
		set.add("hello");
		set.add("briup");
		set.add("lihong");
		
/*		set.add(1);
		set.add(2);
		set.add(1);
		set.add(4);*/
		
		System.out.println(set.size());
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o);
		}
		
	}
}
