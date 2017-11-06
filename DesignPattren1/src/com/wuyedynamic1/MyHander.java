package com.wuyedynamic1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHander implements InvocationHandler {
	
  private Animal dog;
	
	MyHander(Animal dog){
		this.dog=dog;
		
	}
	
	
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("先洗手");
		System.out.println("方法的名字"+arg1.getName());
		Object rea=	arg1.invoke(dog, arg2);
		
		System.out.println("收拾一下");
		return rea;
	}

}
