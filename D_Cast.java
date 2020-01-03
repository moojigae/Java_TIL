package com.kh.variable;

public class D_Cast {
	public void rule1() {
//		boolean flag = true;
//		boolean flag2 = 100; 
		// Type mismatch: cannot convert from int to boolean
		// boolean Ÿ�Կ��� ���ڰ� �� �� ���� ������ ���� �߻�
		
		int num = 'A'; 
		// A�� �־ �����ڵ� ���ڷ� ��
		System.out.println("num: " + num);	// num: 65
		
		char ch = 97; 
		System.out.println("ch: " + ch);	// ch: a
		
//		char ch2 = num;
		// Type mismatch: cannot convert from int to char
		// num�� �������̱� ������ �ȵ�/ ���ڷ� ���� ���� `���ͷ�`�̱� ������ ���� ���� ġȯ�� �� �ְ� 
		// ������ �־��� ���� Ÿ���� ũ�⸸ �� �� �ְ� ���� �� �� ����
		
		char ch2 = (char)num;
		// int���� num�� char�� �ֱ� ���ؼ� ��������ȯ �ʿ�
		System.out.println("ch2: " + ch2);	// ch2: A
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3: " + ch3);	// ch3: ?
		// char���� ������ 0 ~ 65,535 �����ε� num2�� -97 ������ ����ֱ� ������
		// char�� ������ ������ �����Ƿ� ���� ã�� �� ��� ? ��µ�
	}
	
	public void rule2() {
		int iNum = 10;
		long lNum = 100;
		
//		int result = iNum + lNum;
		// Type mismatch: cannot convert from long to int
		// int���� �� ū long���� �־���� �ϴ� ū�� �����ɷ� �� �� ��� ���� �߻�
		
		// iNum + lNum�� int result�� ������ �� �ִ� ���
		// ���1. `���� ���`�� int�� ���� ����ȯ
		int result = (int)(iNum + lNum); // 110
		
		// ���2. long���� int�� ���� ����ȯ
		int result2 = iNum + (int)lNum; // 110
		
		// ����. ������� �����ϴ� result�� long������ ����(���� �� ����� �ȵǾ��� ��)
		long result3 = iNum + lNum; // 110
	
	}
	public void rule3() {
		int iNum = 290;
		byte bNum = (byte)iNum;
		
		System.out.println("bNum: " + bNum); // bNum: 34 : ������ �սǷ� 290 ��� �ȵ�
	}
}
