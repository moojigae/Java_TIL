package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	private int num;
	
	public Child1() { 		// ���� ��Ű��, Parent�� �ڽ��� �ƴ�
		Parent p = new Parent();
		p.dNum = 0.0;		//default�� ���� ����
		p.bool = false;		// ���� ��Ű���� ���� ��
		p.ch = 'A';			// public ���� ����		
//		p.num = 10;
//		The field Parent.num is not visible  -> private�̶� �ۿ��� �Ⱥ���
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
}
