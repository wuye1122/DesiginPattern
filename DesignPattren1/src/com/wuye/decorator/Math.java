package com.wuye.decorator;

public class Math extends DecoreGirl{
//����װ�ν�ɫ:ʵ�ֳ���װ�ν�ɫ ����������Ӷ��⹦��
//
//
	private Girl girl;
	
	Math(Girl girl){
		this.girl=girl;
		
	}
	
	@Override
	public String getBeauti() {
		// TODO Auto-generated method stub
		return this.girl.getBeauti()+"+��ѧ";
	}

	
	
}
