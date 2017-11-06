package com.wuye.decorator;
//抽象装饰者角色:对具体构件角色的引用 定义与抽象构建角色一样的接口
//
//
//抽象类  进行继承  为了之后的类 进行修饰
public abstract class DecoreGirl  extends Girl{

	
	//获取装饰的方法  完全模仿出来
	public abstract String getBeauti();
}
