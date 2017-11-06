package com.wuyedynamic1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 //被代理的小狗对象
		Animal dd=new Dog();
		
		
		
		//制定一个代理处理器
		InvocationHandler hh=new MyHander(dd);
		 
		
		//获得animal对象的一个代理类
		Object  ob=Proxy.newProxyInstance
				(dd.getClass().getClassLoader(), dd.getClass().getInterfaces(), hh);
	             //对象的类加载器        真实对象实现的所有接口    真是对象实现的处理器
	((Animal)ob).eat();
	((Animal)ob).drink();
	
	
	}

}
