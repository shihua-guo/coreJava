package com.briup.ch06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.briup.bean.Student;

public class CollectionTest {

	public static void main(String[] args) {
		Collection coll=new ArrayList();
		Collection coll2=new ArrayList();
		
		coll.add("hello");
		coll.add(123);//new Integer(123)
		coll.add(true);//new Boolean(true);
		coll.add(new Long(1));
		coll.add(new Object());
		coll.add(new Student());//ctrl+shit+o
		
//		coll.remove(123);
//		System.out.println(coll);
//		System.out.println(coll.size());
		
	
		coll2.add("hello");
		coll2.add("world");
//		
//		coll.removeAll(coll2);
		
//		coll.addAll(coll2);

//		coll.clear();
//		boolean b = coll2.contains("hello");
//		boolean b = coll.containsAll(coll2);
//		boolean b = coll.isEmpty();
//		boolean b = coll.retainAll(coll2);
//		System.out.println(b);
//		Object[] str = coll2.toArray();
//		System.out.println(Arrays.toString(str));
		
		String[] str=new String[coll2.size()];
		Object[] s = coll2.toArray(str);
		System.out.println(Arrays.toString(s));
		
//		System.out.println(coll2);//快速移动一行代码，alt+down/up
//		System.out.println(coll);

	}
}





