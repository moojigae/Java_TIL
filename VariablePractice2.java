package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	Scanner sc = new Scanner(System.in);
	public void practiceScanner() {
		System.out.print("첫 번째 정수를 입력하세요: " );
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요: ");
		int num2 = sc.nextInt();
		
		System.out.println("첫 번째 정수 : " + num1);
		System.out.println("두 번째 정수 :" + num2);
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));
//		첫 번째 정수를 입력하세요: 20
//		두 번째 정수를 입력하세요: 3
//		첫 번째 정수 : 20
//		두 번째 정수 :3
//		더하기 결과 : 23
//		빼기 결과 : 17
//		곱하기 결과 : 60
//		나누기 결과 : 6
	}
}
