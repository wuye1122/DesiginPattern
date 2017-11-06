package com.wuye.command;
//创建这个命令 右那个接收人员进行执行
public class CreateCommand implements Command{
     
	//确定谁来执行
	Receiver rr;
	CreateCommand(Receiver rr){//外部送进来的 --->聚合
		this.rr=rr;
		
	} 
	/*  将执行者以构造器的形式进来。
	 *  
	 *  将这个命令交给执行者
	 * 
	 *  调用者直接发布命令就行
	 * 
	 * 
	 * */
	
	@Override
	public void exceute() {
		// TODO Auto-generated method stub
		rr.finish();
	}

}
