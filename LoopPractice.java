package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
   Scanner sc = new Scanner(System.in);
   public void practice1() {
      // �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ���
      // ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
      // ���� 1�̸��� ���ڰ� �Էµƴٸ� "1 �̻��� ���ڸ� �Է����ּ���"�� ���
      System.out.println("1�̻��� ���ڸ� �Է��ϼ��� : ");
      int num = sc.nextInt();
      
      if(num > 0) {
         for(int i = 1; i <= num; i++) {
            System.out.print(i + " ");
         }
      } else {
         System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
//       1 2 3 4 5 
//       1�̻��� ���ڸ� �Է��ϼ��� : 
//       0
//       1 �̻��� ���ڸ� �Է����ּ���.
      }
   }
   
   public void practice2() {
      // �� ������ �����ϳ�, 1�̸��� ���ڰ� �Էµƴٸ�
      // "1 �̻��� ���ڸ� �Է����ּ���"�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
      int num = 1;
      
      do {
         System.out.println("1�̻��� ���ڸ� �Է��ϼ��� : ");
         num = sc.nextInt();
         
         if (num < 1) {
        	 System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
            }            
         for(int i = 1; i <= num; i++) {
        	 System.out.print(i + " ");
         }
      } while(num < 1);
   }
//   1�̻��� ���ڸ� �Է��ϼ��� : 
//	 0
//   1 �̻��� ���ڸ� �Է����ּ���.
//	 1�̻��� ���ڸ� �Է��ϼ��� : 
//	 2
//	 1 2 
   
   public void practice3() {
      // ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ���
      // ��, �Է��� ���� 1���� ũ�ų� ���ƾ� ��
      
      System.out.println("1�̻��� ���ڸ� �Է��ϼ��� : ");
      int num = sc.nextInt();
      
      if(num >= 1) {
         for(; num >= 1; num--) {
            System.out.print(num + " ");
         } 
      } else {
         System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
//       1�̻��� ���ڸ� �Է��ϼ��� : 
//       5
//       5 4 3 2 1 
      }
   }
   
   public void practice4() {
      // �� ������ �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ� "1 �̻��� ���ڸ� �Է����ּ���"�� ���
      // �ٽ� ����ڰ� ���� �Է��ϵ��� �϶�
      
      while(true) {
    	  System.out.println("1�̻��� ���ڸ� �Է��ϼ��� : ");
    	  int num = sc.nextInt();
    	  
    	  if(num > 1) {
    		  for(; num >= 1; num--) {
    			  System.out.print(num + " ");
    		  	} break;
    		  } else {
    		  System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
    		  }
    	  }
      	}
//    		  1�̻��� ���ڸ� �Է��ϼ��� : 
//    	      0
//    	      1�̻��� ���ڸ� �Է����ּ���.
//    	      1�̻��� ���ڸ� �Է��ϼ��� : 
//    		  4
//    		  4 3 2 1 
   
   public void practice5() {
      // 1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���.
      System.out.println("������ �ϳ� �Է��ϼ��� : ");
      int num = sc.nextInt();
      int sum = 0;
      for(int i = 1; i <= num; i++) {
         System.out.print(i + " + ");   // �������� + ��� �ȵǰ�?
         sum += i;
      } 
      System.out.print(sum);
   }
//      ������ �ϳ� �Է��ϼ��� : 
//    	5
//      1 + 2 + 3 + 4 + 5 + 15
   
   public void practice6() {
      // �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ���
      // ���� 1 �̸��� ���ڰ� �Էµƴٸ� "1 �̻��� ���ڸ� �Է����ּ���"�� ���
      
      System.out.println("ù ��° ���� : ");
      int first = sc.nextInt();
      System.out.println("�� ��° ���� : ");
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
         System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
      }
   }
//   ù ��° ���� : 
//	 4
//	 �� ��° ���� : 
//	 2
//	 2 3 4 
   
   public void practice7() {
//     �� ������ ����. 1 �̸��� ���ڰ� �Էµƴٸ� "1 �̻��� ���ڸ� �Է����ּ���"�� ��µǸ鼭
//     �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���
   
   while(true) {      
      System.out.println("ù ��° ���� : ");
      int first = sc.nextInt();
      System.out.println("�� ��° ���� : ");
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
         System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
      }
     }
   }
//   ù ��° ���� : 
//	 6
//	 �� ��° ���� : 
//	 0
//	 1 �̻��� ���ڸ� �Է����ּ���.
//	 ù ��° ���� : 
//	 2
//	 �� ��° ���� : 
//	 5
//	 2 3 4 5 
   
   public void practice8() {
      // �Է¹��� ������ ���� ���
      
      System.out.println("���� : ");
      int num = sc.nextInt();
      
      for (int i = 1; i <= 9; i++) {
         System.out.println(num + " * " + i + " = " + (num*i));
      }
   }
