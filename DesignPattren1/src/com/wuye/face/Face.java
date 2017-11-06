package com.wuye.face;

public class Face {
/*
 *  门面设计模式  
 *  
 *  只要将门面类 里面对子系统的方法进行整理 调用
 * 
 *  
 *  用户不需要知道每个模块内部细节  用户只要和门面打好关系就行。 从而更好地实现了 客户和模块之间解耦
 *  让客户更容易使用这些系统
 *  
 *   就是把所有功能方法的调用全部都写在门面里面
 * 
 * 
 * 
 * 
 * 
 * */
	public void test(){
		SubSystem1 s1=new SubSystem1();
		s1.test();
		
		SubSystem2 s2=new SubSystem2();
		s2.test();
		
		SubSystem3 s3=new SubSystem3();
		s3.test();
		
	}

}
