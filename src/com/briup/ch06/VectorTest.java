package com.briup.ch06;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
//		List list=new Vector();
		Vector list=new Vector();
		
		list.add("hello");
		list.add("briup");
		list.add("world");
		list.add("xxx");
	
		
		Enumeration en = list.elements();
		while(en.hasMoreElements()){
			Object o = en.nextElement();
			System.out.println(o);
		}
		
//		Iterator it = list.iterator();
//		while(it.hasNext()){
//			Object o = it.next();
//			System.out.println(o);
//		}
		
		
	}
}




