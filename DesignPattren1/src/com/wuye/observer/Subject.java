package com.wuye.observer;

import java.util.ArrayList;
import java.util.List;

//����Ĵ���  �����кܶ�� �۲��� 
public  abstract class Subject {

	private List<Observer> ll=new ArrayList<Observer>();
	//ÿһ������  ���кö�۲�������ۿ�
	
	
	public void add(Observer ob){
		
		ll.add(ob);
	}
	
	
	public  void del(Observer ob){
		
		ll.remove(ob);
	}
	
	//��Ŀ�ĳ�����Ҫ�ö���  �������
	public void notiy(){
		
		for(Observer a:ll){
			a.update();
		}
	}
	
	
}