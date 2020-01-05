package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
//    for(초기식;조건식;증감식){
//         실행할 문장
//      }
//    초기식 -> 조건식 -> (조건식이 true 일 때 )실행할 문장 -> 증감식 -> 조건식 -> 실행문장 -> 증감식 -> 조건식 (반복)
//    조건식 결과가 false가 될 때 까지 반복
//    증감식은 반복문을 끝내기 위한 하나의 장치이다
   
//    for 문 안에 있는 초기식, 조건식, 증감식 모두 생략 가능
//    하지만, 모두 생략 했을 때 반복문이 무한으로 돌기 때문에
//    for문 안이나 밖에다가 초기식은 무엇인지 조건은 무엇인지 증감은 얼마나 될건지를 모두 표기 해야함 
//    즉, for()안에서만 생략될 뿐 모두 필요한 요소임
	
   public void method1() {
      // 1부터 5까지 출력
      for(int i = 1; i <= 5; i++) {
         System.out.println(i + "번째 반복문 수행");
//         1번째 반복문 수행
//         2번째 반복문 수행
//         3번째 반복문 수행
//         4번째 반복문 수행
//         5번째 반복문 수행
      }
   }
   
   public void method1_1() {
      for(int i = 1; i <= 5; i++) {
         System.out.println("내 이름은 정무지개입니다.");
//         내 이름은 정무지개입니다.
//         내 이름은 정무지개입니다.
//         내 이름은 정무지개입니다.
//         내 이름은 정무지개입니다.
//         내 이름은 정무지개입니다.
      }
   }
   
   public void method2() {
      for(int i = 5; i >= 1; i--) {
         System.out.println(i);
//         5
//         4
//         3
//         2
//         1
      }
//      방법2.
//      for(int i = 1; i <= 5; i++) {
//         System.out.println(6 - i);
//      }
   }
   
   public void method2_1() {
      for(int i = 8; i >= 3; i--) {
         System.out.println(i);
//         8
//         7
//         6
//         5
//         4
//         3
      }
   }
   
   public void method3() {
	   // 홀수 출력 방법
      for(int i = 1; i <= 10; i+=2) {
         System.out.print(i + " ");      // 1 3 5 7 9 
      }
      for(int i=1; i <= 10; i++) {
         if (i%2 !=0) {
            System.out.print(i + " "); // 1 3 5 7 9 
         }
      }
   }
   
   public void method4() {
//      정수 두개를 입력 받아 그 사이 숫자를 출력 
//      정수 두개를 입력하세요. 단, 첫 번째 숫자보다 두 번째 숫자보다 작게 입력해주세요.
//      첫 번째 숫자: 1
//      두 번째 숫자: 5
      // 1 2 3 4 5
      Scanner sc = new Scanner(System.in);
      System.out.println("정수 두 개를 입력하세요 \n" + "단, 첫 번째 숫자보다 두 번째 숫자보다 작게 입력해주세요");
      
      System.out.print("첫 번째 숫자 : ");
      int num1 = sc.nextInt();
      
      System.out.print("두 번째 숫자 : ");
      int num2 = sc.nextInt();
      
      int max = 0;
      int min = 0;

      if(num1 > num2) {
         max = num1;
         min = num2;
      } else {
         max = num2;
         min = num1;
      }
//      for(int i = min; i <= max; i++) { 	// 아래와 같음
//         System.out.print(i + " ");
//      } 
      for(;min <= max; min++) {         // 초기식 생략 가능 / i 변수를 꼭 사용하지 않아도 됨
         System.out.print(min + " ");
//         정수 두 개를 입력하세요 
//         단, 첫 번째 숫자보다 두 번째 숫자보다 작게 입력해주세요
//         첫 번째 숫자 : 4
//         두 번째 숫자 : 1
//         1 2 3 4 
      }
   }
   
   public void method4_1() {
      // 정수 하나를 입력 받아 그 수가 1~9 사이의 수 일 때만 그 수의 구구단 출력
      // 조건이 맞지 않으면 "1~9 사이의 양수를 입력하여야 합니다" 출력
      
      Scanner sc = new Scanner(System.in);
      System.out.print("숫자 하나 입력 : ");
      int dan = sc.nextInt();
      
      if(dan >= 1 && dan <= 9) {
         for(int i = 1; i <= 9; i++) {
            System.out.println(dan + "*" + i + "=" + (dan*i));
         }
      } else {
         System.out.println("1~9 사이의 양수를 입력하여야 합니다.");
//         숫자 하나 입력 : 99
//         1~9 사이의 양수를 입력하여야 합니다.
         
//         숫자 하나 입력 : 3
//         3*1=3
//         3*2=6
//         3*3=9
//         3*4=12
//         3*5=15
//         3*6=18
//         3*7=21
//         3*8=24
//         3*9=27
      }
   }
   
   public void method5() {
//       1부터 10사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계
//       난수 = 랜덤값
//       System.out.println(Math.random()); // 임의의 난수(실수)를 반환하는 메소드
//       원래 Math.random()의 범위 : 0 <= Math.random() < 1 
//       10까지 만들기 위해 10 곱하기     : 0 <= Math.random() * 10 < 10
//       10을 포함하기 위해 1더하기 1    : 1 <= Math.random() * 10 + 1 < 11
//       정수로 만들기 위해 int로 형변환 : 1 <= (int)(Math.random() * 10 + 1) < 11
      int sum = 0;
      int random = (int)(Math.random() * 10 + 1); // 1~10 사이의 숫자 랜덤 출력
      for(int i= 1; i <= random; i++) {
         sum += i;
      }
      
      System.out.printf("1부터 %d까지 정수 합계 : %d", random, sum);
//      1부터 4까지 정수 합계 : 10
   }
   
   public void method6() {
      // 2단부터 9단까지 출력
   
      for (int dan = 2; dan <= 9; dan++) {
         for(int su =1; su <= 9; su++) {
            System.out.printf("%d * %d = %d%n", dan,su,(dan*su));
         }
         System.out.println();   // 한 단 끝날 때마다 한 줄 띄기
      }
   }
   
   public void method7() {
      // 아날로그 시계 출력 : 0시0분 ~ 23시 59분
      for (int hour = 0; hour <= 23; hour++) {
         for(int min = 0; min <= 59; min++) {
            System.out.printf("%d시 %d분%n ", hour, min);
         }
      }
   }
   
   public void method8() {
      // 한 줄에 별(*)가 5번 출력되는데
      // 그 줄은 사용자가 입력한 수만큼 출력
      Scanner sc = new Scanner(System.in);
      
      System.out.print("출력할 줄 수 : ");
      int line = sc.nextInt();
      
      for(int i = 1; i <= line; i++) {
         for(int j = 1; j <= 5; j++) {
            System.out.print("*");
         }
         System.out.println();
         // 출력할 줄 수 : 3
         // *****
         // *****
         // *****
      }
   }
   
   public void method9() {
      // 한 줄에 별표 문자를 입력된 줄 수와 칸 수 만큼 입력
      // 단, 줄 수와 칸 수가 일치하는 위치에는 줄 번호에 대한 정수가 출력
      // 줄 수 : 6      줄 수 : 5         줄 수 : 4
      // 칸 수 : 6      칸 수 : 5         칸 수 : 5
      // 1*****        1*** 	        1****
      // *2****        *2**     	    *2***
      // **3***        **3*         	**3**
      // ***4**        ***4        		***4*
      // ****5*        ****
      // *****6
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("줄 수 : ");
      int row = sc.nextInt();
      System.out.print("칸 수 : ");
      int col = sc.nextInt();
      
      
      for(int i = 1; i <= row; i++) {
         for(int j = 1; j <= col; j++) {
            if(i == j) {
            System.out.print(i);
            } else {
               System.out.print("*");
            }
         }
         System.out.println();
      }
   }
}








