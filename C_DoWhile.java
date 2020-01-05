package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	Scanner sc = new Scanner(System.in);
	public void method1() {
		// Ű����� ���ڿ� ���� �Է� �޾� ��� �ݺ� ����
		// ��, exit�� ������ �ݺ� ����
		/*
		 * ���ڿ� �Է� : �ȳ��ϼ���
		 * str : �ȳ��ϼ���
		 * ���ڿ� �Է� : apple
		 * str : apple
		 * ���ڿ� �Է� : exit
		 * str : exit
		 * */
		
//		 1. while
		
//		String str = null; // null = ������� �ƴϰ� �ƹ��͵� �ƴ�
//		while(!str.equals("exit")) null�� exit�� ���Ϸ��� �ϸ� ���� �߻�
//		 Exception in thread "main" java.lang.NullPointerException
//		 null�� �ƹ��͵� �ƴ� ���̱� ������ �񱳴���� �� �� ��� �ߴ� ����
//		String str = "";
//		while(!str.equals("exit")){
//		System.out.print("���ڿ� �Է� : ");
//		str = sc.nextLine();
//		System.out.println("str : " + str);
//		}
		
		// 2. do ~while
		String str = null;
		// do ~while������ ������ �� ���� ������ �Ǳ� ������ string�� 
		// ���� �޾� �� �� �ְ� �� ���� while���� ���ϱ� ������ null ��� ����
		do {
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		} while(!str.equals("exit"));
		
//		���ڿ� �Է� : apple
//		str : apple
//		���ڿ� �Է� : rainbow
//		str : rainbow
//		���ڿ� �Է� : exit
//		str : exit
	}
	public void method2() {
		
		int menuNum = 0;
		do {
		System.out.println("1. �׽�Ʈ 1");
		System.out.println("2. �׽�Ʈ 2");
		System.out.println("3. �׽�Ʈ 3");
		System.out.println("9. ����");
		System.out.println("�޴� ���� : ");
		menuNum = sc.nextInt();
		
		switch(menuNum) {
			case 1 : System.out.println(1); break;
			case 2 : System.out.println(2); break;
			case 3 : System.out.println(3); break;
			case 9 : System.out.println(9); break;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�");
		}
		} while (menuNum != 9);	
//		1. �׽�Ʈ 1
//		2. �׽�Ʈ 2
//		3. �׽�Ʈ 3
//		9. ����
//		�޴� ���� : 
//		2
//		2
//		1. �׽�Ʈ 1
//		2. �׽�Ʈ 2
//		3. �׽�Ʈ 3
//		9. ����
//		�޴� ���� : 
	}
}



























