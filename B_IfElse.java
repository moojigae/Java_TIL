package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	// if-else��
//	if(���ǽ�) {
//		������ ����1;
//	} else {
//		������ ����2;
//	}
	// �� �� �� ���� �����ϴ� ���ǹ�
	// ���ǽ� ��� ���� ���̸� if�� �ȿ� �ִ� ������ ����1 ����
	// ���ǽ� ��� ���� �����̸� if���� �������� else�� �ȿ� �ִ� ������ ���� 2 ����
	Scanner sc = new Scanner(System.in);
	public void method1() {
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
	}
//	���ڸ� �� �� �Է��ϼ��� : 5
//	�Է��Ͻ� ���ڴ� Ȧ���Դϴ�
//	���α׷� ����
	
	public void method2() {
		// ����ڿ��� ����, ����, ���� ������ �Է¹޾Ƽ� ���� kor, eng, math ������ ����
		// �� ���� ������ 40�� �̻��̰� �� ���� ��� ������ 60�� �̻��� �� "���� ���",
		// �ϳ��� ���� �̴��� �� "���� �����" ���
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int kor = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int eng = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int math = sc.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("���� ���");
		} else {
			System.out.println("���� �����");
//		���� ������ �Է��ϼ��� : 40
//		���� ������ �Է��ϼ��� : 30
//		���� ������ �Է��ϼ��� : 60
//		���� �����
		}
	}
	
	public void method3() {
		// String�� ==���� ���� ������ ���� �� ����
		// == �񱳴� ���� char boolean ���� �� ����
		// ���ڿ� ���ϱ� : StringŬ���� �ȿ� �ִ� equals()
		// boolean java.lang.String.equals(Object object)
		// java.lang ��Ű�� �ȿ� String Ŭ���� �ȿ� equals�޼ҵ�
		// equals�� ��Ÿ���� ��ȯ���� boolean���� ��Ÿ��

		// ����ڿ��� �̸��� �޴µ� ���� ������ �̸��� ������ "�����Դϴ�"
		// ���� ������ "������ �ƴմϴ�" ���
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
//		name �ȿ� �ִ� ���̶� "�ڽſ�"�� ���� ����?
		if(name.equals("�ڽſ�")) {		// ������ true
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("������ �ƴմϴ�.");
//			�̸��� �Է��ϼ��� : �ڽſ�
//			�����Դϴ�.

		}
	}
}
