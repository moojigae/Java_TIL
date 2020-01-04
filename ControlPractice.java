package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
   Scanner sc = new Scanner(System.in);
   public void practice1() {
      // �Ʒ� ���ÿ� ���� �޴��� ����а� �޴� ��ȣ�� ������
      // "00 �޴��Դϴ�"��, ���� ��ȣ�� ������ 
      // "���α׷��� ����˴ϴ�."�� ����ϼ���
            
      System.out.println("1. �Է�");
      System.out.println("2. ����");
      System.out.println("3. ��ȸ");
      System.out.println("4. ����");
      System.out.println("7. ����");
      
      System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
      int menuNum = sc.nextInt();
      
      switch(menuNum) {
      case 1: 
         System.out.println("�Է� �޴��Դϴ�.");
         break;
      case 2:
         System.out.println("���� �޴��Դϴ�.");
         break;
      case 3:
         System.out.println("��ȸ �޴��Դϴ�.");
         break;
      case 4:
         System.out.println("���� �޴��Դϴ�.");
         break;
      case 7:
         System.out.println("���α׷��� ����˴ϴ�.");
         break;
//         1. �Է�
//         2. ����
//         3. ��ȸ
//         4. ����
//         7. ����
//         �޴� ��ȣ�� �Է��ϼ��� : 
//         3
//         ��ȸ �޴��Դϴ�.
      }
   }
   
   public void practice2() {
      // �Է� ���� ������ ����̸鼭 ¦���� ���� "¦����"�� ����ϰ�
      // ¦���� �ƴϸ� "Ȧ����"�� ����ϼ���
      // ����� �ƴϸ� "����� �Է����ּ���."�� ����ϼ���
      
      System.out.println("���� �ϳ��� �Է��ϼ��� : ");
      int num = sc.nextInt();
      if (num > 0 && num % 2 == 0) {
         System.out.println("¦����");
      } else if (num % 2 != 0) {
         System.out.println("Ȧ����");
      } else {
         System.out.println("����� �Է����ּ���.");
//         ���� �ϳ��� �Է��ϼ��� : 
//         -2
//         ����� �Է����ּ���.
      }
   }
   
   public void practice3() {
      // ����, ����, ���� �� ������ ������ �Է� �ް� �հ�� ����� ����ϰ�
      // �հ�� ����� �̿��Ͽ� �հ� / ���հ� ó���ϴ� ����� �����ϼ���
      // �հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���
      // �հ� ���� ��� ���� �� ������ �հ�, ���, "�����մϴ�. �հ��Դϴ�!"�� ���
      // ���հ��� ��쿡�� "���հ��Դϴ�."�� ����ϼ���
      
      System.out.println("���� ������ �Է��ϼ��� : ");
      int kor = sc.nextInt();
      System.out.println("���� ������ �Է��ϼ��� : ");
      int eng = sc.nextInt();
      System.out.println("���� ������ �Է��ϼ��� : ");
      int math = sc.nextInt();
      
      int sum = kor + eng + math;
      float aver = sum / 3;
      
      if (kor > 40 && eng > 40 && math > 40 && sum >= 60) {
         System.out.println("���� : " + kor);
         System.out.println("���� : " + math);
         System.out.println("���� : " + eng);
         System.out.println("�հ� : " + sum);
         System.out.println("��� : " + aver);
         System.out.println("�����մϴ�. �հ��Դϴ�!");
      } else {
         System.out.println("���հ��Դϴ�.");
//         ���� ������ �Է��ϼ��� : 
//         68
//         ���� ������ �Է��ϼ��� : 
//         50
//         ���� ������ �Է��ϼ��� : 
//         40
//         ���հ��Դϴ�.
         
//         ���� ������ �Է��ϼ��� : 
//         88
//         ���� ������ �Է��ϼ��� : 
//         50
//         ���� ������ �Է��ϼ��� : 
//         45
//         ���� : 88
//         ���� : 45
//         ���� : 50
//         �հ� : 183
//         ��� : 61.0
//         �����մϴ�. �հ��Դϴ�!
      }
   }
   public void practice4() {
      // ���� �ڷ�(7 page)���� if������ �Ǿ��ִ� ��,����,����,�ܿ� ������
      // switch������ �ٲ㼭 ����ϼ���
      
      System.out.println("1~12 ������ ���� �Է� : ");
      int month = sc.nextInt();
      
      switch(month) {
      case 1: case 2: case 12:
         System.out.println(month + "���� �ܿ��Դϴ�.");
         break;
      case 3: case 4: case 5:
         System.out.println(month + "���� ���Դϴ�.");
         break;
      case 6: case 7: case 8:
         System.out.println(month + "���� �����Դϴ�.");
         break;
      case 9: case 10: case 11:
         System.out.println(month + "���� �����Դϴ�.");
         break;
      default : 
         System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
//         1~12 ������ ���� �Է� : 
//         8
//         8���� �����Դϴ�.
         
//         1~12 ������ ���� �Է� : 
//         99
//         99���� �߸� �Էµ� ���Դϴ�.
      }
   }
   
   public void practice5() {
      // ���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���.
      // �α��� ���� �� "�α��� ����", ���̵� Ʋ���� �� "���̵� Ʋ�Ƚ��ϴ�",
      // ��й�ȣ�� Ʋ���� �� "��й�ȣ�� Ʋ�Ƚ��ϴ�."�� ����ϼ���.
      
      /* 
       * ex 1.               ex 2.
       * ���̵� : myId            ���̵� : myId
       * ��й�ȣ : myPassword12      ��й�ȣ : myPassword
       * �α��� ����               ��й�ȣ�� Ʋ�Ƚ��ϴ�.
       * 
       * ex 3.
       * ���̵� : my
       * ��й�ȣ : myPassword12
       * ���̵� Ʋ�Ƚ��ϴ�.
       * */
      
      String id = "myId";
      String password = "myPassword12";
      
      System.out.println("���̵� : ");
      String userId = sc.nextLine();
      System.out.println("��й�ȣ : ");
      String userPassword = sc.nextLine();
      
//      System.out.print(!id.equals(userId));
      
      if (!id.equals(userId)) {
         System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
      } else if (!password.equals(userPassword)) {
         System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
      } else {
         System.out.println("�α��� ����");
//         ���̵� : 
//         myId
//         ��й�ȣ : 
//         myPassword12
//         �α��� ����
//         ���̵� : 
//         my
//         ��й�ȣ : 
//         myPassword12
//         ���̵� Ʋ�Ƚ��ϴ�.
      }
   }
   
   public void practice6() {
      // ����ڿ��� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է� �޾� �� ����� ���� �� �ִ�
      // ������ ����ϼ���. ��, �����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�,
      // �Խñ� ��ȸ, ��� �ۼ��� �����ϰ� 
      // ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ� 
      // ��ȸ���� �Խñ� ��ȸ�� ����
      
      System.out.println("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
      String right = sc.nextLine();
      
      switch (right) {
      case "������":
         System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, ��� �ۼ�, �Խñ� ��ȸ");
         break;
      case "ȸ��" :
         System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
         break;
      case "��ȸ��" :
         System.out.println("�Խñ� ��ȸ");
         break;
//         ������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : 
//         ������
//         ȸ������, �Խñ� ����, �Խñ� �ۼ�, ��� �ۼ�, �Խñ� ��ȸ
      }
   }
   
   public void practice7() {
      // Ű, �����Ը� double�� �Է� �ް� BMI������ ����Ͽ� ��� ����� ����
      // ��ü��/����ü��/��ü��/���� ����ϼ���
      // BMI = ������ / (Ű(m) * Ű(m))
      // BMI�� 18.5�̸��� ��� ��ü�� / 18.5�̻� 23�̸��� ��� ����ü��
      // BMI�� 23�̻� 25�̸��� ��� ��ü�� / 25�̻� 30�̸��� ��� ��
      // BMI�� 30�̻��� ��� �� ��
      
      System.out.println("Ű(m)�� �Է����ּ��� : ");
      double height = sc.nextDouble();
      System.out.println("������(kg)�� �Է����ּ��� : ");
      double weight = sc.nextDouble();
      
      double bmi = weight / (height * height);
      System.out.println("BMI ���� : " + bmi);
      
      if (bmi >= 18.5 || bmi < 23) {
         System.out.println("����ü��");
      } else if (bmi >= 23 || bmi < 25) {
         System.out.println("��ü��");
      } else if (bmi >= 25 || bmi < 30) {
         System.out.println("��");
      } else if (bmi >= 30) {
         System.out.println("�� ��");
      } else if (bmi < 18.5) {
         System.out.println("��ü��");
//         Ű(m)�� �Է����ּ��� : 
//         1.65
//         ������(kg)�� �Է����ּ��� : 
//         58.4
//         BMI ���� : 21.45087235996327
//         ����ü��
      }
   }
   
   public void practice8() {
      // �� ���� ������ ���� ��ȣ�� �Է� �޾� ���� ��ȣ�� ���� ���� ����� ����ϼ���
      // ��, �� ���� ���� ��� ����� ���� �۵��ϸ� ���� ���� ��ȣ�� �Է� ���� ��
      // "�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�." ���
            
      System.out.println("�ǿ�����1 �Է� : ");
      int num1 = sc.nextInt();
      System.out.println("�ǿ�����2 �Է� : ");
      int num2 = sc.nextInt();
      sc.nextLine();
      System.out.println("�����ڸ� �Է�(+,-,*,/,%) : ");
      char op = sc.nextLine().charAt(0);
      
      float result = 0.0f;
      
      switch(op) {
      case '+' : result = num1 + num2; break;
      case '-' : result = num1 - num2; break;
      case '*' : result = num1 * num2; break;
      case '/' : result = (float)num1 / num2; break;
      case '%' : result = num1 % num2; break;
      default : System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
      }
      if(op == '/') {
    	  System.out.printf("%d %c %d = %f",num1,op,num2,result);
      } else if(op == '+' || op == '-' || op == '*' || op == '%') {
    	  System.out.printf("%d %c %d = %d",num1,op,num2,(int)result);   
      }
//      �ǿ�����1 �Է� : 
//      15
//      �ǿ�����2 �Է� : 
//      4
//      �����ڸ� �Է�(+,-,*,/,%) : 
//      /
//      15 / 4 = 3.750000
      
//      ���� Ǭ ���
//      if (num1 > 0 && num2 >0) {
//         if (op == '+') {
//            result = num1 + num2;
//         } else if (op == '-') {
//            result = num1 - num2;
//         } else if (op == '*') {
//            result = num1 * num2;
//         } else if (op == '/') {
//            result = (float)num1 / num2;
//            // (double)(num1 / num2); �� ������� double�� �ٲٴ� ��
//         } else if (op == '%') {
//            result = num1 % num2;
//         } else {
//            System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
//         } 
//      }
//      System.out.printf("%d %c %d = %f",num1,op,num2,result);
   }
   
   public void practice9() {
      // �߰����, �⸻���, ��������, �⼮ȸ���� �Է��ϰ� Pass �Ǵ� Fail�� ���
      // �� ������ �߰���� 20%, �⸻��� 30%, �⼮ 20%�� �̷���� �ְ�
      // �� ��, �⼮ ������ �⼮ ȸ���� �� ���� ȸ�� 20ȸ �߿���
      // �⼮�� ���� ���� ������ ���. 70�� �̻��� ��� pass, 
      // 70�� �̸��̰ų� ��ü ���ǿ� 30% �̻� �Ἦ �� fail ���
      
      System.out.println("�߰� ��� ���� : ");
      int middle = sc.nextInt();
      System.out.println("�⸻ ��� ���� : ");
      int fanal = sc.nextInt();
      System.out.println("���� ���� : ");
      int homework = sc.nextInt();
      System.out.println("�⼮ ȸ�� : ");
      float attend = sc.nextInt();
      
      System.out.println("=== ��� ===");
      
      float middleResult = (float)0.2 * middle;
      float fanalResult = (float)0.3 * fanal;
      float homeworkResult = (float)0.3 * homework;
//    float attendResult = attend / 20.0 * 100 * 0.2;
      float sum = middleResult + fanalResult + homeworkResult + attend;
      
      if(attend <= 14) {
    	  System.out.println("Fail [�⼮ ȸ�� ���� (" + attend + "/20)]");
      } else if(sum < 70) {
    	  System.out.printf("�߰� ��� ����(20) : %.1f \n", middleResult);
    	  System.out.printf("�⸻ ��� ����(30) : %.1f \n", fanalResult);
    	  System.out.printf("���� ����    (30) : %.1f \n", homeworkResult);
    	  System.out.printf("�⼮        (20) : %.1f \n", attend);
    	  System.out.printf("���� : %.1f \n", sum);
    	  System.out.println("Fail [���� �̴�]");
      } else {
    	  System.out.printf("�߰� ��� ����(20) : %.1f \n", middleResult);
    	  System.out.printf("�⸻ ��� ����(30) : %.1f \n", fanalResult);
    	  System.out.printf("���� ����    (30) : %.1f \n", homeworkResult);
    	  System.out.printf("�⼮        (20) : %.1f \n", attend);
    	  System.out.printf("���� : %.1f \n", sum);
    	  System.out.println("Pass");
      }   
//      �߰� ��� ���� : 
//      100
//      �⸻ ��� ���� : 
//      80
//      ���� ���� : 
//      40
//      �⼮ ȸ�� : 
//      10
//      === ��� ===
//      Fail [�⼮ ȸ�� ���� (10.0/20)]
      
//      if(attend >= 20 * 0.7) {
//      System.out.println("�߰� ��� ����(20) : middleResult * 0.2);
//      System.out.println("�⸻ ��� ����(30) : fanalResult * 0.3);
//      System.out.println("���� ����    (30) : homeworkResult * 0.3);
//      System.out.println("�⼮        (20) : attend / 20.0 * 100 * 0.2);
      
//      float sum = middleResult + fanalResult + homeworkResult + attend;
      
//      if(sum >= 70){
//         System.out.println("Pass");
//      } else {
//      System.out.println("Fail [���� �̴�]");
//      }
//      } else {
//         System.out.println("Fail [�⼮ ȸ�� ���� (" + attend + "/20)]");
//      }
      
   }
   public void practice10() {
      // �տ� ������ �ǽ������� �����Ͽ� ������ �� �ִ� �޴�ȭ���� �����϶�
      System.out.println("������ ����� �����ϼ���.");
      System.out.println("1. �޴� ���");
      System.out.println("2. ¦��/Ȧ��");
      System.out.println("3. �հ�/���հ�");
      System.out.println("4. ����");
      System.out.println("5. �α���");
      System.out.println("6. ���� Ȯ��");
      System.out.println("7. BMI");
      System.out.println("8. ����");
      System.out.println("9. P/F");
      System.out.println("���� : ");
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
      
//      ������ ����� �����ϼ���.
//      1. �޴� ���
//      2. ¦��/Ȧ��
//      3. �հ�/���հ�
//      4. ����
//      5. �α���
//      6. ���� Ȯ��
//      7. BMI
//      8. ����
//      9. P/F
//      ���� : 
//      2
//      ���� �ϳ��� �Է��ϼ��� : 
//      5
//      Ȧ����
      }
   }
}