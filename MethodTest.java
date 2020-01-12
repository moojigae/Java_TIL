package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

public class MethodTest {
//	매개변수의 유무와 반환값 유무에 따른 구분
//	1. 매개변수 없고 반환값 없는 메소드
	public void method1() {
//	      반환값x 	매개변수x
		System.out.println("매개변수와 반환값 둘 다 없는 메소드입니다.");		// 매개변수와 반환값 둘 다 없는 메소드입니다.
	}
	
//	2. 매개변수 없고 반환값 있는 메소드
	public int method2() {	
//	      반환값o 	매개변수x
//		This method must return a result of type int
//		반환형이 존재하는 메소드에서 return값을 명시해주지 않았을 때 나오는 에러
//		(현재 반환해야하는 값은 int이기 때문에 type int라고 뜨는 것
		System.out.println("반환값은 있고 매개변수는 없는 메소드입니다.");		// 반환값은 있고 매개변수는 없는 메소드입니다.
		int i = 10;	
		return i;		// 10을 반환
	}
	
//	3. 매개변수 있고 반환값 없는 메소드
	public void method3(int num1, int num2) {
//	      반환값 x              매개변수 o
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int sum = num1 + num2;
//		return; // 반환값이 void라서 반환값 없이 돌아감
		System.out.println("sum : " + sum);
//		num1 : 10
//		num2 : 20
//		sum : 30
	}
	
//	4. 매개변수 있고 반환값 있는 메소드
	public int method4(int num1, int num2) {
//	      반환값 o             매개변수 o
		return num1 + num2;			// System.out.println(mt.method4(10, 30)); --> 40 출력
//		간단한 연산의 경우 변수 없이 return에 담아서 반환 할 수 있음
	}
	
//	심화1. 반환값이 배열인 경우
	public int[] method5() {
		int[] iArr = {1,2,3,4,5};
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] *= 10;
		}
		System.out.println("MethodTest iArr : " + iArr);	// MethodTest iArr : [I@38082d64
		return iArr;
//		Run resultArr : [I@15db9742		--> 주소값을 반환했기 때문에 주소값이 출력됨
	}
	
//	심화2. 반환값이 클래스인 경우
	public User method6() {
		User user = new User("user01", "pass01","박신우");
		System.out.println("MethodTest user" + user);
		return user;
//		MethodTest usercom.kh.example.chap05_constructor.model.vo.User@6d06d69c
//		Run user : com.kh.example.chap05_constructor.model.vo.User@6d06d69c
	}
}
