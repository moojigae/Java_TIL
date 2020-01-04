package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		// Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����" 
		// ����� �ƴϸ� "����� �ƴϴ�"�� ���
		System.out.print("�ϳ��� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = num > 0? "�����" : "����� �ƴϴ�"; 
		System.out.println(result);
//		�ϳ��� ������ �Է��ϼ��� : 5
//		�����
	}
	public void practice2() {
		// Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����",
		// ����� �ƴ� ��� �߿��� 0�̸� "0�̴�", 0�� �ƴϸ� "������"�� ���
		System.out.print("�ϳ��� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����" : (num == 0) ? "0�̴�" : "������";
		System.out.println(result);
//		�ϳ��� ������ �Է��ϼ��� : -2
//		������
	}
	public void practice3() {
		// Ű����� �Է� ���� �ϳ��� ������ ¦���̸� "¦����"
		// ¦���� �ƴϸ� "Ȧ����"�� ���
		System.out.print("�ϳ��� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "¦����" : "Ȧ����";
		System.out.println(result);
//		�ϳ��� ������ �Է��ϼ��� : 3
//		Ȧ����
	}
	public void practice4() {
		// ��� ����� ������ ���� ������������ �Ѵ�
		// �ο� ���� ���� ������ �Է� �ް�
		// 1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ���
		System.out.print("�ο� �� : ");
		int person = sc.nextInt();
		System.out.print("���� �� : ");
		int candy = sc.nextInt();
		
		int result1 = candy / person;
		int result2 = person * result1;
		
		System.out.println("1�δ� ���� ���� : " + result1);
		System.out.println("���� ���� ���� : " + (candy - result2)); 
//		�ο� �� : 5
//		���� �� : 28
//		1�δ� ���� ���� : 5
//		���� ���� ���� : 3
	}
	public void practice5() {
		// ������ 'M'�̸� ���л�, 'M'�� �ƴϸ� ���л����� ���
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ�) : ");
		int year = sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int Class = sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		float grade = sc.nextFloat();
		
		String isMan = gender == 'M' ? "���л�" : (gender == 'm') ? "���л�" : "���л�";
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�." , year, Class, number, name, isMan, grade);
//		�̸� : �ƹ���
//		�г�(���ڸ�) : 3
//		��(���ڸ�) : 2
//		��ȣ(���ڸ�) : 12
//		����(M/F) : F
//		����(�Ҽ��� �Ʒ� ��°�ڸ�����) : 67.89
//		3�г� 2�� 12�� �ƹ��� ���л��� ������ 67.89�̴�.
	}
	public void practice6() {
		// ���̸� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ�~19�� ����)����
		// ����(19�� �ʰ�)���� ���
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		String result = age < 13 ? "���" : (age > 19) ? "����" : "û�ҳ�";
		System.out.println(result);
//		���̸� �Է��ϼ��� : 19
//		û�ҳ�
	}
	public void practice7() {
		// ����, ����, ���� ������ ������ �Է� �ް�,
		// �� ���� ���� �հ�� ���(�հ�/3.0)�� ���ϼ���
		// �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴϸ� ���հ� ���
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		System.out.println("�հ� : "+ total);
		System.out.println("��� : " + (float)(total / 3.0));
		System.out.println((kor >= 40 && eng >= 40 && math >= 40 && total / 3 >= 60) ? "�հ�" : "���հ�");
//		���� : 34
//		���� : 78
//		���� : 57
//		�հ� : 169
//		��� : 56.333332
//		���հ�
	}
	public void practice8() {
		//�ֹι�ȣ�� �̿��ؼ� �������� �������� �����Ͽ� ���
//		if(num == '1' || num == '3') {
//			System.out.println("����");
//		} else {
//			System.out.println("����");
//		}
		System.out.print("�ֹε�� ��ȣ�� �Է��ϼ���(- ����) : ");
		char num = sc.nextLine().charAt(7);
		System.out.println(num == '1' || num == '3' ? "����" : (num == '2' || num == '4') ? "����" : "�߸��Է��ϼ̽��ϴ�");
//		�ֹε�� ��ȣ�� �Է��ϼ���(- ����) : 981231-312345
//		����
		
	}
	public void practice9() {
		// ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� ����
		// �ٸ� ���� �ϳ� �� �Է� �ް� �� ���� num1 ���ϰų� num2 �ʰ��̸� true ���
		// �ƴϸ� false ���. ��, num1�� num2���� �۾ƾ� ��
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է� : ");
		int num3 = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if(num1 < num2) {
			max = num2;
			min = num1;
		} else { 	// num1 >= num2
			max = num1;
			min = num2;
		}
		
		boolean result = num3 < min || num3 > max;
		System.out.println(result);
//		����1 : 3
//		����2 : 6
//		�Է� : 8
//		true
	}
	public void practice10() {
		// 3���� ���� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false ���
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		
		boolean result = num1 == num2 && num1 == num3 && num2 == num3;
		
		System.out.println(result);
//		�Է�1 : 34
//		�Է�2 : 34
//		�Է�3 : 34
//		true
	}
	public void practice11() {
		// A, B, C ����� ������ �Է� �޾� �� ����� ������ �μ�Ƽ�긦 ������ 
		// ������ ����Ͽ� ���. �μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� "3000 �̻�"
		// �̸��̸� "3000 �̸�"�� ���
		// A ����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ����, C ����� �μ�Ƽ�� 0.15
		
		System.out.print("A����� ���� : ");
		int wage1 = sc.nextInt();
		System.out.print("B����� ���� : ");
		int wage2 = sc.nextInt();
		System.out.print("C����� ���� : ");
		int wage3 = sc.nextInt();
		
		double result1 = wage1 * 1.4;
		double result2 = wage2;
//		double result3 = wage3 * 1.15;
		double result3 = wage3 + wage3 * 0.15; // ǥ�������� ���� ��� ��
		// 2������ �ٲ㼭 ���� ���� = �ε��Ҽ���
		
		String result4 = result1 >= 3000 ? "3000 �̻�" : "3000 �̸�";
		String result5 = result2 >= 3000 ? "3000 �̻�" : "3000 �̸�";
		String result6 = result3 >= 3000 ? "3000 �̻�" : "3000 �̸�";
		
//		String s1 = "3000�̻�";
//		String s2 = "3000�̸�"
		
		System.out.println("A��� ���� / ����+a : " + wage1 + '/' + result1 + '\n' + result4);
		System.out.println("B��� ���� / ����+a : " + wage2 + '/' + result2 + '\n' + result5);
		System.out.println("C��� ���� / ����+a : " + wage3 + '/' + result3 + '\n' + result6);	}
//		A��� ���� / ����+a : 2400/3360.0
//		3000 �̻�
//		B��� ���� / ����+a : 2900/2900.0
//		3000 �̸�
//		C��� ���� / ����+a : 3000/3450.0
//		3000 �̻�

}
