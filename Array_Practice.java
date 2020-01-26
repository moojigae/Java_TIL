package com.kh.example.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice {
   Scanner sc = new Scanner(System.in);
   public void practice1() {
      // ���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ� ������� 
      // �迭 �ε����� ���� �� �� ���� ���
      
      int[] arr = new int[10];
      
      for(int i = 0; i < arr.length; i++) {
         arr[i] += i + 1;
         System.out.print(arr[i] + " ");
      }
   }
   
   public void practice2() {
      // ���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ� �������� 
      // �迭 �ε����� ���� �� �� ���� ���
      
      int[] arr = new int[10];
      for(int i = 0; i < arr.length; i++) {
         arr[i] = i + 1;
         System.out.print(11 - arr[i] + " ");
      }
   }
   
   public void practice3() {
      // �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ� 1���� �Է� ���� ������ 
      // �迭�� �ʱ�ȭ �� �� ���
      
      System.out.println("���� ���� : ");
      int size = sc.nextInt();
      
      int[] arr = new int[size];
      for(int i = 0; i < arr.length; i++) {
         arr[i] += i + 1;
         System.out.print(arr[i] + " ");
      }
   }
   
   public void practice4() {
      // ���̰� 5�� String �迭�� �����ϰ� "���", "��", "����", "������", "����"
      // �� �ʱ�ȭ �� �� �迭 �ε����� Ȱ���ؼ� ���� ����϶�
      
      String[] arr = {"���","��","����","������","����"};
      
      System.out.println(arr[1]);
   }
   
   public void practice5() {
      // ���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ� �˻��� ���ڰ� ���ڿ���
      // �� �� �� �ִ��� ������ �� ��° �ε����� ��ġ�ϴ��� �ε����� ���
   
   System.out.println("���ڿ� : ");
    String word = sc.nextLine();
    System.out.println("���� : ");
    char ch = sc.nextLine().charAt(0);
    
    char[] arr = new char[word.length()];
    char[] charIndex = new char[word.length()];
    
    for(int i = 0; i < word.length(); i++) {
       arr[i] = word.charAt(i);
    }
    int count = 0;
    for(int i = 0; i < arr.length; i++) {
       if(arr[i] == ch) {
          count++;
          charIndex[i] = ch;
       }
    }
    System.out.print(word + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
    for(int i = 0; i < charIndex.length; i++) {
       if(charIndex[i] != '\u0000') {
            System.out.print(i + " ");
         }
    }
    System.out.println();
    System.out.println(ch + "�� ���� : " + count);
 }
    public void practice6() {
         // "��" ~ "��"���� �ʱ�ȭ �� ���ڿ��� ����� 0���� 6����
         // ���ڸ� �Է� �޾� �Է��� ���ڿ� ���� �ε����� �ִ� ���� ���
         // ������ ���� ���ڸ� �Է� �� "�߸� �Է��ϼ̽��ϴ�"�� ���
         
        System.out.println("0 ~ 6 ���� ���� �Է� : ");
        int num = sc.nextInt();
        if(num >= 7) {
           System.out.println("�߸� �Է��ϼ̽��ϴ�.");
        }
        
        String[] day = {"��","ȭ","��","��","��","��","��"};
        for(int i = 0; i < day.length; i++) {
           day[i] += i;
           if(i == num) {
              System.out.println(day[i].charAt(0) + "����");
           }
        }
      }
     
      public void practice7() {
         // �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ� 
         // �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ �ϼ���
         // �׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���� ���
         
         System.out.println("���� : ");
         int size = sc.nextInt();
         
         int[] arr = new int[size];
         
         int num = 0;
         int sum = 0;
         for(int i = 0; i < arr.length; i++) {
            System.out.println("�迭 " + i +"��° �ε����� ���� �� : ");
            num = sc.nextInt();
            arr[i] += num;
//            System.out.print(num + " ");
         }
         for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
         }
         System.out.println();
         System.out.println("�� �� : " + sum);
      }
      
      public void practice8() {
         // 3 �̻��� Ȧ�� �ڿ����� �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�,
         // �߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ���
         // ��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� "�ٽ� �Է��ϼ���" ����ϰ� �ٽ� ���� �޾ƶ�
         
        System.out.println("���� : ");
        int num = sc.nextInt();
        
        if (num % 2 == 0 || num < 3) {
           System.out.println("�ٽ� �Է��ϼ���");
        } else {
        
        int count = 0;
        // count ���� ������ for���� i���� �������ϱ� ������ ��� �����
        // Ŀ���ų� �۾��� �� �ִ� �������� �ִ� ��� ������ ���� �����ϴ� ���� ����
        int[] arr = new int[num];
        for(int i = 0; i < arr.length; i++) {
           if(i < (num /2 +1 )) {
              count++;
              arr[i] = count;
           } else {
              count--;
              arr[i] = count;
           }
        }
        for(int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
        }
      }
      } 
      public void practice9() {
         // ����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ� ������ "000 ġŲ ��� ����", 
         // ������ "000 ġŲ�� ���� �޴��Դϴ�"�� ���
         // ��, ġŲ �޴��� ���ִ� �迭�� ������ ���� 
         
         System.out.println("ġŲ �̸��� �Է��ϼ��� : ");
         String userMenu = sc.nextLine();
         
         String[] menu = {"�Ķ��̵�","���","����","�ݹ�"};
         
         boolean check = false;
        for(int i = 0; i < menu.length; i++) {         
           if(userMenu.equals(menu[i])) {
              check = true;
           } 
        }
         if(check) {
            System.out.println(userMenu + "ġŲ ��� ����");
         } else {
            System.out.println(userMenu + "ġŲ�� ���� �޴��Դϴ�.");
         }
      }
      public void practice10() {
         // �ֹι�ȣ �����ڸ� ���ĺ��� *�� ������ ����϶�
         // �� ���� �迭 ���� ���� ���� �迭 ���纻���� ����
         
         System.out.println("�ֹε�Ϲ�ȣ(-����");
         char jumin = sc.nextLine().charAt(0);
         
         char[] arr;
         
//         for(int i = 0; i < jumin.length(); i++) {
//            arr[i] = jumin.charAt(i);
//         }
      }
      
      public void practice11() {
         // 10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ�
         // 1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ �� �� ���
         
         int[] arr = new int[10];
         
         for(int i = 0; i < arr.length; i++) {
         int random = (int)(Math.random() * 10) + 1;
            arr[i] += random; 
         }
         for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
         }
      }
      
      public void practice12() {
         // 10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ�
         // 1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ �� �迭 ��ü ���� �� �� �߿���
         // �ִ밪�� �ּҰ��� ���
         
         int[] arr = new int[10];
         
         for(int i = 0; i < arr.length; i++) {
         int random = (int)(Math.random() * 10) + 1;
            arr[i] = random; 
         }
         for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
         }
         
         Arrays.sort(arr);
         System.out.println();
         System.out.print("�ִ밪 : " + arr[9]);
         System.out.println();
         System.out.print("�ּҰ� : " + arr[0]);
      }
      
      public void practice13() {
         // 10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
         // 1~10 ������ ������ �߻����� �ߺ��� ���� ���� �迭�� �ʱ�ȭ �� �� ���
         
         // �ߺ��� ���� ������ ���� �����
         // ���� ������ ������ ������ؼ� �迭�� �ֱ�
         // if(arr[i] == random) ���� ���ǹ� �־������ �ȵ� 
         // �ϴ��� �迭�� �������� �ְ� ��ü���� ���ؼ� ���� ���� 
         
         int[] arr = new int[10];
         
         for(int i = 0; i < arr.length; i++) {
            int random = (int)(Math.random() * 10) + 1;
            arr[i] = random;
            for(int j = 0; j < i; j++) {
            	if(arr[i] == arr[j]) {
            		i--;
            	}
            }
         }
         for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
         }
      }
}

























