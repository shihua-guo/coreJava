package com.briup.ch06;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		Set set=new TreeSet();
		Set set=new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Person p1=(Person)o1;
				Person p2=(Person)o2;
				return -(p1.getAge()-p2.getAge());
			}
		});
//		set.add("a");
//		set.add("z");
//		set.add("v");
//		set.add("x");
//		set.add("h");
		
//		set.add(10);
//		set.add(110);
//		set.add(13);
//		set.add(230);
//		set.add(11);
		
		
		set.add(new Person("briup", 20));
		set.add(new Person("lihong", 30));
		set.add(new Person("lisi", 21));
		set.add(new Person("zs", 23));
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o);
		}
	}
}
class Person implements Comparable{
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
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

/*	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
*/
	@Override
	public int compareTo(Object o) {
		Person p=(Person)o;
		
		//this.age-p.age
		if(this.age>p.age){
			return 1;
		}else if(this.age<p.age){
			return -1;
		}
		return 0;
//		return 1;
		
//		return -(this.age-p.age);
//		int temp=this.age-p.age;
//		int temp2=this.name.length()-p.name.length();
//		return temp==0?temp2:temp;
	}

}
