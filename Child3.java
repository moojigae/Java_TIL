package com.kh.example.test.model.vo3;

import com.kh.example.test.model.vo.Parent;

public class Child3 extends Parent {
	public Child3() {
//		super.num = 10;
//		super.dNum = 90.9; // �ٸ� ��Ű���� �ȵ�
		super.bool = false; // protected�� �ٸ� ��Ű�������� ��ӹ��� �ļ��̶� ����
		super.ch = 'b'; // public�� ��𼭳� ����
	}
}
