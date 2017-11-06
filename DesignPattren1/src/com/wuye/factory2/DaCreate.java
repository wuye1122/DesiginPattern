package com.wuye.factory2;

public class DaCreate implements Create{

	@Override
	public Light factoy() {
		// TODO Auto-generated method stub
		return new Dalight();
	}

}
