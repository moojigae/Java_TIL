package com.kh.variable;

import java.util.Scanner;

public class F_keyboardInput {
	Scanner sc = new Scanner(System.in);
	public void inputScanner() {
//		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: "); // 안내 문구 역할
		String name = sc.nextLine();
		// sc.nextLine(); 값 받을 때 까지 커서 깜빡거리며 대기하는 명령

		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.print("키(소수점 첫째 자리까지 입력) : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님은 " + age + "세이며, 키는 " + height +"cm 입니다.");
	}
	
	public void inputScanner2() {
		// 사용자에게 이름과 나이를 입력 받기
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요: ");
//		int age = sc.nextInt();
//		System.out.print("주소를 입력하세요: ");
//		String address = sc.nextLine();
		
//		해결하는 방법
		
//		방법1. 줄바꿈을 가져갈 수 있는 nextLine() 추가
//		int age = sc.nextInt();
//		sc.nextLine(); // 버퍼에 남아있는 줄바꿈만 가져가는 역할
//		System.out.print("주소를 입력하세요: ");
//		String address = sc.nextLine();
		
//		방법2. age를 받을 때도 nextLine()을 쓰되 int로 파싱하기 
//		파싱: 문자열을 기본자료형으로 바꿔주는 작업 / int로 바꿀 때 "1"로 되어 있는건 가능/ "정무지개"로 되어 있는건 불가능
//		boolean으로 바꿀 떄 "true"는 가능 "정무지개"는 불가능
//		String userAge = sc.nextLine();
//		int age = Integer.parseInt(userAge);   // 두 줄 표현
		int age = Integer.parseInt(sc.nextLine()); // 한 줄 표현
		System.out.print("주소를 입력하세요: ");
		String address = sc.nextLine();
		
//		방법3. next()로 주소를 받기
//		한계 : next() 메소드는 띄어쓰기를 한 값의 경우 처음 값만 인식
//		int age = sc.nextInt();
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.next();
		// next는 띄어쓰기를 구분자로 인식 
		
		// + 추가 : char형을 받고 싶을 때는?
		System.out.print("성별을 입력하세요 : "); // F/M
//		String userGender = sc.nextLine();
//		char gender = userGender.charAt(0);
		char gender = sc.nextLine().charAt(0); // 한 줄 파싱
		// charAt(index)메소드는 문자열에서 index 번째의 문자를 가져옴 
		// string은 char의 집합
		// Zero-index 제로 인덱스 기반 : 0부터 숫자를 세는 것
		
		System.out.println(name + "님은 " + age + "세이며, 주소는 " + address + "입니다.");
		System.out.println("gender : " + gender);
	}
}
