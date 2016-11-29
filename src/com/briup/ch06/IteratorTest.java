package com.briup.ch06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add("hello");
		list.add("hello");
		list.add("hello");
		list.add("hello2");
		list.add("hello3");
		list.add("hello4");
		list.add("hello5");
		
//		Iterator it = list.iterator();
//		it.next();
//		it.remove();
//		while(it.hasNext()){
//			Object o = it.next();
//			System.out.println(o);
//		}
		
		
		ListIterator it = list.listIterator();
		while(it.hasNext()){
			String o = (String) it.next();
			if("hello".equals(o)){
				it.remove();
			}
			System.out.println(o);
		}
		
		System.out.println("==============");
		Iterator it2 = list.iterator();
		while(it2.hasNext()){
			Object o = it2.next();
			System.out.println(o);
		}
	}
}
