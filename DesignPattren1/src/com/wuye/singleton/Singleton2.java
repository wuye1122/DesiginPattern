package com.wuye.singleton;

public class Singleton2 {

	/*
	 * 
	 * 2   �ڶ��ֵ���ģʽ
	 * 
	 *   ��synchronized��ģʽ ���Ա����̷߳���
	 *   ����Ч�ʺܵ� �������ʹ������
	 *   
	 * 
	 * 
	 * */
	
	
	private Singleton2(){
		
		System.out.println("���Ա���ͬ�߳�ͬʱ����");
	}
	
	private static Singleton2 ss;
	
	
	public static  synchronized Singleton2 getInstance(){
		
		
		if(ss==null){
			ss=new Singleton2();
			
		}
		
		return ss;
		
		
		
	}
	
}
