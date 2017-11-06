package com.wuye.observer;

public class ConcreteObserver implements Observer {
//观察者要有 自己的名字   要有通知到的主题

	
private ConcreteSubject	 snew;//主题对象
	
private String name;//观察者自己的名字


private  String sss;//承接主题内容的
ConcreteObserver(String name,ConcreteSubject snew){
	this.name=name;
	this.snew=snew;
	
}

//获取我观察的那些主题 
	public ConcreteSubject getSnew() {
	return snew;
}


public void setSnew(ConcreteSubject snew) {
	this.snew = snew;
}

 
//具体实现以下
	@Override
	public void update() {
		// TODO Auto-generated method stub
		//新的主题
		sss=snew.getSubjectNot();
		
		System.out.println("观察者名字"+name+"状态"+sss);
		
	}

}
