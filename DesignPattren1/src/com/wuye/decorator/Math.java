package com.wuye.decorator;

public class Math extends DecoreGirl{
//具体装饰角色:实现抽象装饰角色 负责增加添加额外功能
//
//
	private Girl girl;
	
	Math(Girl girl){
		this.girl=girl;
		
	}
	
	@Override
	public String getBeauti() {
		// TODO Auto-generated method stub
		return this.girl.getBeauti()+"+数学";
	}

	
	
}
