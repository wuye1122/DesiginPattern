package com.wuye.decorator;

public class Art extends DecoreGirl{

	//使用接口变量  原来的装饰品   进行装饰 一层一层的装饰
	private Girl girl;
	
	Art(Girl girl){
		this.girl=girl;
		
	}
	
	
	@Override
	public String getBeauti() {
		// TODO Auto-generated method stub
		return this.girl.getBeauti()+"+like art";
	}
	
	public void draw(){
		System.out.println("can draw");
	}

}
