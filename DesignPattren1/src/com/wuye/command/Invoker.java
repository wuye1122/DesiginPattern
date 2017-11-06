package com.wuye.command;

public class Invoker {

	Command cc;
	
	public void start(Command cc){
		this.cc=cc;
		cc.exceute();
		
	}
}
