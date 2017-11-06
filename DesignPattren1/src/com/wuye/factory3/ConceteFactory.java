package com.wuye.factory3;

public class ConceteFactory implements AbstractFactory{

	//实现接口 返回值可以是其返回值的子类
	@Override
	public ProductA factoryA() {
		// TODO Auto-generated method stub
		return new ProductA();
	}

	@Override
	public ProductB factoryB() {
		// TODO Auto-generated method stub
		return new ProductB();
	}

	

}
