package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	Scanner sc = new Scanner(System.in);
	public void practiceCasting(){
		System.out.print("���� : ");
		double nationalLanguageScore = sc.nextDouble();
		System.out.print("���� : ");
		double englishScore = sc.nextDouble();
		System.out.print("���� : ");
		double mathScore = sc.nextDouble();
		
		int total = (int)(nationalLanguageScore + englishScore + mathScore);
		System.out.println("���� : " + total);
		System.out.println("��� : " + total / 3);
//		���� : 75.7
//		���� : 56
//		���� : 86
//		���� : 217
//		��� : 72
	}

}
