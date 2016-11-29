package com.briup.ch06;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map map=new TreeMap();
		
		map.put(new Person("briup", 20),"hs");
		map.put(new Person("briup", 20),"ws");
		map.put(new Person("briup", 20),"ls");
		map.put(new Person("briup", 20),"hello");
		
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			Object key =  it.next();
			Object value= map.get(key);
			System.out.println(key+"==="+value);
		}
	}
}
