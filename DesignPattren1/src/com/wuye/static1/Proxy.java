package com.wuye.static1;

public class Proxy implements Subject{

	private RealSubject rs;//进行代理
	
	Proxy(RealSubject rs){
		this.rs=rs;
		
	}
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("我是代理说话");
		this.rs.speak();
		
	}

	@Override
	public void shut() {
		// TODO Auto-generated method stub
		System.out.println("我是代理闭嘴");
		this.rs.shut();
		
	}

}
