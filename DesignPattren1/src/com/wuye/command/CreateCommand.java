package com.wuye.command;
//����������� ���Ǹ�������Ա����ִ��
public class CreateCommand implements Command{
     
	//ȷ��˭��ִ��
	Receiver rr;
	CreateCommand(Receiver rr){//�ⲿ�ͽ����� --->�ۺ�
		this.rr=rr;
		
	} 
	/*  ��ִ�����Թ���������ʽ������
	 *  
	 *  ����������ִ����
	 * 
	 *  ������ֱ�ӷ����������
	 * 
	 * 
	 * */
	
	@Override
	public void exceute() {
		// TODO Auto-generated method stub
		rr.finish();
	}

}
