package com.wuye.factory2;


//���幤��  ���Ƿ��ؾ���Ĳ�Ʒʵ��
public class BullCreate implements Create {

	@Override
	public Light factoy() {
		// TODO Auto-generated method stub
		return new Bulllignt();
	}

}
