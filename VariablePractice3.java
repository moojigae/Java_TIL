package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	Scanner sc = new Scanner(System.in);
	public void practiceScanner() {
		System.out.print("���� ������ �Է��ϼ��� : ");
		double width = sc.nextDouble();
		System.out.print("���� ������ �Է��ϼ��� : ");
		double length = sc.nextDouble();
		
		System.out.println("���� : " + width);
		System.out.println("���� : " + length);
		System.out.println("���� : " + (width * length));
		System.out.println("�ѷ� : " + ((width + length) * 2));
//		���� ������ �Է��ϼ��� : 34.6
//		���� ������ �Է��ϼ��� : 78.4
//		���� : 34.6
//		���� : 78.4
//		���� : 2712.6400000000003
//		�ѷ� : 226.0
	}
}
