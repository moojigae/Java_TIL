package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
   Scanner sc = new Scanner(System.in);
   public void practice1() {
      // 아래 예시와 같이 메뉴를 출력학고 메뉴 번호를 누르면
      // "00 메뉴입니다"를, 종료 번호를 누르면 
      // "프로그램이 종료됩니다."를 출력하세요
            
      System.out.println("1. 입력");
      System.out.println("2. 수정");
      System.out.println("3. 조회");
      System.out.println("4. 삭제");
      System.out.println("7. 종료");
      
      System.out.println("메뉴 번호를 입력하세요 : ");
      int menuNum = sc.nextInt();
      
      switch(menuNum) {
      case 1: 
         System.out.println("입력 메뉴입니다.");
         break;
      case 2:
         System.out.println("수정 메뉴입니다.");
         break;
      case 3:
         System.out.println("조회 메뉴입니다.");
         break;
      case 4:
         System.out.println("삭제 메뉴입니다.");
         break;
      case 7:
         System.out.println("프로그램이 종료됩니다.");
         break;
//         1. 입력
//         2. 수정
//         3. 조회
//         4. 삭제
//         7. 종료
//         메뉴 번호를 입력하세요 : 
//         3
//         조회 메뉴입니다.
      }
   }
   
   public void practice2() {
      // 입력 받은 정수가 양수이면서 짝수일 때만 "짝수다"를 출력하고
      // 짝수가 아니면 "홀수다"를 출력하세요
      // 양수가 아니면 "양수만 입력해주세요."를 출력하세요
      
      System.out.println("정수 하나를 입력하세요 : ");
      int num = sc.nextInt();
      if (num > 0 && num % 2 == 0) {
         System.out.println("짝수다");
      } else if (num % 2 != 0) {
         System.out.println("홀수다");
      } else {
         System.out.println("양수만 입력해주세요.");
//         정수 하나를 입력하세요 : 
//         -2
//         양수만 입력해주세요.
      }
   }
   
   public void practice3() {
      // 국어, 영어, 수학 세 과목의 점수를 입력 받고 합계와 평균을 계산하고
      // 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요
      // 합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우
      // 합격 했을 경우 과목 별 점수와 합계, 평균, "축하합니다. 합격입니다!"를 출력
      // 불합격인 경우에는 "불합격입니다."를 출력하세요
      
      System.out.println("국어 점수를 입력하세요 : ");
      int kor = sc.nextInt();
      System.out.println("영어 점수를 입력하세요 : ");
      int eng = sc.nextInt();
      System.out.println("수학 점수를 입력하세요 : ");
      int math = sc.nextInt();
      
      int sum = kor + eng + math;
      float aver = sum / 3;
      
      if (kor > 40 && eng > 40 && math > 40 && sum >= 60) {
         System.out.println("국어 : " + kor);
         System.out.println("수학 : " + math);
         System.out.println("영어 : " + eng);
         System.out.println("합계 : " + sum);
         System.out.println("평균 : " + aver);
         System.out.println("축하합니다. 합격입니다!");
      } else {
         System.out.println("불합격입니다.");
//         국어 점수를 입력하세요 : 
//         68
//         영어 점수를 입력하세요 : 
//         50
//         수학 점수를 입력하세요 : 
//         40
//         불합격입니다.
         
//         국어 점수를 입력하세요 : 
//         88
//         영어 점수를 입력하세요 : 
//         50
//         수학 점수를 입력하세요 : 
//         45
//         국어 : 88
//         수학 : 45
//         영어 : 50
//         합계 : 183
//         평균 : 61.0
//         축하합니다. 합격입니다!
      }
   }
   public void practice4() {
      // 수업 자료(7 page)에서 if문으로 되어있는 봄,여름,가을,겨울 예제를
      // switch문으로 바꿔서 출력하세요
      
      System.out.println("1~12 사이의 정수 입력 : ");
      int month = sc.nextInt();
      
      switch(month) {
      case 1: case 2: case 12:
         System.out.println(month + "월은 겨울입니다.");
         break;
      case 3: case 4: case 5:
         System.out.println(month + "월은 봄입니다.");
         break;
      case 6: case 7: case 8:
         System.out.println(month + "월은 여름입니다.");
         break;
      case 9: case 10: case 11:
         System.out.println(month + "월은 가을입니다.");
         break;
      default : 
         System.out.println(month + "월은 잘못 입력된 달입니다.");
//         1~12 사이의 정수 입력 : 
//         8
//         8월은 여름입니다.
         
//         1~12 사이의 정수 입력 : 
//         99
//         99월은 잘못 입력된 달입니다.
      }
   }
   
   public void practice5() {
      // 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
      // 로그인 성공 시 "로그인 성공", 아이디가 틀렸을 시 "아이디가 틀렸습니다",
      // 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다."를 출력하세요.
      
      /* 
       * ex 1.               ex 2.
       * 아이디 : myId            아이디 : myId
       * 비밀번호 : myPassword12      비밀번호 : myPassword
       * 로그인 성공               비밀번호가 틀렸습니다.
       * 
       * ex 3.
       * 아이디 : my
       * 비밀번호 : myPassword12
       * 아이디가 틀렸습니다.
       * */
      
      String id = "myId";
      String password = "myPassword12";
      
      System.out.println("아이디 : ");
      String userId = sc.nextLine();
      System.out.println("비밀번호 : ");
      String userPassword = sc.nextLine();
      
//      System.out.print(!id.equals(userId));
      
      if (!id.equals(userId)) {
         System.out.println("아이디가 틀렸습니다.");
      } else if (!password.equals(userPassword)) {
         System.out.println("비밀번호가 틀렸습니다.");
      } else {
         System.out.println("로그인 성공");
//         아이디 : 
//         myId
//         비밀번호 : 
//         myPassword12
//         로그인 성공
//         아이디 : 
//         my
//         비밀번호 : 
//         myPassword12
//         아이디가 틀렸습니다.
      }
   }
   
   public void practice6() {
      // 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는
      // 권한을 출력하세요. 단, 관리자는 회원관리, 게시글 관리, 게시글 작성,
      // 게시글 조회, 댓글 작성이 가능하고 
      // 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고 
      // 비회원은 게시글 조회만 가능
      
      System.out.println("권한을 확인하고자 하는 회원 등급 : ");
      String right = sc.nextLine();
      
      switch (right) {
      case "관리자":
         System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
         break;
      case "회원" :
         System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
         break;
      case "비회원" :
         System.out.println("게시글 조회");
         break;
//         권한을 확인하고자 하는 회원 등급 : 
//         관리자
//         회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회
      }
   }
   
   public void practice7() {
      // 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
      // 저체중/정상체중/과체중/비만을 출력하세요
      // BMI = 몸무게 / (키(m) * 키(m))
      // BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
      // BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
      // BMI가 30이상일 경우 고도 비만
      
      System.out.println("키(m)를 입력해주세요 : ");
      double height = sc.nextDouble();
      System.out.println("몸무게(kg)를 입력해주세요 : ");
      double weight = sc.nextDouble();
      
      double bmi = weight / (height * height);
      System.out.println("BMI 지수 : " + bmi);
      
      if (bmi >= 18.5 || bmi < 23) {
         System.out.println("정상체중");
      } else if (bmi >= 23 || bmi < 25) {
         System.out.println("과체중");
      } else if (bmi >= 25 || bmi < 30) {
         System.out.println("비만");
      } else if (bmi >= 30) {
         System.out.println("고도 비만");
      } else if (bmi < 18.5) {
         System.out.println("저체중");
//         키(m)를 입력해주세요 : 
//         1.65
//         몸무게(kg)를 입력해주세요 : 
//         58.4
//         BMI 지수 : 21.45087235996327
//         정상체중
      }
   }
   
   public void practice8() {
      // 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요
      // 단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
      // "잘못 입력하셨습니다. 프로그램을 종료합니다." 출력
            
      System.out.println("피연산자1 입력 : ");
      int num1 = sc.nextInt();
      System.out.println("피연산자2 입력 : ");
      int num2 = sc.nextInt();
      sc.nextLine();
      System.out.println("연산자를 입력(+,-,*,/,%) : ");
      char op = sc.nextLine().charAt(0);
      
      float result = 0.0f;
      
      switch(op) {
      case '+' : result = num1 + num2; break;
      case '-' : result = num1 - num2; break;
      case '*' : result = num1 * num2; break;
      case '/' : result = (float)num1 / num2; break;
      case '%' : result = num1 % num2; break;
      default : System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
      }
      if(op == '/') {
    	  System.out.printf("%d %c %d = %f",num1,op,num2,result);
      } else if(op == '+' || op == '-' || op == '*' || op == '%') {
    	  System.out.printf("%d %c %d = %d",num1,op,num2,(int)result);   
      }
//      피연산자1 입력 : 
//      15
//      피연산자2 입력 : 
//      4
//      연산자를 입력(+,-,*,/,%) : 
//      /
//      15 / 4 = 3.750000
      
//      내가 푼 방법
//      if (num1 > 0 && num2 >0) {
//         if (op == '+') {
//            result = num1 + num2;
//         } else if (op == '-') {
//            result = num1 - num2;
//         } else if (op == '*') {
//            result = num1 * num2;
//         } else if (op == '/') {
//            result = (float)num1 / num2;
//            // (double)(num1 / num2); 은 결과값을 double로 바꾸는 것
//         } else if (op == '%') {
//            result = num1 % num2;
//         } else {
//            System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
//         } 
//      }
//      System.out.printf("%d %c %d = %f",num1,op,num2,result);
   }
   
   public void practice9() {
      // 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력
      // 평가 비율은 중간고사 20%, 기말고사 30%, 출석 20%로 이루어져 있고
      // 이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서
      // 출석한 날만 따진 값으로 계산. 70점 이상일 경우 pass, 
      // 70점 미만이거나 전체 강의에 30% 이상 결석 시 fail 출력
      
      System.out.println("중간 고사 점수 : ");
      int middle = sc.nextInt();
      System.out.println("기말 고사 점수 : ");
      int fanal = sc.nextInt();
      System.out.println("과제 점수 : ");
      int homework = sc.nextInt();
      System.out.println("출석 회수 : ");
      float attend = sc.nextInt();
      
      System.out.println("=== 결과 ===");
      
      float middleResult = (float)0.2 * middle;
      float fanalResult = (float)0.3 * fanal;
      float homeworkResult = (float)0.3 * homework;
//    float attendResult = attend / 20.0 * 100 * 0.2;
      float sum = middleResult + fanalResult + homeworkResult + attend;
      
      if(attend <= 14) {
    	  System.out.println("Fail [출석 회수 부족 (" + attend + "/20)]");
      } else if(sum < 70) {
    	  System.out.printf("중간 고사 점수(20) : %.1f \n", middleResult);
    	  System.out.printf("기말 고사 점수(30) : %.1f \n", fanalResult);
    	  System.out.printf("과제 점수    (30) : %.1f \n", homeworkResult);
    	  System.out.printf("출석        (20) : %.1f \n", attend);
    	  System.out.printf("총점 : %.1f \n", sum);
    	  System.out.println("Fail [점수 미달]");
      } else {
    	  System.out.printf("중간 고사 점수(20) : %.1f \n", middleResult);
    	  System.out.printf("기말 고사 점수(30) : %.1f \n", fanalResult);
    	  System.out.printf("과제 점수    (30) : %.1f \n", homeworkResult);
    	  System.out.printf("출석        (20) : %.1f \n", attend);
    	  System.out.printf("총점 : %.1f \n", sum);
    	  System.out.println("Pass");
      }   
//      중간 고사 점수 : 
//      100
//      기말 고사 점수 : 
//      80
//      과제 점수 : 
//      40
//      출석 회수 : 
//      10
//      === 결과 ===
//      Fail [출석 회수 부족 (10.0/20)]
      
//      if(attend >= 20 * 0.7) {
//      System.out.println("중간 고사 점수(20) : middleResult * 0.2);
//      System.out.println("기말 고사 점수(30) : fanalResult * 0.3);
//      System.out.println("과제 점수    (30) : homeworkResult * 0.3);
//      System.out.println("출석        (20) : attend / 20.0 * 100 * 0.2);
      
//      float sum = middleResult + fanalResult + homeworkResult + attend;
      
//      if(sum >= 70){
//         System.out.println("Pass");
//      } else {
//      System.out.println("Fail [점수 미달]");
//      }
//      } else {
//         System.out.println("Fail [출석 회수 부족 (" + attend + "/20)]");
//      }
      
   }
   public void practice10() {
      // 앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하라
      System.out.println("실행할 기능을 선택하세요.");
      System.out.println("1. 메뉴 출력");
      System.out.println("2. 짝수/홀수");
      System.out.println("3. 합격/불합격");
      System.out.println("4. 계절");
      System.out.println("5. 로그인");
      System.out.println("6. 권한 확인");
      System.out.println("7. BMI");
      System.out.println("8. 계산기");
      System.out.println("9. P/F");
      System.out.println("선택 : ");
      int menuNum = sc.nextInt();
      
      switch(menuNum) {
      case 1: practice1(); break;
      case 2: practice2(); break;
      case 3: practice3(); break;
      case 4: practice4(); break;
      case 5: practice5(); break;
      case 6: practice6(); break;
      case 7: practice7(); break;
      case 8: practice8(); break;
      case 9: practice9(); break; 
      
//      실행할 기능을 선택하세요.
//      1. 메뉴 출력
//      2. 짝수/홀수
//      3. 합격/불합격
//      4. 계절
//      5. 로그인
//      6. 권한 확인
//      7. BMI
//      8. 계산기
//      9. P/F
//      선택 : 
//      2
//      정수 하나를 입력하세요 : 
//      5
//      홀수다
      }
   }
}