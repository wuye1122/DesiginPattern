package com.wuye.singleton;

public class Singleton1 {

	
	/*
	 *  1 一个类只能有一个对象 不可以任意new
	 *   
	 *   正常的单子模式 。但是多线程不能正常工作。
	 * 
	 * 
	 * */
	
    private	Singleton1(){//不可以任意new
		
	  System.out.println("你是第一个对象");	
	}
    //static能够存住值   使得第二三次都能够使用同一次的值
   private static Singleton1 ss;
    
    //只有静态的才能访问静态的
    
    public static Singleton1 getInstance(){
    	if(ss==null){
    		ss=new Singleton1();
    	}
    	return ss;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub

    	
    	
		//在同一个类里面 private 是不起作用的
		Singleton1 ss=new Singleton1();
		Singleton1 ss1=new Singleton1();
		System.out.println(ss);
		System.out.println(ss1);
	}

}
