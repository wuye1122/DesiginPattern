package com.wuye.factory3;

public class ConceteFactory implements AbstractFactory{

	//ʵ�ֽӿ� ����ֵ�������䷵��ֵ������
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
