package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
//    for(�ʱ��;���ǽ�;������){
//         ������ ����
//      }
//    �ʱ�� -> ���ǽ� -> (���ǽ��� true �� �� )������ ���� -> ������ -> ���ǽ� -> ���๮�� -> ������ -> ���ǽ� (�ݺ�)
//    ���ǽ� ����� false�� �� �� ���� �ݺ�
//    �������� �ݺ����� ������ ���� �ϳ��� ��ġ�̴�
   
//    for �� �ȿ� �ִ� �ʱ��, ���ǽ�, ������ ��� ���� ����
//    ������, ��� ���� ���� �� �ݺ����� �������� ���� ������
//    for�� ���̳� �ۿ��ٰ� �ʱ���� �������� ������ �������� ������ �󸶳� �ɰ����� ��� ǥ�� �ؾ��� 
//    ��, for()�ȿ����� ������ �� ��� �ʿ��� �����
	
   public void method1() {
      // 1���� 5���� ���
      for(int i = 1; i <= 5; i++) {
         System.out.println(i + "��° �ݺ��� ����");
//         1��° �ݺ��� ����
//         2��° �ݺ��� ����
//         3��° �ݺ��� ����
//         4��° �ݺ��� ����
//         5��° �ݺ��� ����
      }
   }
   
   public void method1_1() {
      for(int i = 1; i <= 5; i++) {
         System.out.println("�� �̸��� ���������Դϴ�.");
//         �� �̸��� ���������Դϴ�.
//         �� �̸��� ���������Դϴ�.
//         �� �̸��� ���������Դϴ�.
//         �� �̸��� ���������Դϴ�.
//         �� �̸��� ���������Դϴ�.
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
//      ���2.
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
	   // Ȧ�� ��� ���
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
//      ���� �ΰ��� �Է� �޾� �� ���� ���ڸ� ��� 
//      ���� �ΰ��� �Է��ϼ���. ��, ù ��° ���ں��� �� ��° ���ں��� �۰� �Է����ּ���.
//      ù ��° ����: 1
//      �� ��° ����: 5
      // 1 2 3 4 5
      Scanner sc = new Scanner(System.in);
      System.out.println("���� �� ���� �Է��ϼ��� \n" + "��, ù ��° ���ں��� �� ��° ���ں��� �۰� �Է����ּ���");
      
      System.out.print("ù ��° ���� : ");
      int num1 = sc.nextInt();
      
      System.out.print("�� ��° ���� : ");
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
//      for(int i = min; i <= max; i++) { 	// �Ʒ��� ����
//         System.out.print(i + " ");
//      } 
      for(;min <= max; min++) {         // �ʱ�� ���� ���� / i ������ �� ������� �ʾƵ� ��
         System.out.print(min + " ");
//         ���� �� ���� �Է��ϼ��� 
//         ��, ù ��° ���ں��� �� ��° ���ں��� �۰� �Է����ּ���
//         ù ��° ���� : 4
//         �� ��° ���� : 1
//         1 2 3 4 
      }
   }
   
   public void method4_1() {
      // ���� �ϳ��� �Է� �޾� �� ���� 1~9 ������ �� �� ���� �� ���� ������ ���
      // ������ ���� ������ "1~9 ������ ����� �Է��Ͽ��� �մϴ�" ���
      
      Scanner sc = new Scanner(System.in);
      System.out.print("���� �ϳ� �Է� : ");
      int dan = sc.nextInt();
      
      if(dan >= 1 && dan <= 9) {
         for(int i = 1; i <= 9; i++) {
            System.out.println(dan + "*" + i + "=" + (dan*i));
         }
      } else {
         System.out.println("1~9 ������ ����� �Է��Ͽ��� �մϴ�.");
//         ���� �ϳ� �Է� : 99
//         1~9 ������ ����� �Է��Ͽ��� �մϴ�.
         
//         ���� �ϳ� �Է� : 3
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
//       1���� 10������ ������ ������ ���� 1���� ���������� ���� �հ�
//       ���� = ������
//       System.out.println(Math.random()); // ������ ����(�Ǽ�)�� ��ȯ�ϴ� �޼ҵ�
//       ���� Math.random()�� ���� : 0 <= Math.random() < 1 
//       10���� ����� ���� 10 ���ϱ�     : 0 <= Math.random() * 10 < 10
//       10�� �����ϱ� ���� 1���ϱ� 1    : 1 <= Math.random() * 10 + 1 < 11
//       ������ ����� ���� int�� ����ȯ : 1 <= (int)(Math.random() * 10 + 1) < 11
      int sum = 0;
      int random = (int)(Math.random() * 10 + 1); // 1~10 ������ ���� ���� ���
      for(int i= 1; i <= random; i++) {
         sum += i;
      }
      
      System.out.printf("1���� %d���� ���� �հ� : %d", random, sum);
//      1���� 4���� ���� �հ� : 10
   }
   
   public void method6() {
      // 2�ܺ��� 9�ܱ��� ���
   
      for (int dan = 2; dan <= 9; dan++) {
         for(int su =1; su <= 9; su++) {
            System.out.printf("%d * %d = %d%n", dan,su,(dan*su));
         }
         System.out.println();   // �� �� ���� ������ �� �� ���
      }
   }
   
   public void method7() {
      // �Ƴ��α� �ð� ��� : 0��0�� ~ 23�� 59��
      for (int hour = 0; hour <= 23; hour++) {
         for(int min = 0; min <= 59; min++) {
            System.out.printf("%d�� %d��%n ", hour, min);
         }
      }
   }
   
   public void method8() {
      // �� �ٿ� ��(*)�� 5�� ��µǴµ�
      // �� ���� ����ڰ� �Է��� ����ŭ ���
      Scanner sc = new Scanner(System.in);
      
      System.out.print("����� �� �� : ");
      int line = sc.nextInt();
      
      for(int i = 1; i <= line; i++) {
         for(int j = 1; j <= 5; j++) {
            System.out.print("*");
         }
         System.out.println();
         // ����� �� �� : 3
         // *****
         // *****
         // *****
      }
   }
   
   public void method9() {
      // �� �ٿ� ��ǥ ���ڸ� �Էµ� �� ���� ĭ �� ��ŭ �Է�
      // ��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ������ ���
      // �� �� : 6      �� �� : 5         �� �� : 4
      // ĭ �� : 6      ĭ �� : 5         ĭ �� : 5
      // 1*****        1*** 	        1****
      // *2****        *2**     	    *2***
      // **3***        **3*         	**3**
      // ***4**        ***4        		***4*
      // ****5*        ****
      // *****6
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("�� �� : ");
      int row = sc.nextInt();
      System.out.print("ĭ �� : ");
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








