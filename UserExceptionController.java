package com.kh.example.chap03_user.controller;

import java.util.Scanner;

import com.kh.example.chap03_user.model.exception.MyException;

public class UserExceptionController {
	public void inputAge() {
//		나이를 입력하세요 라는 문구가 뜨고 거기에 사용자가 나이를 입력하면 age 변수에 입력받은 값을 저장
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
//		19살미만 입장 불가
		try {
		checkAge(age);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void checkAge(int age) throws MyException { // 선언부 뒤에 throws 붙어야 함
		if(age < 19) {
			throw new MyException("입장불가");
		} else {
			System.out.println("즐감");
		}
	}
}
