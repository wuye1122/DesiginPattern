package com.wuye.factory3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//��Ʒ1������ һ��Ҫ�ھ��幤���������ʵ��
		ConceteFactory A=new ConceteFactory();
		  ProductA a= A.factoryA();
		
		
		//��Ʒ2������
		  ConceteFactory B=new ConceteFactory();
		  ProductB b= B.factoryB();
		
	}

}
