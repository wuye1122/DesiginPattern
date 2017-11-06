package com.wuye.observer;

import java.util.ArrayList;
import java.util.List;

//主题的存在  里面有很多的 观察者 
public  abstract class Subject {

	private List<Observer> ll=new ArrayList<Observer>();
	//每一个主题  都有好多观察者这这观看
	
	
	public void add(Observer ob){
		
		ll.add(ob);
	}
	
	
	public  void del(Observer ob){
		
		ll.remove(ob);
	}
	
	//题目的出现需要好多人  都会更新
	public void notiy(){
		
		for(Observer a:ll){
			a.update();
		}
	}
	
	
}