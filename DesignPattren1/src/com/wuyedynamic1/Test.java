package com.wuyedynamic1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 //�������С������
		Animal dd=new Dog();
		
		
		
		//�ƶ�һ����������
		InvocationHandler hh=new MyHander(dd);
		 
		
		//���animal�����һ��������
		Object  ob=Proxy.newProxyInstance
				(dd.getClass().getClassLoader(), dd.getClass().getInterfaces(), hh);
	             //������������        ��ʵ����ʵ�ֵ����нӿ�    ���Ƕ���ʵ�ֵĴ�����
	((Animal)ob).eat();
	((Animal)ob).drink();
	
	
	}

}
