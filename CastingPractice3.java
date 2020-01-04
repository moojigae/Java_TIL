package com.kh.practice2.func;

public class CastingPractice3 {
	public void method() {
		int iNum = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum / iNum2); // 2
		System.out.println((int)dNum); // 2
		
		System.out.println((double)iNum); // 10.0
		System.out.println(iNum2 * dNum); // 10.0
		
		System.out.println(iNum / (double)iNum2); // 2.5
		System.out.println(dNum); // 2.5
		
		System.out.println((int)fNum); // 3
		System.out.println(iNum / (int)fNum); // 3
		
		System.out.println(iNum / fNum); // 3.3333333
		// float 소수점 아래 7자리
		System.out.println(iNum / (double)fNum); // 3.333333333333335
		// double 소수점 아래 15자리
		
		System.out.println(ch); // 'A'
		System.out.println((int)ch); // 65
		System.out.println(ch + iNum); // 75
		System.out.println((char)(ch + iNum)); // 'K'	
		}
}
