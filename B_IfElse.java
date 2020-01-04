package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	// if-else문
//	if(조건식) {
//		실행할 문장1;
//	} else {
//		실행할 문장2;
//	}
	// 둘 중 한 개를 선택하는 조건문
	// 조건식 결과 값이 참이면 if문 안에 있는 실행할 문장1 수행
	// 조건식 결과 값이 거짓이면 if문을 빠져나와 else문 안에 있는 실행할 문장 2 수핼
	Scanner sc = new Scanner(System.in);
	public void method1() {
		// 키보드로 입력한 숫자가 짝수인지 홀수인지 출력
			
		// "숫자 한 개를 입력하세요 : " 안내문구 출력 후 num 변수에 데이터 저장
		// 짝수이면 "입력하신 숫자는 짝수입니다.", 홀수이면 "입력하신 숫자는 홀수입니다." 출력
		// 프로그램이 끝날 때 "프로그램 종료"까지 출력 후 프로그램 종료
				
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
				
		if(num % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		} else {
			System.out.println("입력하신 숫자는 홀수입니다");
			}
		System.out.println("프로그램 종료");
	}
//	숫자를 한 개 입력하세요 : 5
//	입력하신 숫자는 홀수입니다
//	프로그램 종료
	
	public void method2() {
		// 사용자에게 국어, 영어, 수학 점수를 입력받아서 각각 kor, eng, math 변수에 저장
		// 각 과목 점수가 40점 이상이고 세 과목 평균 점수가 60점 이상일 때 "시험 통과",
		// 하나라도 기준 미달일 때 "시험 불통과" 출력
		
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("시험 통과");
		} else {
			System.out.println("시험 불통과");
//		국어 점수를 입력하세요 : 40
//		영어 점수를 입력하세요 : 30
//		수학 점수를 입력하세요 : 60
//		시험 불통과
		}
	}
	
	public void method3() {
		// String은 ==으로 같은 값인지 비교할 수 없음
		// == 비교는 숫자 char boolean 비교할 때 쓰임
		// 문자열 비교하기 : String클래스 안에 있는 equals()
		// boolean java.lang.String.equals(Object object)
		// java.lang 패키지 안에 String 클래스 안에 equals메소드
		// equals가 나타내는 반환값이 boolean으로 나타남

		// 사용자에게 이름을 받는데 내가 지정한 이름과 같으면 "본인입니다"
		// 같지 않으면 "본인이 아닙니다" 출력
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
//		name 안에 있는 값이랑 "박신우"랑 값이 같니?
		if(name.equals("박신우")) {		// 같으면 true
			System.out.println("본인입니다.");
		} else {
			System.out.println("본인이 아닙니다.");
//			이름을 입력하세요 : 박신우
//			본인입니다.

		}
	}
}
