package com.briup.ch06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		Map map=new HashMap();
		map.put(1, "hello");
//		map.put(1, "hello2");
		map.put(3, "ls");
		map.put(4, "ww");
		map.put(2, "z53s");
		map.put(5, "zs7");
		map.put(12, "z5s");
		map.put(16, "zs4");
		map.put(13, "zs54");
		
		Set ens = map.entrySet();
		
		Iterator it3 = ens.iterator();
		while(it3.hasNext()){
			Entry  en=(Entry) it3.next();
			System.out.println(en.getKey()+"==="+en.getValue());
//			System.out.println(en.getClass());
		}
		
	System.out.println("-----------------------");	
		Collection coll = map.values();
		Iterator it2 = coll.iterator();
		while(it2.hasNext()){
			String value = (String) it2.next();
			System.out.println(value);
		}
		
		
		System.out.println("----------------------------");
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			Integer key = (Integer) it.next();
			String value = (String) map.get(key);
			System.out.println(key+"==="+value);
		}
		
//		map.put(null, "lihong");
//		Object o = map.get(null);
//		Object o = map.remove(1);
//		System.out.println(o);
		System.out.println(map);
//		boolean b = map.containsKey("ss");
//		System.out.println(b);
//		map.clear();
//		System.out.println(map.size());
		
//		Object o = map.get(4);
//		System.out.println(o);
		
	}
}
