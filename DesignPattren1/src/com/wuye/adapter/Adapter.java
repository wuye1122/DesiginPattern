package com.wuye.adapter;

public class Adapter extends Adaptee implements Target{

	private Adaptee ob=new Adaptee();
	
	/*
	 *  适配器就是 在我的名下 你进行你的操作
	 * 
	 * */
	public void say(){
		System.out.println("实例化后 称之为对象适配器");
		ob.Resquest();
		System.out.println("类适配器   通过这个适配器 将电源冲进手机里面了  结果如下:");
		super.Resquest();
	}
}
