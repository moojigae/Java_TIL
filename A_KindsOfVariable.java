package com.kh.example.chap04_field.control;

public class A_KindsOfVariable { // <== 클래스 영역의 시작
//	클래스 영역에 작성하는 변수 : 필드
//	== 멤버변수 
//	== 멤버필드
//	== 전역변수 
	private int globalNum;	
	
	public void method1(int num) { // <== 메소드 영역의 시작
//		 				--------매개변수 : 메소드의 선언부 중 괄호 안에 선언하는 변수
//		매개변수 : 외부든 내부든 다른 곳에서 값을 받아오는 역할을 함
//		매개변수 역시 지역변수의 일종으로 생각함
//		메소드 영역에서 작성하는 변수 : 지역변수
		int localNum = 10;
		
		System.out.println(localNum);	// 10
//		The local variable localNum may not have been initialized
//		지역변수는 반드시 초기화되어 있어야 하는데 초기화가 안되서 뜨는 에러

		System.out.println(num);		// 20 	매개변수로 넘긴 값 출력
//		 매개변수는 값이 받아져 와 있는 상태이기 때문에 따로 초기화 안해도 됨
		
		System.out.println(globalNum);	// 0 	값 초기화가 안되어 있기 때문에 jvm 기본값 출력
//		전역변수이기 때문에 에러 없이 바로 출력됨 
		
	} // <== 메소드 영역의 끝
	
	public void method2() {
//		num = 0;
//		method1에서 선언한 매개변수는 지역변수이기 때문에 외부에서는 사용 할 수 없음
//		System.out.println(localnum);
//		localnum cannot be resolved to a variable 
//		지역변수는 해당지역 내에서만 사용 가능. 영역 밖에서 사용하려고 해서 에러남
		System.out.println(globalNum); // 0
	}
} // <== 클래스 영역의 끝
