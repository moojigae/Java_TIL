package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// 삼항 연산자
	//(조건식)? 식1 : 식2;
	// 조건식이 true일 때 식1 수행, false 일 때 식2 수행
	Scanner sc = new Scanner(System.in);
	public void method1() {
		//입력한 정수가 양수인지 아닌지 판별. 양수면 "양수다". 양수가 아니면 "양수가 아니다"
		// "정수 하나 입력 : " 이라는 안내문 출력 후 입력한 정수를 num에 저장
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
//		String result = num > 0 ? "양수다" : "양수가 아니다"; // 0 "양수가 아니다"
		
		// 중첩 삼항 연산자
		String result = num > 0 ? "양수다" : (num == 0 ? "0 이다" : "음수다");	
		System.out.println(num + " 숫자는 " + result);
//		정수 하나 입력 : 0
//		0 숫자는 0 이다
	}
	
	public void method2() {
		// 입력한 정수가 짝수인지 홀수인지 판별
		// 홀수면 "홀수입니다", 짝수면 "짝수입니다"
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		// 1. 한 번에 합치기
		String result = num % 2 == 0 ? "짝수입니다" : "홀수입니다";
		
		// 2. 조건식만 따로 빼기
//		boolean bool = num % 2 == 0;
//		String result = bool ? "짝수입니다" : "홀수입니다";
		
		// 3. 계산식만 따로 빼기
//		int mod = num % 2;
//		String result = (mod == 0) ? "짝수입니다" : "홀수입니다";
		
		System.out.println(num + " 숫자는 " + result);
//		정수 하나 입력 : 10
//		10 숫자는 짝수입니다
	}
}
