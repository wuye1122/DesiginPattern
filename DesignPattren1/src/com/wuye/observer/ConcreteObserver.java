package com.wuye.observer;

public class ConcreteObserver implements Observer {
//�۲���Ҫ�� �Լ�������   Ҫ��֪ͨ��������

	
private ConcreteSubject	 snew;//�������
	
private String name;//�۲����Լ�������


private  String sss;//�н��������ݵ�
ConcreteObserver(String name,ConcreteSubject snew){
	this.name=name;
	this.snew=snew;
	
}

//��ȡ�ҹ۲����Щ���� 
	public ConcreteSubject getSnew() {
	return snew;
}


public void setSnew(ConcreteSubject snew) {
	this.snew = snew;
}

 
//����ʵ������
	@Override
	public void update() {
		// TODO Auto-generated method stub
		//�µ�����
		sss=snew.getSubjectNot();
		
		System.out.println("�۲�������"+name+"״̬"+sss);
		
	}

}
