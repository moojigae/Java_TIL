package com.kh.example.chap01.condition;

import java.util.Scanner;

public class C_IfElseIf {
	// if-else if�� : ���� ������ �� �� �ִ� ���ǹ�
	// if(���ǽ�1){
//		������ ����1;
//		} else if(���ǽ�2) {
//			������ ����2;
//		} else if(���ǽ�3) {
//			������ ����3;
//		} else {
//			������ ����4;
//		}
	    
	// ���ǽ�1�� ���̸� ������ ����1 ����
	// ���ǽ�2�� ���̸� ������ ����2 ����
	// ���ǽ�3�� ���̸� ������ ����3 ����
	// �ƹ����ǵ� ���� �ƴ϶�� ������ ����4 ����
	Scanner sc = new Scanner(System.in);
	public void method1() {
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		String result;
		if(num > 0) {
			result = "�����";
		} else if(num == 0) {
			result = "0�̴�";
		} else {
			result = "������";
		}
		
		System.out.println(result);
//		���� �ϳ� �Է� : 0
//		0�̴�
	}
	
	public void method2() {
		// ���̸� �Է¹޾� 13�� ���ϸ� "���", 13�� �ʰ� 19�� ���ϸ� "û�ҳ�", 19�� �ʰ� "����" ���
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		String result;
		if(age <= 13) {
			result = "���";
		} else if(age > 19) {
			result = "����";
		} else {
			result = "û�ҳ�";
		}
		System.out.println(result);
//		���̸� �Է��ϼ��� : 13
//		���
	}
}
