package com.wuye.command;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Receiver rr=new Receiver();//������
   Command cc=new CreateCommand(rr);//�������׼������
   Invoker in=new Invoker();//������
    
   //���˽�������� invoker�� receiverֱ����ϵ����
   //�������������ϵ����
   
		in.start(cc);
	}

}
