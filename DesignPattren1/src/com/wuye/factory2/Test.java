package com.wuye.factory2;

public class Test {

	
	
	// Factory Method ������������ʵ���ķ����ɹ�������    ����ʵ���ɲ�Ʒʵ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ͨ������������ ������Ӧ�Ĳ�Ʒ
		BullCreate bc=new BullCreate();
		bc.factoy().up();;
		bc.factoy().down();
		
		DaCreate d=new DaCreate();
		d.factoy().up();;
		d.factoy().down();
		
	}

}
