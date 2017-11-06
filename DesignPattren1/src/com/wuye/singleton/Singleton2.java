package com.wuye.singleton;

public class Singleton2 {

	/*
	 * 
	 * 2   第二种单子模式
	 * 
	 *   加synchronized的模式 可以被多线程访问
	 *   但是效率很低 很少情况使用这种
	 *   
	 * 
	 * 
	 * */
	
	
	private Singleton2(){
		
		System.out.println("可以被不同线程同时访问");
	}
	
	private static Singleton2 ss;
	
	
	public static  synchronized Singleton2 getInstance(){
		
		
		if(ss==null){
			ss=new Singleton2();
			
		}
		
		return ss;
		
		
		
	}
	
}
