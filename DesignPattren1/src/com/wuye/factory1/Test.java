package com.wuye.factory1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//����һ����������
		
		Creater cc=new Creater();
		
		cc.getProduct(1).make();
		cc.getProduct(2).make();
	}

}
