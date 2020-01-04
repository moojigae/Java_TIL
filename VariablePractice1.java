package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	Scanner sc = new Scanner(System.in);
	public void practiceScanner() {
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		System.out.print("성별을 입력하세요(남/여): ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요: ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height + "cm인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
//		이름을 입력하세요: a
//		성별을 입력하세요(남/여): 여
//		나이를 입력하세요: 19
//		키를 입력하세요: 156
//		키 156.0cm인 19살 여자 a님 반갑습니다^^
	}
}