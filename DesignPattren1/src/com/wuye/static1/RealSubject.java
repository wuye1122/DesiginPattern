package com.wuye.static1;

public class RealSubject  implements Subject{

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("请讲话说话");
	}

	@Override
	public void shut() {
		// TODO Auto-generated method stub
		System.out.println("不要说话");
	}

}
