package com.wuye.factory3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//产品1的制造 一定要在具体工厂里面进行实现
		ConceteFactory A=new ConceteFactory();
		  ProductA a= A.factoryA();
		
		
		//产品2的制造
		  ConceteFactory B=new ConceteFactory();
		  ProductB b= B.factoryB();
		
	}

}
