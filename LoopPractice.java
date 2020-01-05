package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
   Scanner sc = new Scanner(System.in);
   public void practice1() {
      // 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력
      // 단, 입력한 수는 1보다 크거나 같아야 합니다.
      // 만일 1미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력
      System.out.println("1이상의 숫자를 입력하세요 : ");
      int num = sc.nextInt();
      
      if(num > 0) {
         for(int i = 1; i <= num; i++) {
            System.out.print(i + " ");
         }
      } else {
         System.out.println("1 이상의 숫자를 입력해주세요.");
//       1 2 3 4 5 
//       1이상의 숫자를 입력하세요 : 
//       0
//       1 이상의 숫자를 입력해주세요.
      }
   }
   
   public void practice2() {
      // 위 문제와 동일하나, 1미만의 숫자가 입력됐다면
      // "1 이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
      int num = 1;
      
      do {
         System.out.println("1이상의 숫자를 입력하세요 : ");
         num = sc.nextInt();
         
         if (num < 1) {
        	 System.out.println("1 이상의 숫자를 입력해주세요.");
            }            
         for(int i = 1; i <= num; i++) {
        	 System.out.print(i + " ");
         }
      } while(num < 1);
   }
//   1이상의 숫자를 입력하세요 : 
//	 0
//   1 이상의 숫자를 입력해주세요.
//	 1이상의 숫자를 입력하세요 : 
//	 2
//	 1 2 
   
   public void practice3() {
      // 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력
      // 단, 입력한 수는 1보다 크거나 같아야 함
      
      System.out.println("1이상의 숫자를 입력하세요 : ");
      int num = sc.nextInt();
      
      if(num >= 1) {
         for(; num >= 1; num--) {
            System.out.print(num + " ");
         } 
      } else {
         System.out.println("1 이상의 숫자를 입력해주세요");
//       1이상의 숫자를 입력하세요 : 
//       5
//       5 4 3 2 1 
      }
   }
   
   public void practice4() {
      // 위 문제와 동일하나, 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"가 출력
      // 다시 사용자가 값을 입력하도록 하라
      
      while(true) {
    	  System.out.println("1이상의 숫자를 입력하세요 : ");
    	  int num = sc.nextInt();
    	  
    	  if(num > 1) {
    		  for(; num >= 1; num--) {
    			  System.out.print(num + " ");
    		  	} break;
    		  } else {
    		  System.out.println("1이상의 숫자를 입력해주세요.");
    		  }
    	  }
      	}
//    		  1이상의 숫자를 입력하세요 : 
//    	      0
//    	      1이상의 숫자를 입력해주세요.
//    	      1이상의 숫자를 입력하세요 : 
//    		  4
//    		  4 3 2 1 
   
   public void practice5() {
      // 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
      System.out.println("정수를 하나 입력하세요 : ");
      int num = sc.nextInt();
      int sum = 0;
      for(int i = 1; i <= num; i++) {
         System.out.print(i + " + ");   // 마지막에 + 출력 안되게?
         sum += i;
      } 
      System.out.print(sum);
   }
//      정수를 하나 입력하세요 : 
//    	5
//      1 + 2 + 3 + 4 + 5 + 15
   
   public void practice6() {
      // 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력
      // 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력
      
      System.out.println("첫 번째 숫자 : ");
      int first = sc.nextInt();
      System.out.println("두 번째 숫자 : ");
      int second = sc.nextInt();
      
      int max = 0;
      int min = 0;
      
      if (first > second) {
         max = first;
         min = second;
      } else {
         min = first;
         max = second;
      }
      
      if(first > 0 && second > 0) {
         for (;min <= max; min++) {
            System.out.print(min + " ");
         }
      } else {
         System.out.println("1 이상의 숫자를 입력해주세요.");
      }
   }
//   첫 번째 숫자 : 
//	 4
//	 두 번째 숫자 : 
//	 2
//	 2 3 4 
   
   public void practice7() {
//     위 문제와 동일. 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"가 출력되면서
//     다시 사용자가 값을 입력하도록 하세요
   
   while(true) {      
      System.out.println("첫 번째 숫자 : ");
      int first = sc.nextInt();
      System.out.println("두 번째 숫자 : ");
      int second = sc.nextInt();
      
      if(first >= 1 && second >=1) {
         int max = 0;
         int min = 0;
         
         if (first > second) {
            max = first;
            min = second;
         } else {
            min = first;
            max = second;
         }      
         
         for(int i = min; i <=max; i++) {
            System.out.print(i + " ");
         }
         break;
      } else {
         System.out.println("1 이상의 숫자를 입력해주세요.");
      }
     }
   }
//   첫 번째 숫자 : 
//	 6
//	 두 번째 숫자 : 
//	 0
//	 1 이상의 숫자를 입력해주세요.
//	 첫 번째 숫자 : 
//	 2
//	 두 번째 숫자 : 
//	 5
//	 2 3 4 5 
   
   public void practice8() {
      // 입력받은 숫자의 단을 출력
      
      System.out.println("숫자 : ");
      int num = sc.nextInt();
      
      for (int i = 1; i <= 9; i++) {
         System.out.println(num + " * " + i + " = " + (num*i));
      }
   }
