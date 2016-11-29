package com.briup.ch06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionTest2 {

	public static void main(String[] args) {
		
//		Collection coll=new ArrayList();
//		Collection coll=new LinkedList();
//		Collection coll =new HashSet();
		Collection coll=new TreeSet();
		coll.add("hello");
		coll.add("world");
		coll.add("xxx");
		coll.add("ttt");
		
		//迭代器
		Iterator it = coll.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o);
		}
		
		
		
	}
}
