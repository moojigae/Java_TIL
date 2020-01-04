package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		// 키보드로 입력 받은 하나의 정수가 양수이면 "양수다" 
		// 양수가 아니면 "양수가 아니다"를 출력
		System.out.print("하나의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = num > 0? "양수다" : "양수가 아니다"; 
		System.out.println(result);
//		하나의 정수를 입력하세요 : 5
//		양수다
	}
	public void practice2() {
		// 키보드로 입력 받은 하나의 정수가 양수이면 "양수다",
		// 양수가 아닌 경우 중에서 0이면 "0이다", 0이 아니면 "음수다"를 출력
		System.out.print("하나의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : (num == 0) ? "0이다" : "음수다";
		System.out.println(result);
//		하나의 정수를 입력하세요 : -2
//		음수다
	}
	public void practice3() {
		// 키보드로 입력 받은 하나의 정수가 짝수이면 "짝수다"
		// 짝수가 아니면 "홀수다"를 출력
		System.out.print("하나의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(result);
//		하나의 정수를 입력하세요 : 3
//		홀수다
	}
	public void practice4() {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다
		// 인원 수와 사탕 개수를 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		System.out.print("사탕 수 : ");
		int candy = sc.nextInt();
		
		int result1 = candy / person;
		int result2 = person * result1;
		
		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남는 사탕 개수 : " + (candy - result2)); 
//		인원 수 : 5
//		사탕 수 : 28
//		1인당 사탕 개수 : 5
//		남는 사탕 개수 : 3
	}
	public void practice5() {
		// 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int year = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int Class = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		float grade = sc.nextFloat();
		
		String isMan = gender == 'M' ? "남학생" : (gender == 'm') ? "남학생" : "여학생";
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다." , year, Class, number, name, isMan, grade);
//		이름 : 아무개
//		학년(숫자만) : 3
//		반(숫자만) : 2
//		번호(숫자만) : 12
//		성별(M/F) : F
//		성적(소수점 아래 둘째자리까지) : 67.89
//		3학년 2반 12번 아무개 여학생의 성적은 67.89이다.
	}
	public void practice6() {
		// 나이를 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과~19세 이하)인지
		// 성인(19세 초과)인지 출력
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		String result = age < 13 ? "어린이" : (age > 19) ? "성인" : "청소년";
		System.out.println(result);
//		나이를 입력하세요 : 19
//		청소년
	}
	public void practice7() {
		// 국어, 영어, 수학 점수를 정수로 입력 받고,
		// 세 과목에 대한 합계와 평균(합계/3.0)을 구하세요
		// 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니면 불합격 출력
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		System.out.println("합계 : "+ total);
		System.out.println("평균 : " + (float)(total / 3.0));
		System.out.println((kor >= 40 && eng >= 40 && math >= 40 && total / 3 >= 60) ? "합격" : "불합격");
//		국어 : 34
//		영어 : 78
//		수학 : 57
//		합계 : 169
//		평균 : 56.333332
//		불합격
	}
	public void practice8() {
		//주민번호를 이용해서 남자인지 여자인지 구분하여 출력
//		if(num == '1' || num == '3') {
//			System.out.println("남자");
//		} else {
//			System.out.println("여자");
//		}
		System.out.print("주민등록 번호를 입력하세요(- 포함) : ");
		char num = sc.nextLine().charAt(7);
		System.out.println(num == '1' || num == '3' ? "남자" : (num == '2' || num == '4') ? "여자" : "잘못입력하셨습니다");
//		주민등록 번호를 입력하세요(- 포함) : 981231-312345
//		남자
		
	}
	public void practice9() {
		// 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장
		// 다른 정수 하나 더 입력 받가 그 수가 num1 이하거나 num2 초과이면 true 출력
		// 아니면 false 출력. 단, num1은 num2보다 작아야 함
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if(num1 < num2) {
			max = num2;
			min = num1;
		} else { 	// num1 >= num2
			max = num1;
			min = num2;
		}
		
		boolean result = num3 < min || num3 > max;
		System.out.println(result);
//		정수1 : 3
//		정수2 : 6
//		입력 : 8
//		true
	}
	public void practice10() {
		// 3개의 수를 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false 출력
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = num1 == num2 && num1 == num3 && num2 == num3;
		
		System.out.println(result);
//		입력1 : 34
//		입력2 : 34
//		입력3 : 34
//		true
	}
	public void practice11() {
		// A, B, C 사원의 연봉을 입력 받아 각 사원의 연봉과 인센티브를 포함한 
		// 연봉을 계산하여 출력. 인센티브 포함 급여가 3000만원 이상이면 "3000 이상"
		// 미만이면 "3000 미만"을 출력
		// A 사원의 인센티브는 0.4, B 사원의 인센티브는 없음, C 사원의 인센티브 0.15
		
		System.out.print("A사원의 연봉 : ");
		int wage1 = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int wage2 = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int wage3 = sc.nextInt();
		
		double result1 = wage1 * 1.4;
		double result2 = wage2;
//		double result3 = wage3 * 1.15;
		double result3 = wage3 + wage3 * 0.15; // 표준적으로 많이 사용 됨
		// 2진수로 바꿔서 값을 넣음 = 부동소수점
		
		String result4 = result1 >= 3000 ? "3000 이상" : "3000 미만";
		String result5 = result2 >= 3000 ? "3000 이상" : "3000 미만";
		String result6 = result3 >= 3000 ? "3000 이상" : "3000 미만";
		
//		String s1 = "3000이상";
//		String s2 = "3000미만"
		
		System.out.println("A사원 연봉 / 연봉+a : " + wage1 + '/' + result1 + '\n' + result4);
		System.out.println("B사원 연봉 / 연봉+a : " + wage2 + '/' + result2 + '\n' + result5);
		System.out.println("C사원 연봉 / 연봉+a : " + wage3 + '/' + result3 + '\n' + result6);	}
//		A사원 연봉 / 연봉+a : 2400/3360.0
//		3000 이상
//		B사원 연봉 / 연봉+a : 2900/2900.0
//		3000 미만
//		C사원 연봉 / 연봉+a : 3000/3450.0
//		3000 이상

}
