package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	Scanner sc = new Scanner(System.in);
	public void practiceCasting(){
		System.out.print("±¹¾î : ");
		double nationalLanguageScore = sc.nextDouble();
		System.out.print("¿µ¾î : ");
		double englishScore = sc.nextDouble();
		System.out.print("¼öÇÐ : ");
		double mathScore = sc.nextDouble();
		
		int total = (int)(nationalLanguageScore + englishScore + mathScore);
		System.out.println("ÃÑÁ¡ : " + total);
		System.out.println("Æò±Õ : " + total / 3);
//		±¹¾î : 75.7
//		¿µ¾î : 56
//		¼öÇÐ : 86
//		ÃÑÁ¡ : 217
//		Æò±Õ : 72
	}

}
