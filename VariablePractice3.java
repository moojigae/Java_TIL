package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	Scanner sc = new Scanner(System.in);
	public void practiceScanner() {
		System.out.print("가로 면적을 입력하세요 : ");
		double width = sc.nextDouble();
		System.out.print("세로 면적을 입력하세요 : ");
		double length = sc.nextDouble();
		
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + length);
		System.out.println("면적 : " + (width * length));
		System.out.println("둘레 : " + ((width + length) * 2));
//		가로 면적을 입력하세요 : 34.6
//		세로 면적을 입력하세요 : 78.4
//		가로 : 34.6
//		세로 : 78.4
//		면적 : 2712.6400000000003
//		둘레 : 226.0
	}
}
