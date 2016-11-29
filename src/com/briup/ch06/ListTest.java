package com.briup.ch06;

import java.util.LinkedList;

public class ListTest {

	public static void main(String[] args) {
//		List list = new ArrayList();
//		LinkedList list = new LinkedList();
		Queue list=new Queue();
		list.add("hello");
		list.add("world");
		list.add("haha");
		list.add("sss");
		list.add("ttt");
		list.add("briup");
		
		while(!list.isNull()){
			Object o = list.get();
			System.out.println(o);
		}
		
//		list.addFirst("lihong");
//		list.addLast("kkkk");
		
//		Object o = list.getFirst();
//		Object o2 = list.getLast();
		
//		Object o = list.removeFirst();
//		Object o2 = list.removeLast();
//		
//		System.out.println(o);
//		System.out.println(o2);
//		System.out.println(list);
//		Object o = list.set(0, "lihong");
//		System.out.println(o);
//		List list2 = list.subList(2,list.size());
//		System.out.println(list);
//		System.out.println(list2);
		
//		ListIterator listit = list.listIterator();
//		while (listit.hasNext()) {
//			Object o = listit.next();
//			System.out.println(o);
//		}
//		System.out.println(list);
//		System.out.println("--------------");
//		listit.add("lihong");
//		listit.remove();
//		while (listit.hasPrevious()) {
//			Object o = listit.previous();
//			System.out.println(o);
//		}
		
//		System.out.println(list);
		

		// System.out.println(list.size());
		// int index = list.indexOf("xxx");
		// int index = list.lastIndexOf("haha");
		// System.out.println(index);

		// Object o = list.get(3);
		// Iterator it = list.iterator();
		// while(it.hasNext()){
		// Object o = it.next();
		// System.out.println(o);
		// }

		// ctrl+/单行注释
		// ctrl+shift+/多行注释 ctrl+shift+\ 解除多行注释
		/*
		 * for(Iterator it=list.iterator();it.hasNext();){ Object o = it.next();
		 * System.out.println(o); }
		 */

		/*
		 * for (int i = 0; i <list.size(); i++) { Object o = list.get(i);
		 * System.out.println(o); }
		 */

		// System.out.println(o);

	}
}
