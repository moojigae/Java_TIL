package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		int age; // 일반 변수 선언
		final int AGE; // 상수 선언 
		
		age = 20;
		AGE = 20;
		
		System.out.println("age: " + age); // age: 20
		System.out.println("AGE: " + AGE); // Age: 20
		
		// 변수의 값 변경
		age = 30;
//		AGE = 30;
		// The final local variable AGE may already have been assigned
		// 상수는 한 번만 선언이 가능한데 값을 변경하려고 하니 변경이 불가능하다는 에러 발생
		
		System.out.println("값 변경 후 age: " + age); // 값 변경 후 age: 30
		System.out.println("값 변경 후 AGE: " + AGE); // 값 변경 후 AGE: 20
	}
}
