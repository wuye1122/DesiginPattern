package com.wuye.adapter;

public class Adapter extends Adaptee implements Target{

	private Adaptee ob=new Adaptee();
	
	/*
	 *  ���������� ���ҵ����� �������Ĳ���
	 * 
	 * */
	public void say(){
		System.out.println("ʵ������ ��֮Ϊ����������");
		ob.Resquest();
		System.out.println("��������   ͨ����������� ����Դ����ֻ�������  �������:");
		super.Resquest();
	}
}
