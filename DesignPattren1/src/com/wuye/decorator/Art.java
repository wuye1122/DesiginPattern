package com.wuye.decorator;

public class Art extends DecoreGirl{

	//ʹ�ýӿڱ���  ԭ����װ��Ʒ   ����װ�� һ��һ���װ��
	private Girl girl;
	
	Art(Girl girl){
		this.girl=girl;
		
	}
	
	
	@Override
	public String getBeauti() {
		// TODO Auto-generated method stub
		return this.girl.getBeauti()+"+like art";
	}
	
	public void draw(){
		System.out.println("can draw");
	}

}
