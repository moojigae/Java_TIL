package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	Scanner sc = new Scanner(System.in);
	public void practiceScanner() {
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String spell = sc.nextLine();
		
		System.out.println("ù ��° ���� : " + spell.charAt(0));
		System.out.println("�� ��° ���� : " + spell.charAt(1));
		System.out.println("�� ��° ���� : " + spell.charAt(2));
//		���ڿ��� �Է��ϼ��� : banana
//		ù ��° ���� : b
//		�� ��° ���� : a
//		�� ��° ���� : n
	}

}
