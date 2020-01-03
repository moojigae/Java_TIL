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
//		System.out.println("계산결과: " + result); // int형 일 때 계산결과: 1280523264
		long result = (long)num1 * num2;
//		int의 num2가 더 큰 자료형의 num1의 long형을 따라간다
		System.out.println("계산결과: " + result); // long형 일 때 계산결과: 70000000000
	}
}
