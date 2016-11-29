package com.briup.review.ooad;

import java.util.ArrayList;
import java.util.List;

public class Prototype {
	public static void main(String[] args) {
		/*
		 * 使用对象复制，只执行一遍构造器
		 */
		Thing thing1 = new Thing();
		thing1.setName("alan");
		Thing thing2 = thing1.clone();
		thing2.setName("jade");
		
		/*
		 * 使用对象复制，引用属性是浅拷贝
		 * 没有把引用（数组，引用对象）拷贝到新的内存地址
		 * 复制出来的对象的引用属性还是指向原来的内存地址
		 */
		System.out.println(thing1.getName()+"------"+thing2.getName());
		
		/*
		 * 如果是String就比较特殊
		 */
		thing1.setPhone("123");
//		thing2.setPhone("456");
		System.out.println(thing1.getPhone()+"-----"+thing2.getPhone());
	}
	
}
class Thing implements Cloneable{
	/*
	 * 如果属性加了final修饰，那么就不能深复制（废话！final不能重新赋值）
	 */
	private  ArrayList<String> name = new ArrayList<>();
	private String phone;
	public Thing() {
		System.out.println("我是Thing的构造器！");
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Thing clone()  {
		Thing thing = null;
		try {
			thing = (Thing) super.clone();
			/*
			 * 深拷贝，对属性进行单独的拷贝
			 */
			thing.name = (ArrayList<String>)this.name.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return thing;
	}
	public List<String> getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name.add(name);
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}