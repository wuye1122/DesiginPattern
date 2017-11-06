package com.wuye.singleton;

public class Singleton3 {
/*
 * 
 * 3 使用内部类实现单子模式 安全可以被多线程访问
 * 
 *  增加一个类 并且 还是用了final修饰
 *   
 * 
 * 
 * 
 * 
 * */
	
	
	//新建一个内部类
	
	private static class SingletonF{
		
		private static final Singleton3 INSTANCE=new Singleton3();
		
	}
	
	private Singleton3(){

		System.out.println("使用第三种方法 ");
	}
	
	public static final Singleton3 getInstance(){
		
		return SingletonF.INSTANCE;
	}
	
}
