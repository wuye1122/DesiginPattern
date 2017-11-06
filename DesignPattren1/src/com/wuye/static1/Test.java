package com.wuye.static1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RealSubject sr=new RealSubject();
		
		Proxy pp=new Proxy(sr);
		pp.shut();
		System.out.println();
		pp.speak();
	}

}
