package com.wuye.decorator;

public class ChinGirl extends Girl{

	//这句话相当于也继承了  String beautiful="+没特点";
	//被构造器覆盖了
	
	
	ChinGirl(){//对父类进行覆盖
		
		 beautiful="+中国的";
	}
	
}
