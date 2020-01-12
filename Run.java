package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.control.A_KindsOfVariable;
import com.kh.example.chap04_field.control.B_KindsOfVariable2;
import com.kh.example.chap04_field.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		
		A_KindsOfVariable akv = new A_KindsOfVariable();
//		akv.method1(20);
//		akv.method2();
		
		// 객체 생성 : B_KindsOfVariable2
		
		B_KindsOfVariable2 bkv = new B_KindsOfVariable2();
//		                         ------------------------ 생성자
//		bkv.staticNum;
//		Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
//		staticNum을 가지고 왔으나 담을 곳이 없어서 에러. 변수에 담아줘야 함
		
//		static에 대해서 접근 할 때 객체 생성없이 class명.변수명 가능
//		int a = bkv.staticNum;
//		The static field B_KindsOfVariable2.staticNum should be accessed in a static way
//		static으로 만들면 객체 만들 필요없이 class명.변수명으로 접근하면 된다고 노란색 경고메세지 발생
		
		int a1 = B_KindsOfVariable2.staticNum;
//		com.kh.example.chap04_field.control.B_KindsOfVariable2으로 static영역에 올라가기 때문에 객체 생성 없이 가능
		
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();

		Product p = new Product();
		p.inform();
//		1. JVM 기본값 초기화 : null, null, 0, 0
//		2. 명시적 초기화 : 초코파이, 오리온, 1500, 100
//		3. 인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 90
		
		Product p2 = new Product();
		p2.inform();
//		인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 80
		
		Product p3 = new Product();
		p3.inform();
//		인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 70
//		칸초, 롯데, 1000, 139
//		칸초, 롯데, 1000, 129
//		칸초, 롯데, 1000, 119
	}
}
