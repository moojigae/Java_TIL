package com.kh.example.chap06_method.run;

import com.kh.example.chap05_constructor.model.vo.User;
import com.kh.example.chap06_method.controller.MethodTest;
import com.kh.example.chap06_method.model.vo.Traniee;

public class Run {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
//		mt.method1();
//		매개변수와 반환값 둘 다 없는 메소드입니다. 만 출력하고 
//		반환값 없이 끝남
		
//		int result = mt.method2();
//		System.out.println(result);
//		2줄 출력
//		System.out.println(mt.method2());
//		1줄 출력
		
//		mt.method3(10, 20);
		
//		System.out.println(mt.method4(10, 30));
		
//		심화1
		int[] resultArr = mt.method5();
		System.out.println("Run resultArr : " + resultArr);
		
//		심화2
		User user = mt.method6();
		System.out.println("Run user : " + user);
		
		Traniee tt = new Traniee("박신우"); // 대기생
		System.out.println(tt.inform()); // 박신우, KH,  , 0.0
		
//		시험 20점
		Traniee.setScore(20);
		System.out.println(tt.inform());	// 박신우, KH,  , 20.0
		double score = Traniee.getScore();
		System.out.println(score);	// 20.0
		
		// g반 등록
		tt.setClassRoom('G');
		System.out.println(tt.inform());	// 박신우, KH, G, 20.0
		System.out.println(tt.getClassRoom());	// G
	}
	
}
