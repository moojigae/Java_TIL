package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	Scanner sc = new Scanner(System.in);
	public void practiceScanner() {
		System.out.print("ù ��° ������ �Է��ϼ���: " );
		int num1 = sc.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ���: ");
		int num2 = sc.nextInt();
		
		System.out.println("ù ��° ���� : " + num1);
		System.out.println("�� ��° ���� :" + num2);
		System.out.println("���ϱ� ��� : " + (num1 + num2));
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("������ ��� : " + (num1 / num2));
//		ù ��° ������ �Է��ϼ���: 20
//		�� ��° ������ �Է��ϼ���: 3
//		ù ��° ���� : 20
//		�� ��° ���� :3
//		���ϱ� ��� : 23
//		���� ��� : 17
//		���ϱ� ��� : 60
//		������ ��� : 6
	}
}
