package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 * while(조건식){
	 * 		실행 문장;
	 * 		[증감식 or 분기문];
	 * }
	 * 조건식 확인 -> 조건식 true 일 때 실행 문장 수행 -> 조건식 확인 -> 반복 
	 * 조건식 결과가 false가 될 때 까지 반복
	 * */
	public void method1() {
		// 1부터 5까지 출력
		int i = 1;
		while(i <= 5) {
			System.out.println(i + "번째 반복문 수행");
			i++;
//			1번째 반복문 수행
//			2번째 반복문 수행
//			3번째 반복문 수행
//			4번째 반복문 수행
//			5번째 반복문 수행
		}
	}
	
	public void method1_1() {
		// 자기 소개 다섯번 하기 : 내 이름은 박신우야
		int i= 1;
		while(i <= 5){
			System.out.println("내 이름은 박신우야");
			i++;
//			내 이름은 박신우야
//			내 이름은 박신우야
//			내 이름은 박신우야
//			내 이름은 박신우야
//			내 이름은 박신우야
		}
	}
	
	public void method2() {
		// 5부터 1까지
		int i = 5;
		while(i >= 1) {
			System.out.println(i);
			i--;
//			5
//			4
//			3
//			2
//			1
		}
	}
	
	public void method3() {
		// 1에서 10사이의 홀수만 출력
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i+=2;
//			1
//			3
//			5
//			7
//			9
		}
	}
	
	public void method4() {
		// 정수 두 개를 입력받아 그 사이 숫자 출력
		// 정수 두 개를 입력하세요.
		// 단, 첫 번째 숫자가 두 번째 숫자보다 작게 입력해주세요.
		// 첫 번째 숫자 : 
		// 두 번째 숫자:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요.");
		System.out.println("단, 첫 번째 숫자가 두 번째 숫자보다 작게 입력해주세요.");
		System.out.print("첫 번째 숫자 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int second = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if (first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}
		while(min <= max) {
			System.out.print(min + " ");
			min++;
//			정수 두 개를 입력하세요.
//			단, 첫 번째 숫자가 두 번째 숫자보다 작게 입력해주세요.
//			첫 번째 숫자 : 9
//			두 번째 숫자 : 4
//			4 5 6 7 8 9 
		}
	}
	public void method4_1() {
		// 정수를 하나 입력 받아 그 수가 1~9 사이의 구 일 때만 그 수의 구구단 출력
		// 조건이 맞지 않으면 1~9 사이의 양수를 입력하여야 합니다 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		int i = 1;
		
		if (dan >= 2 && dan <= 9) {
			while (i <= 9) {
				System.out.printf("%d * %d = %d%n", dan, i, (dan*i));
				i++;
			}
		} else {
			System.out.println("1~9 사이의 양수를 입력하여야합니다");
		}
//		수를 입력하세요 : 23
//		1~9 사이의 양수를 입력하여야합니다
		
//		수를 입력하세요 : 4
//		4 * 1 = 4
//		4 * 2 = 8
//		4 * 3 = 12
//		4 * 4 = 16
//		4 * 5 = 20
//		4 * 6 = 24
//		4 * 7 = 28
//		4 * 8 = 32
//		4 * 9 = 36
	}
	
	public void method5() {
		//1 부터 10사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계 출력
		int sum = 0;
		int random = (int)(Math.random() * 10 + 1);
		int i = 1;
		
		while(i <= random) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 %d까지 정수 합계 : %d", random, sum);
//		1부터 5까지 정수 합계 : 15
	}
	
	public void method6() {
		// 사용자에게 문자열을 입력 받아 인덱스 별로 문자 출력
		// 문자열 입력 : apple
		// 0 : a
		// 1 : p
		// 2 : p
		// 3 : l
		// 4 : e
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		// 문자열의 길이를 반환하는 메소드 : length()
//		int length = str.length();
		
		// for
//		for(int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			System.out.println(i + " : " + ch);
//		}
		
		// while
		int i = 0;
//		while(i < str.length()) {
//			char ch = str.charAt(i);
//			System.out.println(i + " : " + ch);
//			i++;
//		}
		while(i < str.length()) {
			System.out.println(i + " : " + str.charAt(i));
			i++;
		}
	}
	public void method7() {
		//2단부터 9단까지 출력
		
		int dan = 2;
		while(dan <= 9) {
			int su = 1; // while문이 돌고 su가 1로 초기화 됨
			while(su <= 9) {
				System.out.printf("%d * %d = %d%n", dan, su, (dan*su));
				su++;
			} 
			dan++;
			System.out.println();
//			su = 1; // su를 밖에 선언하려면 1을 여기서 초기화 시킴
		}
	}
	public void method8() {
		// 아날로그 시계 출력
		
		int hour = 0;
		while(hour < 24) {
			int min = 0;
			while(min <= 59) {
//				System.out.println(hour + "시 " + min + "분");
				System.out.printf("%02d시 %02d분%n ", hour, min);
//				%2d 가운데 2만큼 자리를 확보하겠다 // 숫자가 없으면 기본적으로 오른쪽 정렬
//				 - 가 붙으면 왼쪽 정렬
				min++;
			}
			hour++;
		}
	}
	public void method9() {
		// 메뉴 출력에 while문이 많이 사용 됨
		// while을 활용해서 9번 종료합니다 만나기 전까지 메뉴 번호와 
		// 메뉴 선택을 반복해서 출력
		
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;
		while(menuNum != 9) {			
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 1~10까지 홀수 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			menuNum = sc.nextInt(); // 메뉴 입력한 번호가 들어감
			
			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 9: System.out.println("종료합니다."); break;
			default: System.out.println("잘못입력하셨습니다.");
			}
		}
		// menuNum에 받은 번호의 case 실행하고 switch문 실행 후 나감 ->
		// while문으로 가서 조건에 맞는지 확인 -> false까지 반복 실행
		
//		1. 1~5까지 출력
//		2. 5~1까지 출력
//		3. 1~10까지 홀수 출력
//		9. 종료
//		메뉴 선택 : 2
//		5
//		4
//		3
//		2
//		1
//		1. 1~5까지 출력
//		2. 5~1까지 출력
//		3. 1~10까지 홀수 출력
//		9. 종료
//		메뉴 선택 : 3
//		1
//		3
//		5
//		7
//		9
//		1. 1~5까지 출력
//		2. 5~1까지 출력
//		3. 1~10까지 홀수 출력
//		9. 종료
//		메뉴 선택 : 1
//		1번째 반복문 수행
//		2번째 반복문 수행
//		3번째 반복문 수행
//		4번째 반복문 수행
//		5번째 반복문 수행
//		1. 1~5까지 출력
//		2. 5~1까지 출력
//		3. 1~10까지 홀수 출력
//		9. 종료
//		메뉴 선택 : 9
//		종료합니다.
	}
}



















