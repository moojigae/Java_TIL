package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPracticeHard {
	public void practice11() {
//	������ �̿��ؼ� 4�ڸ� ��й�ȣ�� ������� �ϴµ� �� �� 4�ڸ� ������ �Է� �޾Ƽ� �� �ڸ��� �ߺ��Ǵ� ���� ���� ��� "���� ����"
//	�ߺ����� ������ "�ߺ� �� ����" �ڸ� ���� �ȸ����� "�ڸ� �� �ȸ���" ���
//	��, ���� ���ڸ� ���� ���� 1~9 ���� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��й�ȣ �Է�(1000~9999) : ");
		String pw = sc.nextLine();
		
		boolean bool = true;
		
		if(pw.length() != 4) {
			System.out.println("�ڸ� �� �ȸ���");
		} else {
		for(int i = 0; i < pw.length(); i++) {
			for(int j = 0; j <pw.length(); j++) {
				if(i != j) {
				if(pw.charAt(i) == pw.charAt(j)) {
					bool = false;
				}
				}
			}
		}
		if(bool == false) {
			System.out.println("�ߺ� �� ����");
		} else {
			System.out.println("���� ����");
		}
	}
}
}

