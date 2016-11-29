package com.briup.bean;

import java.io.Serializable;

public class Student  extends Object implements Serializable{

	private static String name;
	private  int age;
//	private transient int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return "name="+name+",age="+age;
	}
	
	
}
