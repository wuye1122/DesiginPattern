package com.wuye.factory1;
//���ǹ�����ɫ
public class Creater {

	
	//����Ҫ��ϵ �������ڲ�ʵ��
	
	//�൱�ڵ��Ա ֻ��Ҫ��� ����Ҫ������������
	public IProduct getProduct(int flag){
		
		switch (flag) {
		case 1:
			return new ProductA();
			
		case 2:
			return new ProductB();
			
		default:
			
			return null;
		}
 
		
		
		
		
	}
	
}
