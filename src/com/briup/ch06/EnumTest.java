package com.briup.ch06;

public enum EnumTest {
	MALE{

		@Override
		public void test() {
			System.out.println("m...");
		}

		@Override
		public void test2() {
			// TODO Auto-generated method stub
			
		}
		
		
	},FEMALE{

		@Override
		public void test() {
			System.out.println("f.....");
		}

		@Override
		public void test2() {
			
		}
		
		
	};
	
	private String name;
	private int age;
	
	private EnumTest() {
		System.out.println("sss");
	}
	private EnumTest(String name,int age) {
		System.out.println("----");
		this.name=name;
		this.age=age;
	}
	
	public void say(){
		System.out.println("say......");
	}
	public  static void show(){
		System.out.println("show......");
	}
	
	public abstract void test();
	public abstract void test2();
	public static void main(String[] args) {
//		EnumTest[] vs = EnumTest.values();
//		for(EnumTest e:vs){
////			System.out.println(e.name());
//			System.out.println(e.ordinal());
//		}
		
//		EnumTest e = EnumTest.valueOf(EnumTest.class, "MALE");
//		System.out.println(e);
		
		EnumTest et=EnumTest.MALE;
		EnumTest et2=EnumTest.FEMALE;
//		et.say();
		et.test();
		et2.test();
//		EnumTest.show();
	}
}
