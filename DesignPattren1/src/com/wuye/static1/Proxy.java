package com.wuye.static1;

public class Proxy implements Subject{

	private RealSubject rs;//���д���
	
	Proxy(RealSubject rs){
		this.rs=rs;
		
	}
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("���Ǵ���˵��");
		this.rs.speak();
		
	}

	@Override
	public void shut() {
		// TODO Auto-generated method stub
		System.out.println("���Ǵ������");
		this.rs.shut();
		
	}

}
