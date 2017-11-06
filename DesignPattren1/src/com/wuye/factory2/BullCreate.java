package com.wuye.factory2;


//具体工厂  就是返回具体的产品实例
public class BullCreate implements Create {

	@Override
	public Light factoy() {
		// TODO Auto-generated method stub
		return new Bulllignt();
	}

}
