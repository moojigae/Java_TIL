package com.kh.variable;

public class C_Overflow {
	public void overflow() {
		byte bNum = 127;
		bNum = (byte)(bNum + 1);
		System.out.println("bNum: " + bNum); // bNum: -128
	}
	
	public void calc() {
		int num1 = 1000000;
		int num2 = 70000;
		
//		int result = num1 * num2;  
//		System.out.println("�����: " + result); // int�� �� �� �����: 1280523264
		long result = (long)num1 * num2;
//		int�� num2�� �� ū �ڷ����� num1�� long���� ���󰣴�
		System.out.println("�����: " + result); // long�� �� �� �����: 70000000000
	}
}
