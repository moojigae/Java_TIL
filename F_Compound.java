package com.kh.operator;

public class F_Compound {
	
	public void method() {
		int num = 12;
		
		System.out.println("num : " + num); // num : 12
		
		// num�� 3 ����
//		num = num + 3;
		num += 3;
		System.out.println("num : " + num); // num : 15
		
		// num�� 5 ����
		num -= 5;
		System.out.println("num : " + num); // num : 10
		
//		num�� 6�� ����
		num *= 6;
		System.out.println("num : " + num); //num : 60
		
//		num�� 2�� ����
		num /= 2;
		System.out.println("num : " + num); // num : 30
		
		// num�� 4�� ���� ������ ����
		num %= 4;
		System.out.println("num : " + num); // num : 2
	}
}
