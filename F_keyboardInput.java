package com.kh.variable;

import java.util.Scanner;

public class F_keyboardInput {
	Scanner sc = new Scanner(System.in);
	public void inputScanner() {
//		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: "); // �ȳ� ���� ����
		String name = sc.nextLine();
		// sc.nextLine(); �� ���� �� ���� Ŀ�� �����Ÿ��� ����ϴ� ���

		System.out.println("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		
		System.out.print("Ű(�Ҽ��� ù° �ڸ����� �Է�) : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "���� " + age + "���̸�, Ű�� " + height +"cm �Դϴ�.");
	}
	
	public void inputScanner2() {
		// ����ڿ��� �̸��� ���̸� �Է� �ޱ�
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ���: ");
//		int age = sc.nextInt();
//		System.out.print("�ּҸ� �Է��ϼ���: ");
//		String address = sc.nextLine();
		
//		�ذ��ϴ� ���
		
//		���1. �ٹٲ��� ������ �� �ִ� nextLine() �߰�
//		int age = sc.nextInt();
//		sc.nextLine(); // ���ۿ� �����ִ� �ٹٲ޸� �������� ����
//		System.out.print("�ּҸ� �Է��ϼ���: ");
//		String address = sc.nextLine();
		
//		���2. age�� ���� ���� nextLine()�� ���� int�� �Ľ��ϱ� 
//		�Ľ�: ���ڿ��� �⺻�ڷ������� �ٲ��ִ� �۾� / int�� �ٲ� �� "1"�� �Ǿ� �ִ°� ����/ "��������"�� �Ǿ� �ִ°� �Ұ���
//		boolean���� �ٲ� �� "true"�� ���� "��������"�� �Ұ���
//		String userAge = sc.nextLine();
//		int age = Integer.parseInt(userAge);   // �� �� ǥ��
		int age = Integer.parseInt(sc.nextLine()); // �� �� ǥ��
		System.out.print("�ּҸ� �Է��ϼ���: ");
		String address = sc.nextLine();
		
//		���3. next()�� �ּҸ� �ޱ�
//		�Ѱ� : next() �޼ҵ�� ���⸦ �� ���� ��� ó�� ���� �ν�
//		int age = sc.nextInt();
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.next();
		// next�� ���⸦ �����ڷ� �ν� 
		
		// + �߰� : char���� �ް� ���� ����?
		System.out.print("������ �Է��ϼ��� : "); // F/M
//		String userGender = sc.nextLine();
//		char gender = userGender.charAt(0);
		char gender = sc.nextLine().charAt(0); // �� �� �Ľ�
		// charAt(index)�޼ҵ�� ���ڿ����� index ��°�� ���ڸ� ������ 
		// string�� char�� ����
		// Zero-index ���� �ε��� ��� : 0���� ���ڸ� ���� ��
		
		System.out.println(name + "���� " + age + "���̸�, �ּҴ� " + address + "�Դϴ�.");
		System.out.println("gender : " + gender);
	}
}
