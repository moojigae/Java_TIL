package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	Scanner sc = new Scanner(System.in);
	public void practiceScanner() {
		System.out.print("문자열을 입력하세요 : ");
		String spell = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + spell.charAt(0));
		System.out.println("두 번째 문자 : " + spell.charAt(1));
		System.out.println("세 번째 문자 : " + spell.charAt(2));
//		문자열을 입력하세요 : banana
//		첫 번째 문자 : b
//		두 번째 문자 : a
//		세 번째 문자 : n
	}

}
