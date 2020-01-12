package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a = new Account(); // 인스턴스화
		
//		현재 잔액 조회
		a.displayBalance(); // 박신우님의 계좌에 잔액은 0원입니다.
		
		a.deposit(1000000); // 박신우님의 계좌에 1000000원이 입금되었습니다.
		a.displayBalance(); // 박신우님의 계좌에 잔액은 1000000원입니다.
		
		a.deposit(1500000);	// 박신우님의 계좌에 1500000원이 입금되었습니다.
		a.displayBalance(); // 박신우님의 계좌에 잔액은 2500000원입니다.
		
		a.withdraw(500000); // 박신우님의 계좌에서 500000원이 출금되었습니다.
		a.displayBalance(); // 박신우님의 계좌에 잔액은 2000000원입니다.
		// 함수(메소드)로 접근
		
//		a.balance -= 2000000;
		// 변수로 접근
//		The field Account.balance is not visible
//		private은 나 자신(Account)에서만 볼 수 있게 제한해주기 때문에 
//		외부에서 보이지 않아 에러 뜸
		a.withdraw(500000); // 박신우님의 계좌에서 500000원이 출금되었습니다.
		a.displayBalance(); // 박신우님의 계좌에 잔액은 1500000원입니다.
	}
}
