package com.wuye.observer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ConcreteSubject subject=new ConcreteSubject();
		//首先要有主题
		
		//add将观察这个主题一些先锁起来    明确他们的名字  观察的主题
		subject.add(new ConcreteObserver("小例子",subject));
		subject.add(new ConcreteObserver("小模特",subject));
		subject.add(new ConcreteObserver("小男孩",subject));
	 //观察者可以进行 设置主题 后天的更改主题
		
		ConcreteSubject subject1=new ConcreteSubject();
		 subject1.setSubjectNot("我是小男孩，但是我后天学习的是+");
		 ConcreteObserver Ob1=new ConcreteObserver("小男孩",subject);
		 Ob1.setSnew(subject1);
		 subject1.add(Ob1);

		 subject1.notiy();
		//注意力发布新消息
		subject.setSubjectNot("很着急");
	       
		//通知各位需要更改
		subject.notiy();
		
		
		subject.setSubjectNot("不要着急  持久的慢慢的也会带来质的改变");
	       
		//通知各位需要更改
		subject.notiy();
	
	}

}
