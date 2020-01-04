package com.kh.variable;

public class E_PrintMethod {
	// 전역변수 : 클래스 안에 변수를 선언하면 메소드 안에서 사용 가능
	String str1 = "안녕하세요";
	String str2 = "반갑습니다";
	public void printExample() {
//		 print 메소드는 띄어쓰기 없이 변수의 값이 출력됨
		
// 		지역변수 : 메소드 안에서 선언한 변수는 같은 메소드 안에서만 사용 가능	

//		String str1 = "안녕하세요";
//		String str2 = "반갑습니다";
		
		System.out.print(str1);
		System.out.print(str2);  // 안녕하세요반갑습니다
	}
	public void printlnExample() {
//		println 메소드는 자동으로 줄바꿈을하여 출력
		
//		String str1 = "안녕하세요";
//		String str2 = "반갑습니다";
		
		System.out.println(str1);
		System.out.println(str2);
		// 안녕하세요 
		// 반갑습니다
	}
	public void printfExample() {
//		printf는 정해져 있는 형식에 맞춰 그 형식에 맞는 값(변수)을 줄바꿈 없이 출력
//		 printf("", ) 기본 형태
//		 ""안에는 받을 형식을 작성
//		printf 형식들
//		- %d : 정수형, %o : 8진수, %x : 16진수
//		- %c : 문자, %s : 문자열
//		- %f : 실수(소수점 아래 6자리), %e : 지수형태표현, %g : 대입 값 그대로, %A : 16진수 실수
//		- %b : 논리형
//		정렬방법
//		%5d : 출력 위치에 5칸을 확보하고 오른쪽 정렬
//		%-5d : 출력 위치에 5칸을 확보하고 왼쪽 정렬
//		%.2f : 소수점 아래 2자리 까지만 표시

		System.out.printf("%s,정무지개입니다. %s.", str1, str2);
		// 안녕하세요, 정무지개입니다. 반갑습니다.
		
		
		System.out.printf("%s,친하게 지내요.",str2); // 반갑습니다, 친하게 지내요.
		
		System.out.println();
		
		// 미니 문제
		int age = 20;
		String name = "박신우";
		String job = "강사";
		
		System.out.printf("%s, 저는  %d살 %s %s입니다. 만나서 %s.", str1, age, name, job, str2);
		// 안녕하세요, 저는 20살 박신우 강사입니다. 만나서 반갑습니다.
		
	}
}
