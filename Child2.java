package com.kh.example.test.model.vo;

public class Child2 extends Parent {
	private String str;
	
	public Child2() {
//		super.num = 10;  
//		���� ������ private�̶� Parent�� ���ٰ����ϱ� ������ �Ұ���
		super.dNum = 10.2; // ���� ��Ű��
		super.bool = false; // ���� ��Ű���̰� �ļ��̱� ������ ����
		super.ch = 'a'; // ���� ������ ��ü �� �̱� ������ ����
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
}
