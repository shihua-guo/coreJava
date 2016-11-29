package com.briup.ch06;

import java.util.LinkedList;

public class Queue {

	private LinkedList list;
	
	public Queue() {
		list=new LinkedList();
	}
	
	/**
	 * 放数据
	 * @param obj
	 */
	public void add(Object obj){
		list.add(obj);
	}
	
	/**
	 * 获取元素
	 * @return
	 */
	public Object get(){
		return list.removeFirst();
	}
	
	public boolean isNull(){
		return list.isEmpty();
	}
}
