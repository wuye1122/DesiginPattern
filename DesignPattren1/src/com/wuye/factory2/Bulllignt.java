package com.wuye.factory2;
//具体产品 产品就是负责实现方法的功能
public class Bulllignt implements Light{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("产品1  打开开关");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("产品1  关闭开关");
	}

}
