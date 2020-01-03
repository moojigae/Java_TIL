package com.kh.variable;

public class A_Variable { // class
	
	public void declareVariable() { // method
//		변수 선언 후 초기화
//		A. 변수 선언 : 자료형 변수명;
//		1. 논리형
		boolean isTrue;
//		2. 문자형
//		2-1. 문자
		char ch;
//		2-2. 문자열
		String str;
//		3. 숫자형
//		3-1. 정수
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
//		3-2. 실수
		float fNum;
		double dNum;
//		B. 초기화 : 변수명 = 값;
		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
//		fNum = 4.0; 
		// Type mismatch: cannot convert from double to float
		// f가 빠질 경우 실수의 기본형인 double로 인식되기 때문에 8byte가 4byte의 공간에 들어갈 수 없어 에러
		fNum = 4.0f;
		dNum = 8.0;
		
		ch = 'A'; // ch에는 ''/ 한 글자만 가능 
		str = "A"; // str은 "" 사용 / 한 글자 이상 가능
		
		System.out.println("isTrue의 값: " + isTrue);
		System.out.println("bNum의 값: " + bNum);
		System.out.println("sNum의 값: " + sNum);
		System.out.println("iNum의 값: " + iNum);
		System.out.println("lNum의 값: " + lNum);
		System.out.println("fNum의 값: " + fNum);
		System.out.println("dNum의 값: " + dNum);
		System.out.println("ch의 값: " + ch);
		System.out.println("str의 값: " + str);
	}
	
	public void initVariable() {
		// 변수 선언과 동시에 초기화
		// 1. 논리형
		boolean isTrue = false;
		// 2. 문자형
		// 2.1 문자
		char ch = '가';
		// 2.2 문자열 
		String str = "kh정보교육원";
		// 3. 숫자형
		// 3-1 정수
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		// 3-2 실수
		float fNum = 4.0f;
		double dNum = 8.0d;
		
		System.out.println("isTrue의 값: " + isTrue);		// isTrue의 값: true
		System.out.println("ch의 값: " + ch);				// ch의 값: A		
		System.out.println("str의 값: " + str);			// str의 값: A		
		System.out.println("bNum의 값: " + bNum);			// bNum의 값: 1
		System.out.println("sNum의 값: " + sNum);			// sNum의 값: 2
		System.out.println("iNum의 값: " + iNum);			// iNum의 값: 4
		System.out.println("lNum의 값: " + lNum);			// lNum의 값: 8
		System.out.println("fNum의 값: " + fNum);			// fNum의 값: 4.0
		System.out.println("dNum의 값: " + dNum);			// dNum의 값: 8.0
	}
	
	
}
