package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPracticeHard {
	public void practice11() {
//	정수를 이용해서 4자리 비밀번호를 만드려고 하는데 이 때 4자리 정수를 입력 받아서 각 자리에 중복되는 값이 없을 경우 "생성 성공"
//	중복값이 있으면 "중복 값 있음" 자리 수가 안맞으면 "자리 수 안맞음" 출력
//	단, 제일 앞자리 수의 값은 1~9 사이 정수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("비밀번호 입력(1000~9999) : ");
		String pw = sc.nextLine();
		
		boolean bool = true;
		
		if(pw.length() != 4) {
			System.out.println("자리 수 안맞음");
		} else {
		for(int i = 0; i < pw.length(); i++) {
			for(int j = 0; j <pw.length(); j++) {
				if(i != j) {
				if(pw.charAt(i) == pw.charAt(j)) {
					bool = false;
				}
				}
			}
		}
		if(bool == false) {
			System.out.println("중복 값 있음");
		} else {
			System.out.println("생성 성공");
		}
	}
}
}

