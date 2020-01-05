package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 * while(���ǽ�){
	 * 		���� ����;
	 * 		[������ or �б⹮];
	 * }
	 * ���ǽ� Ȯ�� -> ���ǽ� true �� �� ���� ���� ���� -> ���ǽ� Ȯ�� -> �ݺ� 
	 * ���ǽ� ����� false�� �� �� ���� �ݺ�
	 * */
	public void method1() {
		// 1���� 5���� ���
		int i = 1;
		while(i <= 5) {
			System.out.println(i + "��° �ݺ��� ����");
			i++;
//			1��° �ݺ��� ����
//			2��° �ݺ��� ����
//			3��° �ݺ��� ����
//			4��° �ݺ��� ����
//			5��° �ݺ��� ����
		}
	}
	
	public void method1_1() {
		// �ڱ� �Ұ� �ټ��� �ϱ� : �� �̸��� �ڽſ��
		int i= 1;
		while(i <= 5){
			System.out.println("�� �̸��� �ڽſ��");
			i++;
//			�� �̸��� �ڽſ��
//			�� �̸��� �ڽſ��
//			�� �̸��� �ڽſ��
//			�� �̸��� �ڽſ��
//			�� �̸��� �ڽſ��
		}
	}
	
	public void method2() {
		// 5���� 1����
		int i = 5;
		while(i >= 1) {
			System.out.println(i);
			i--;
//			5
//			4
//			3
//			2
//			1
		}
	}
	
	public void method3() {
		// 1���� 10������ Ȧ���� ���
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i+=2;
//			1
//			3
//			5
//			7
//			9
		}
	}
	
	public void method4() {
		// ���� �� ���� �Է¹޾� �� ���� ���� ���
		// ���� �� ���� �Է��ϼ���.
		// ��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.
		// ù ��° ���� : 
		// �� ��° ����:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� ���� �Է��ϼ���.");
		System.out.println("��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.");
		System.out.print("ù ��° ���� : ");
		int first = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int second = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if (first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}
		while(min <= max) {
			System.out.print(min + " ");
			min++;
//			���� �� ���� �Է��ϼ���.
//			��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.
//			ù ��° ���� : 9
//			�� ��° ���� : 4
//			4 5 6 7 8 9 
		}
	}
	public void method4_1() {
		// ������ �ϳ� �Է� �޾� �� ���� 1~9 ������ �� �� ���� �� ���� ������ ���
		// ������ ���� ������ 1~9 ������ ����� �Է��Ͽ��� �մϴ� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int dan = sc.nextInt();
		
		int i = 1;
		
		if (dan >= 2 && dan <= 9) {
			while (i <= 9) {
				System.out.printf("%d * %d = %d%n", dan, i, (dan*i));
				i++;
			}
		} else {
			System.out.println("1~9 ������ ����� �Է��Ͽ����մϴ�");
		}
//		���� �Է��ϼ��� : 23
//		1~9 ������ ����� �Է��Ͽ����մϴ�
		
//		���� �Է��ϼ��� : 4
//		4 * 1 = 4
//		4 * 2 = 8
//		4 * 3 = 12
//		4 * 4 = 16
//		4 * 5 = 20
//		4 * 6 = 24
//		4 * 7 = 28
//		4 * 8 = 32
//		4 * 9 = 36
	}
	
	public void method5() {
		//1 ���� 10������ ������ ������ ���� 1���� ���������� ���� �հ� ���
		int sum = 0;
		int random = (int)(Math.random() * 10 + 1);
		int i = 1;
		
		while(i <= random) {
			sum += i;
			i++;
		}
		System.out.printf("1���� %d���� ���� �հ� : %d", random, sum);
//		1���� 5���� ���� �հ� : 15
	}
	
	public void method6() {
		// ����ڿ��� ���ڿ��� �Է� �޾� �ε��� ���� ���� ���
		// ���ڿ� �Է� : apple
		// 0 : a
		// 1 : p
		// 2 : p
		// 3 : l
		// 4 : e
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		// ���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ� : length()
//		int length = str.length();
		
		// for
//		for(int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			System.out.println(i + " : " + ch);
//		}
		
		// while
		int i = 0;
//		while(i < str.length()) {
//			char ch = str.charAt(i);
//			System.out.println(i + " : " + ch);
//			i++;
//		}
		while(i < str.length()) {
			System.out.println(i + " : " + str.charAt(i));
			i++;
		}
	}
	public void method7() {
		//2�ܺ��� 9�ܱ��� ���
		
		int dan = 2;
		while(dan <= 9) {
			int su = 1; // while���� ���� su�� 1�� �ʱ�ȭ ��
			while(su <= 9) {
				System.out.printf("%d * %d = %d%n", dan, su, (dan*su));
				su++;
			} 
			dan++;
			System.out.println();
//			su = 1; // su�� �ۿ� �����Ϸ��� 1�� ���⼭ �ʱ�ȭ ��Ŵ
		}
	}
	public void method8() {
		// �Ƴ��α� �ð� ���
		
		int hour = 0;
		while(hour < 24) {
			int min = 0;
			while(min <= 59) {
//				System.out.println(hour + "�� " + min + "��");
				System.out.printf("%02d�� %02d��%n ", hour, min);
//				%2d ��� 2��ŭ �ڸ��� Ȯ���ϰڴ� // ���ڰ� ������ �⺻������ ������ ����
//				 - �� ������ ���� ����
				min++;
			}
			hour++;
		}
	}
	public void method9() {
		// �޴� ��¿� while���� ���� ��� ��
		// while�� Ȱ���ؼ� 9�� �����մϴ� ������ ������ �޴� ��ȣ�� 
		// �޴� ������ �ݺ��ؼ� ���
		
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;
		while(menuNum != 9) {			
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. 1~10���� Ȧ�� ���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			menuNum = sc.nextInt(); // �޴� �Է��� ��ȣ�� ��
			
			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 9: System.out.println("�����մϴ�."); break;
			default: System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
		// menuNum�� ���� ��ȣ�� case �����ϰ� switch�� ���� �� ���� ->
		// while������ ���� ���ǿ� �´��� Ȯ�� -> false���� �ݺ� ����
		
//		1. 1~5���� ���
//		2. 5~1���� ���
//		3. 1~10���� Ȧ�� ���
//		9. ����
//		�޴� ���� : 2
//		5
//		4
//		3
//		2
//		1
//		1. 1~5���� ���
//		2. 5~1���� ���
//		3. 1~10���� Ȧ�� ���
//		9. ����
//		�޴� ���� : 3
//		1
//		3
//		5
//		7
//		9
//		1. 1~5���� ���
//		2. 5~1���� ���
//		3. 1~10���� Ȧ�� ���
//		9. ����
//		�޴� ���� : 1
//		1��° �ݺ��� ����
//		2��° �ݺ��� ����
//		3��° �ݺ��� ����
//		4��° �ݺ��� ����
//		5��° �ݺ��� ����
//		1. 1~5���� ���
//		2. 5~1���� ���
//		3. 1~10���� Ȧ�� ���
//		9. ����
//		�޴� ���� : 9
//		�����մϴ�.
	}
}



















