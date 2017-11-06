package com.wuye.singleton;

public class Singleton3 {
/*
 * 
 * 3 ʹ���ڲ���ʵ�ֵ���ģʽ ��ȫ���Ա����̷߳���
 * 
 *  ����һ���� ���� ��������final����
 *   
 * 
 * 
 * 
 * 
 * */
	
	
	//�½�һ���ڲ���
	
	private static class SingletonF{
		
		private static final Singleton3 INSTANCE=new Singleton3();
		
	}
	
	private Singleton3(){

		System.out.println("ʹ�õ����ַ��� ");
	}
	
	public static final Singleton3 getInstance(){
		
		return SingletonF.INSTANCE;
	}
	
}
