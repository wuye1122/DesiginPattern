package com.wuye.factory2;

public class Test {

	
	
	// Factory Method 工厂方法就是实例的返回由工厂控制    方法实现由产品实现
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//通过具体的类进行 返回相应的产品
		BullCreate bc=new BullCreate();
		bc.factoy().up();;
		bc.factoy().down();
		
		DaCreate d=new DaCreate();
		d.factoy().up();;
		d.factoy().down();
		
	}

}
