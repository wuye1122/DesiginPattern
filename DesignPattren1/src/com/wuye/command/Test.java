package com.wuye.command;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Receiver rr=new Receiver();//接受者
   Command cc=new CreateCommand(rr);//这个任务准备就绪
   Invoker in=new Invoker();//调用者
    
   //起到了解耦的作用 invoker和 receiver直接联系很少
   //由这个命令将这个联系起来
   
		in.start(cc);
	}

}
