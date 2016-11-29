package com.briup.review.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Compare {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new MyComparator());
		set.add("afdsf");
		set.add("ab");
		set.add("aff");
		set.add("a");
		Iterator i = set.iterator();
		while(i.hasNext()){
			String str = (String) i.next();
			System.out.println(str);
		}
	}
}
class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()>o2.length()){
			System.out.print(o1+">"+o2);
			return 1;
		}
		else{
			System.out.println(o1+"<"+o2);
			return -1;
		}
	}
	
}
