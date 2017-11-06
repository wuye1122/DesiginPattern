package com.wuye.decorator;

public class Test {

	//单子 就是将类的对象进行static final 只可以有一个对象
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//对父类进行覆盖
		 Girl gg=new AmerGil();
		 System.out.println(gg.getBeauti());
		 
		 //进行修饰
		 
		 Girl gg1=new Art(gg);
		 System.out.println(gg1.getBeauti());
		
		 //进行修饰
		 Girl gg2=new Math(gg1);
		 System.out.println(gg2.getBeauti());
		 
	}

}
