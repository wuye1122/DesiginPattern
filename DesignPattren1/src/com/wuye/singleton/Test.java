package com.wuye.singleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//第一种
		//访问不可见Singleton1 ss=new Singleton1();
		Singleton1 ss=Singleton1.getInstance();
		Singleton1 ss1=Singleton1.getInstance();
		System.out.println(ss);
		System.out.println(ss1);
		
		
		//第二种
		
		
		Singleton2 ss2=Singleton2.getInstance();
		Singleton2 ss3=Singleton2.getInstance();
		System.out.println(ss2);
		System.out.println(ss3);
		
		//第三种 

		//使用了 final
		Singleton3 ss4=Singleton3.getInstance();
		Singleton3 ss5=Singleton3.getInstance();
		System.out.println(ss4);
		System.out.println(ss5);

		//第四种 

		//使用了 final
		Singleton4 ss6=Singleton4.getInstance();
		Singleton4 ss7=Singleton4.getInstance();
		System.out.println(ss6);
		System.out.println(ss7);

	}

}
