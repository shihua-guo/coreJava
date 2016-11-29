package com.briup.ch06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GenericTest3 {

	public void test(List<? extends Number> list){
		
	}
	public void test2(List<? super Number> list){
		
	}
	public static void main(String[] args) {
		GenericTest3 g3=new GenericTest3();
		g3.test2(new ArrayList<Object>());
		
		List<String> list=new ArrayList<String>();
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "hello");
		map.put(2, "hello2");
		map.put(3, "hello3");
		map.put(4, "hello4");
		
		Set<Entry<Integer, String>> en = map.entrySet();
		for(Entry<Integer, String> e:en){
			System.out.println(e.getKey()+"==="+e.getValue());
		}
		
//		Collection<String> coll = map.values();
//		for(String s:coll){
//			System.out.println(s);
//		}
		
		
	}
}
