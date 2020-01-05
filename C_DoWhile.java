package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	Scanner sc = new Scanner(System.in);
	public void method1() {
		// 키보드로 문자열 값을 입력 받아 출력 반복 실행
		// 단, exit가 들어오면 반복 종료
		/*
		 * 문자열 입력 : 안녕하세요
		 * str : 안녕하세요
		 * 문자열 입력 : apple
		 * str : apple
		 * 문자열 입력 : exit
		 * str : exit
		 * */
		
//		 1. while
		
//		String str = null; // null = 빈공간도 아니고 아무것도 아닌
//		while(!str.equals("exit")) null과 exit을 비교하려고 하면 에러 발생
//		 Exception in thread "main" java.lang.NullPointerException
//		 null은 아무것도 아닌 값이기 때문에 비교대상이 될 수 없어서 뜨는 에러
//		String str = "";
//		while(!str.equals("exit")){
//		System.out.print("문자열 입력 : ");
//		str = sc.nextLine();
//		System.out.println("str : " + str);
//		}
		
		// 2. do ~while
		String str = null;
		// do ~while에서는 무조건 한 번은 실행이 되기 때문에 string에 
		// 값을 받아 올 수 있고 그 이후 while에서 비교하기 때문에 null 사용 가능
		do {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		} while(!str.equals("exit"));
		
//		문자열 입력 : apple
//		str : apple
//		문자열 입력 : rainbow
//		str : rainbow
//		문자열 입력 : exit
//		str : exit
	}
	public void method2() {
		
		int menuNum = 0;
		do {
		System.out.println("1. 테스트 1");
		System.out.println("2. 테스트 2");
		System.out.println("3. 테스트 3");
		System.out.println("9. 종료");
		System.out.println("메뉴 선택 : ");
		menuNum = sc.nextInt();
		
		switch(menuNum) {
			case 1 : System.out.println(1); break;
			case 2 : System.out.println(2); break;
			case 3 : System.out.println(3); break;
			case 9 : System.out.println(9); break;
			default : System.out.println("잘못입력하셨습니다");
		}
		} while (menuNum != 9);	
//		1. 테스트 1
//		2. 테스트 2
//		3. 테스트 3
//		9. 종료
//		메뉴 선택 : 
//		2
//		2
//		1. 테스트 1
//		2. 테스트 2
//		3. 테스트 3
//		9. 종료
//		메뉴 선택 : 
	}
}



























