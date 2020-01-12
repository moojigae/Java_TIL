package com.kh.example.chap01_encapsulation;

public class Account {	// 클래스 영역
//	클래스 영역에 있는 변수를 멤버 변수라고 함. 메소드 영역에 있는 변수는 아님
//	전역변수, 멤버 변수, 멤버 필드, 필드 다 같은 말
//	멤버 변수 앞에는 private 무조건 붙여야 함
	private String name = "박신우";
	private String phone = "010-9468-8140";
	private String pwd = "1q2w3e4r";
	private int bankCode = 3030;
	private int balance = 0;
	
//	입금 메소드
//	멤버 함수(메소드)는 클래스 밖에서 접근할 수 있도록 public으로 설정
	public void deposit(int money) {	// 메소드 영역
//		메소드 변수 안에서의 변수 : 지역변수 
		if(money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money + "원이 입금되었습니다.");
		} else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}
	
//	출금 메소드
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에서 " + money + "원이 출금되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다. 잔액을 확인하세요.");
		}
	}
	
//  잔액 조회 메소드
	public void displayBalance() {
		System.out.println(name + "님의 계좌에 잔액은 " + balance + "원입니다.");
	}
}
