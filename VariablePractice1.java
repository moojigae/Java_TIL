package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	Scanner sc = new Scanner(System.in);
	public void practiceScanner() {
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		System.out.print("������ �Է��ϼ���(��/��): ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���: ");
		double height = sc.nextDouble();
		
		System.out.println("Ű " + height + "cm�� " + age + "�� " + gender + "�� " + name + "�� �ݰ����ϴ�^^");
//		�̸��� �Է��ϼ���: a
//		������ �Է��ϼ���(��/��): ��
//		���̸� �Է��ϼ���: 19
//		Ű�� �Է��ϼ���: 156
//		Ű 156.0cm�� 19�� ���� a�� �ݰ����ϴ�^^
	}
}