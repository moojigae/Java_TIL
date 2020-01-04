package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	Scanner sc = new Scanner(System.in);
	// && : �ǿ����ڰ� ��� true �� �� true ��ȯ(�׸���, ~�鼭)
	// || : �ǿ����� �߿��� �ϳ��� true�� �� true ��ȯ(�Ǵ�, ~�ų�)
	public void method1() {
		// �Է��� ���� ���� 1~100 ������ �������� Ȯ��
		// ���� �ϳ� �Է� : 
		System.out.print("���� �ϳ� �Է�: ");
		int num = sc.nextInt();
		
		// 1~100 ������ ����
		// ���ڰ� 1���� ũ�ų� ����, 100���� �۰ų� ����
		System.out.println("1���� 100������ �������� Ȯ�� : " + (num >=1 && num <= 100));
//		���� �ϳ� �Է�: 101
//		1���� 100������ �������� Ȯ�� : false
	}
	
	public void method2() {
		// �Է��� ���� ���� �빮������ Ȯ�� 
		// ���� �ϳ� �Է� : 
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean isCap = (ch >= 'A' && ch <= 'Z');
		// ���ڵ� ���ڿ� ���� ġȯ �� �� �ֱ� ������ ũ�� �۴ٷ� ǥ�� �� �� ����
		System.out.println("���� �빮�ڰ� �½��ϱ�? " + isCap);
		
		// ��� �Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� : 
		// ��� �ϰڴٰ� �ϼ̽��ϱ�? _____(�����)
		
		System.out.print("����Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� : ");
		char answer = sc.nextLine().charAt(0);
		
		System.out.println("��� �Ͻðڴٰ� �ϼ̽��ϱ�? " + (answer == 'y' || answer == 'Y'));
//		���� �ϳ� �Է� : a
//		���� �빮�ڰ� �½��ϱ�? false
//		����Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� : Y
//		��� �Ͻðڴٰ� �ϼ̽��ϱ�? true
	}
}
