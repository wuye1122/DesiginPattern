package com.wuye.singleton;

public class Singleton1 {

	
	/*
	 *  1 һ����ֻ����һ������ ����������new
	 *   
	 *   �����ĵ���ģʽ �����Ƕ��̲߳�������������
	 * 
	 * 
	 * */
	
    private	Singleton1(){//����������new
		
	  System.out.println("���ǵ�һ������");	
	}
    //static�ܹ���סֵ   ʹ�õڶ����ζ��ܹ�ʹ��ͬһ�ε�ֵ
   private static Singleton1 ss;
    
    //ֻ�о�̬�Ĳ��ܷ��ʾ�̬��
    
    public static Singleton1 getInstance(){
    	if(ss==null){
    		ss=new Singleton1();
    	}
    	return ss;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub

    	
    	
		//��ͬһ�������� private �ǲ������õ�
		Singleton1 ss=new Singleton1();
		Singleton1 ss1=new Singleton1();
		System.out.println(ss);
		System.out.println(ss1);
	}

}