//   숫자 : 
//	 6
//	 6 * 1 = 6
//	 6 * 2 = 12
//	 6 * 3 = 18
//	 6 * 4 = 24
//	 6 * 5 = 30
//	 6 * 6 = 36
//	 6 * 7 = 42
//	 6 * 8 = 48
//	 6 * 9 = 54
   
   public void practice9() {
//       입력 받은 숫자의 단부터 9단까지 출력
//       단, 9를 초과하는 숫자가 들어오면 "9 이하의 숫자만 입력해주세요"를 출력
      System.out.println("숫자 : ");
      int dan = sc.nextInt();
      
      if(dan < 10) {
      for(;dan <= 9; dan++) {
         System.out.println("====" + dan + "단 ====");
         for(int su = 1; su <= 9; su++) {
            System.out.println(dan + " * " + su + " = " + (dan*su));
         }
      }
      } else {
         System.out.println("9 이하의 숫자만 입력해주세요");
      }
   }
   
   public void practice10() {
//      위 문제와 동일, 9를 초과하는 숫자가 입력됐다면 "9 이하의 숫자를 입력해주세요"가 출력되면서
//      다시 사용자가 값을 입력하도록 하세요.
      while(true) { // while(true) 무한반복 문
      System.out.println("숫자 : ");
      int dan = sc.nextInt();
      
      if(dan < 10) {
      for(;dan <= 9; dan++) {
         System.out.println("====" + dan + "단 ====");
         for(int su = 1; su <= 9; su++) {
            System.out.println(dan + " * " + su + " = " + (dan*su));
         }
      }
      break;
      } else {
         System.out.println("9 이하의 숫자만 입력해주세요");
      	}
      }
   }
   
   public void practice11() {
      // 시작 숫자와 공차를 입력 받아 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현
      // 단, 출력되는 숫자는 총 10개입니다.
      
      System.out.println("시작 숫자 : ");
      int start = sc.nextInt();
      System.out.println("공차 : ");
      int tolerance = sc.nextInt();
      int count = 0;
      
      for(int i = start; ; i += tolerance) {
         System.out.print(i + " ");
         count++;
         
         if(count == 10) {
            break;   // 10번이 되면 반복문 나가라
         }
      }
   }
//   시작 숫자 : 
//	 6
//	 공차 : 
//	 -2
//	 6 4 2 0 -2 -4 -6 -8 -10 -12 
   
   public void practice12() {
      // 정수 두개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력
      // 단, 연산자 입력에 "exit"가 들어올 때까지 무한 반복
      // "exit"가 들어오면 "프로그램을 종료합니다."를 출력하고 종료
      // 또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면 
      // "0으로 나눌 수 없습니다. 다시 입력해주세요."를 출력
      // 없는 연산자가 들어올 시 "없는 연산자입니다. 다시 입력해주세요." 출력
      // 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하라
      
      while(true) {
      System.out.println("연산자(+, -, *, /, %) : ");
      String op = sc.nextLine(); 
//    String op = sc.next(); // 버퍼에 남아있는 줄바꿈이 방지 방법1 
      
      if(op.equals("exit")){
         System.out.println("프로그램을 종료합니다.");
         break;
      }
      
      System.out.println("정수1 : ");
      int num1 = sc.nextInt();
      System.out.println("정수2 : ");
      int num2 = sc.nextInt();  // 버퍼에 남아있는 줄바꿈이 방지 방법2 parseInt
      sc.nextLine(); // 버퍼에 남아있는 줄바꿈이 방지 방법3
      
      if(op.equals("/") && num2 == 0) {
         System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
         continue; // while 조건이 어차피 true라 조건 안따지고 다시 반복됨
         }
         
         switch(op) {
         case "+":
            System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 + num2));
            break;
         case "-": 
            System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 - num2));
            break;
         case "*":
            System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 * num2));
            break;
         case"/":
            System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 / num2));
            break;
         case "%":
            System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 % num2));
            break;
         default :
            System.out.println("없는 연산자입니다. 다시 입력해주세요.\n");
         }
      }   
   }
//     연산자(+, -, *, /, %) : 
//	   /
//	   정수1 : 
//	   4
//	   정수2 : 
//	   0
//	   0으로 나눌 수 없습니다. 다시 입력해주세요.
//	   연산자(+, -, *, /, %) : 
//	   /
//	   정수1 : 
//	   10
//	   정수2 : 
//	   4
//	   10 / 4 = 2
//	   연산자(+, -, *, /, %) : 
//	   exit
//	   프로그램을 종료합니다.

   public void practice13() {
      System.out.println("정수 입력 : ");
      int row = sc.nextInt();
      
      for(int i = 1; i <= row; i++) {
         for(int j = 1; j <= i;j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
//      정수 입력 : 4
//         *
//         **
//         ***
//         ****
   
   public void practice14() {
      
      System.out.println("정수 입력 : ");
      int row = sc.nextInt();
      
      for(int i = 1; i <= row; i++) {
         for(int j = i; j <=row ; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
//     정수 입력 : 
//	   4
//	   ****
//	   ***
//	   **
//	   *
}