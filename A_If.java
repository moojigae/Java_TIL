package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
//	
//	�ܵ� if��
//	if(���ǽ�) {
//		������ ����;
//	}
//	
//	���ǽ��� ��� ���� ��(true)�̸� {} �ȿ� �ִ� �ڵ� ����
//	���ǽ��� ��� ���� ����(false)�̸� {} �ȿ� �ִ� �ڵ� �����ϰ� �Ѿ
//	
	Scanner sc = new Scanner(System.in);
	public void method1() {
		// Ű����� �Է��� ���ڰ� ������� �������� ����ϱ�
		// "���ڸ� �Ѱ� �Է��ϼ��� : " �ȳ���Ʈ ��� �� num ������ �Է��� ���� ����
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�");
		} 
		if(num == 0) {
			System.out.println("�Է��Ͻ� ���ڴ�  0 �Դϴ�");
		}
		if(num < 0) {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�");
		}
		System.out.println("���α׷� ����");
	}
//	���ڸ� �� �� �Է��ϼ��� : 4
//	�Է��Ͻ� ���ڴ� ����Դϴ�
//	���α׷� ����
	public void method2() {
		// Ű����� �Է��� ���ڰ� ¦������ Ȧ������ ���
		
		// "���� �� ���� �Է��ϼ��� : " �ȳ����� ��� �� num ������ ������ ����
		// ¦���̸� "�Է��Ͻ� ���ڴ� ¦���Դϴ�.", Ȧ���̸� "�Է��Ͻ� ���ڴ� Ȧ���Դϴ�." ���
		// ���α׷��� ���� �� "���α׷� ����"���� ��� �� ���α׷� ����
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�");
		}
		System.out.println("���α׷� ����");
//		���ڸ� �� �� �Է��ϼ��� : 5
//		�Է��Ͻ� ���ڴ� Ȧ���Դϴ�
//		���α׷� ����
	}
}
