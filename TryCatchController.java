package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1() 호출 됨...");
		try {
			method2();
			System.out.println("예외 발생 시에 출력될까? method2에서 예외 발생하니까 catch로 넘어가서 출력 안됨 ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.out.println(e.getMessage()); // IOException을 강제로 발생시켰습니다 / e.getMessage() 메세지만 넘기고 싶을 때
		} catch(Exception e) {
			System.out.println("Exception으로 잡음");
		} finally {
			System.out.println("예외 발생 여부와 상관 없이 무조건 수행됨");
		}
		System.out.println("method1() 종료 됨...");
	}
	
	public void method2() throws IOException {
		System.out.println("method2() 호출 됨...");
		method3();
		System.out.println("method2() 종료 됨...");	// 실행 안됨
	}
	
	public void method3() throws IOException {
		System.out.println("method3() 호출 됨...");
		throw new IOException("IOException을 강제로 발생시켰습니다"); // 발생할 때 이러한 메세지를 넘기겠다라는걸 매개변수 안에 넣음
//		System.out.println("method3() 종료 됨..."); 	실행 안되는 코드
	}
}
