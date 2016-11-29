package com.briup.review.jdk_Proxy;

public class UserDaoImpl implements UserDao{

	@Override
	public void addUSer() {
		System.out.println("i am add");
	}

	@Override
	public void delete() {
		System.out.println("i am delete");
	}

	@Override
	public void update() {
		System.out.println("i am update");
	}

}
