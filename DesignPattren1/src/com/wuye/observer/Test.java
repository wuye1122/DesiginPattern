package com.wuye.observer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ConcreteSubject subject=new ConcreteSubject();
		//����Ҫ������
		
		//add���۲��������һЩ��������    ��ȷ���ǵ�����  �۲������
		subject.add(new ConcreteObserver("С����",subject));
		subject.add(new ConcreteObserver("Сģ��",subject));
		subject.add(new ConcreteObserver("С�к�",subject));
	 //�۲��߿��Խ��� �������� ����ĸ�������
		
		ConcreteSubject subject1=new ConcreteSubject();
		 subject1.setSubjectNot("����С�к��������Һ���ѧϰ����+");
		 ConcreteObserver Ob1=new ConcreteObserver("С�к�",subject);
		 Ob1.setSnew(subject1);
		 subject1.add(Ob1);

		 subject1.notiy();
		//ע������������Ϣ
		subject.setSubjectNot("���ż�");
	       
		//֪ͨ��λ��Ҫ����
		subject.notiy();
		
		
		subject.setSubjectNot("��Ҫ�ż�  �־õ�������Ҳ������ʵĸı�");
	       
		//֪ͨ��λ��Ҫ����
		subject.notiy();
	
	}

}
