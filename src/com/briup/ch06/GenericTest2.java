package com.briup.ch06;

import java.util.ArrayList;
import java.util.List;

public class GenericTest2 {

	public void test(Point p){
		
	}
	public void test2(Point<Integer> p){
		
	}
	public void test3(Point<String> p){
		
	}
	public void test4(Point<?> p){
		
	}
	
	public void test5(List<?> list){
			//list.add("sss");//error
	}
	public static void main(String[] args) {
		GenericTest2 g2=new GenericTest2();
		g2.test5(new ArrayList<String>());
	}
	
}


class Point<T>{
	T x;
	T y;
	
	public void setX(T x){
		this.x=x;
	}
	public T getX(){
		return this.x;
	}
	public void setY(T y){
		this.y=y;
	}
	public T getY(){
		return this.y;
	}
}
