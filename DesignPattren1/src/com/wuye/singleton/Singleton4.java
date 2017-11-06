package com.wuye.singleton;

public class Singleton4 {
/*
 *  4 第二种方法的升级版
 * 
 *   双重检查锁定版volatile synchronized
 *   const一样的一个类型修饰符 volatile
 *   来自于多线程高级知识并行开发
 *   
 *   volatile用来修饰不同线程访问和修改过得变量
 *   如果没有volatile 程序无法编写多线程程序    或者  编译器失去大量优化的机会
 *   
 *   
 * */
	
	private volatile static Singleton4 s4;
	
	private Singleton4(){
		System.out.println("双重锁定 synchronized   volatile");
		
	}
	
	public static Singleton4 getInstance(){
		
		if(s4==null){
			synchronized(Singleton4.class){
				if(s4==null){
					s4=new Singleton4();
					
				}
				
				
				
			}
			
			
			
		}
		return s4;
		
		
		
	}
	
}
