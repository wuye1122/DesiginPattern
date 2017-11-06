package com.wuye.factory1;
//我是工厂角色
public class Creater {

	
	//不需要关系 方法体内部实现
	
	//相当于点菜员 只需要点菜 不需要看到制作过程
	public IProduct getProduct(int flag){
		
		switch (flag) {
		case 1:
			return new ProductA();
			
		case 2:
			return new ProductB();
			
		default:
			
			return null;
		}
 
		
		
		
		
	}
	
}
