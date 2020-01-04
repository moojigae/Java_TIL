package com.kh.operator;

public class F_Compound {
	
	public void method() {
		int num = 12;
		
		System.out.println("num : " + num); // num : 12
		
		// num에 3 증가
//		num = num + 3;
		num += 3;
		System.out.println("num : " + num); // num : 15
		
		// num에 5 감소
		num -= 5;
		System.out.println("num : " + num); // num : 10
		
//		num에 6배 증가
		num *= 6;
		System.out.println("num : " + num); //num : 60
		
//		num에 2배 감소
		num /= 2;
		System.out.println("num : " + num); // num : 30
		
		// num에 4로 나눈 나머지 대입
		num %= 4;
		System.out.println("num : " + num); // num : 2
	}
}