//   ���� : 
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
//       �Է� ���� ������ �ܺ��� 9�ܱ��� ���
//       ��, 9�� �ʰ��ϴ� ���ڰ� ������ "9 ������ ���ڸ� �Է����ּ���"�� ���
      System.out.println("���� : ");
      int dan = sc.nextInt();
      
      if(dan < 10) {
      for(;dan <= 9; dan++) {
         System.out.println("====" + dan + "�� ====");
         for(int su = 1; su <= 9; su++) {
            System.out.println(dan + " * " + su + " = " + (dan*su));
         }
      }
      } else {
         System.out.println("9 ������ ���ڸ� �Է����ּ���");
      }
   }
   
   public void practice10() {
//      �� ������ ����, 9�� �ʰ��ϴ� ���ڰ� �Էµƴٸ� "9 ������ ���ڸ� �Է����ּ���"�� ��µǸ鼭
//      �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
      while(true) { // while(true) ���ѹݺ� ��
      System.out.println("���� : ");
      int dan = sc.nextInt();
      
      if(dan < 10) {
      for(;dan <= 9; dan++) {
         System.out.println("====" + dan + "�� ====");
         for(int su = 1; su <= 9; su++) {
            System.out.println(dan + " * " + su + " = " + (dan*su));
         }
      }
      break;
      } else {
         System.out.println("9 ������ ���ڸ� �Է����ּ���");
      	}
      }
   }
   
   public void practice11() {
      // ���� ���ڿ� ������ �Է� �޾� ������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� ����
      // ��, ��µǴ� ���ڴ� �� 10���Դϴ�.
      
      System.out.println("���� ���� : ");
      int start = sc.nextInt();
      System.out.println("���� : ");
      int tolerance = sc.nextInt();
      int count = 0;
      
      for(int i = start; ; i += tolerance) {
         System.out.print(i + " ");
         count++;
         
         if(count == 10) {
            break;   // 10���� �Ǹ� �ݺ��� ������
         }
      }
   }
//   ���� ���� : 
//	 6
//	 ���� : 
//	 -2
//	 6 4 2 0 -2 -4 -6 -8 -10 -12 
   
   public void practice12() {
      // ���� �ΰ��� �����ڸ� �Է� �ް� �Էµ� �����ڿ� ���� �˸��� ����� ���
      // ��, ������ �Է¿� "exit"�� ���� ������ ���� �ݺ�
      // "exit"�� ������ "���α׷��� �����մϴ�."�� ����ϰ� ����
      // ���� �����ڰ� �������̸鼭 �� ��° ������ 0���� ������ 
      // "0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���."�� ���
      // ���� �����ڰ� ���� �� "���� �������Դϴ�. �ٽ� �Է����ּ���." ���
      // �� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �϶�
      
      while(true) {
      System.out.println("������(+, -, *, /, %) : ");
      String op = sc.nextLine(); 
//    String op = sc.next(); // ���ۿ� �����ִ� �ٹٲ��� ���� ���1 
      
      if(op.equals("exit")){
         System.out.println("���α׷��� �����մϴ�.");
         break;
      }
      
      System.out.println("����1 : ");
      int num1 = sc.nextInt();
      System.out.println("����2 : ");
      int num2 = sc.nextInt();  // ���ۿ� �����ִ� �ٹٲ��� ���� ���2 parseInt
      sc.nextLine(); // ���ۿ� �����ִ� �ٹٲ��� ���� ���3
      
      if(op.equals("/") && num2 == 0) {
         System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
         continue; // while ������ ������ true�� ���� �ȵ����� �ٽ� �ݺ���
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
            System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.\n");
         }
      }   
   }
//     ������(+, -, *, /, %) : 
//	   /
//	   ����1 : 
//	   4
//	   ����2 : 
//	   0
//	   0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.
//	   ������(+, -, *, /, %) : 
//	   /
//	   ����1 : 
//	   10
//	   ����2 : 
//	   4
//	   10 / 4 = 2
//	   ������(+, -, *, /, %) : 
//	   exit
//	   ���α׷��� �����մϴ�.

   public void practice13() {
      System.out.println("���� �Է� : ");
      int row = sc.nextInt();
      
      for(int i = 1; i <= row; i++) {
         for(int j = 1; j <= i;j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
//      ���� �Է� : 4
//         *
//         **
//         ***
//         ****
   
   public void practice14() {
      
      System.out.println("���� �Է� : ");
      int row = sc.nextInt();
      
      for(int i = 1; i <= row; i++) {
         for(int j = i; j <=row ; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
//     ���� �Է� : 
//	   4
//	   ****
//	   ***
//	   **
//	   *
}