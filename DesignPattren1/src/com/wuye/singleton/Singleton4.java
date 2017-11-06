package com.wuye.singleton;

public class Singleton4 {
/*
 *  4 �ڶ��ַ�����������
 * 
 *   ˫�ؼ��������volatile synchronized
 *   constһ����һ���������η� volatile
 *   �����ڶ��̸߳߼�֪ʶ���п���
 *   
 *   volatile�������β�ͬ�̷߳��ʺ��޸Ĺ��ñ���
 *   ���û��volatile �����޷���д���̳߳���    ����  ������ʧȥ�����Ż��Ļ���
 *   
 *   
 * */
	
	private volatile static Singleton4 s4;
	
	private Singleton4(){
		System.out.println("˫������ synchronized   volatile");
		
	}
	
	public static Singleton4 getInstance(){
		
		if(s4==null){
			synchronized(Singleton4.class){
				if(s4==null){
					s4=new Singleton4();
					
				}
				
				
				
			}
			
			
			
		}
		return s4;
		
		
		
	}
	
}
