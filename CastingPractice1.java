package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	Scanner sc = new Scanner(System.in);
	public void practiceCasting() {
		System.out.println("¹®ÀÚ : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(ch + " unicode : " + (int)ch); //b unicode : 98	
	}
}
