package com.briup.ch06;

import java.util.ArrayList;
import java.util.List;

public class ForTest {

	public static void main(String[] args) {
		int[] arr={1,34,4,23,67};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		for(int i:arr){
//			System.out.println(i);
//		}
		
		List list=new ArrayList();
		list.add("oo");
		list.add(123);
		list.add(true);
		list.add(new Object());
		
		for(Object obj:list){
			System.out.println(obj);
		}
		
		
	}
}
