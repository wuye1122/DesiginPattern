package com.wuye.decorator;

public class Test {

	//���� ���ǽ���Ķ������static final ֻ������һ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�Ը�����и���
		 Girl gg=new AmerGil();
		 System.out.println(gg.getBeauti());
		 
		 //��������
		 
		 Girl gg1=new Art(gg);
		 System.out.println(gg1.getBeauti());
		
		 //��������
		 Girl gg2=new Math(gg1);
		 System.out.println(gg2.getBeauti());
		 
	}

}
