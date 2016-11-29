package com.briup.ch06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set set=new HashSet();
		Teacher t=new Teacher("briup", 20);
		Teacher t2=new Teacher("lihong", 18);
		Teacher t3=new Teacher("zhangsan", 22);
		Teacher t4=new Teacher("briup", 20);
		System.out.println(t.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		System.out.println(t4.hashCode());
		set.add(t);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		System.out.println(set.size());
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o);
		}
		
	}
}

class Teacher {
	private String name;
	private int age;

	public Teacher() {
	}

	public Teacher(String name, int age) {
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

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
*/
	public int hashCode(){
		return 31*(this.name.hashCode()+this.age);
//		return 1;
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof Teacher)){
			return false;
		}
		Teacher t=(Teacher)obj;
		
		return t.age==this.age && this.name.equals(t.name);
	}
	
	
	
}
