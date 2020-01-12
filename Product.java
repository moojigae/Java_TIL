package com.kh.example.chap04_field.model.vo;

public class Product {
	private String name = "초코파이";
	private String brand = "오리온";
	private int price = 1500;
	private static int num = 100;
	
	{	// 인스턴스 변수 : 인스턴스(객체)가 만들어질 때 메모리에 올라감
		name = "칸초";
		price = 1000;
		brand = "롯데";
		num -= 10;
	}
	
	static {
//		static 블럭은 처음 한 번 초기화 됨
//		static은 프로그램 시작하자마자 올라가야하는데 
//		아래 값들은 static이 아니라서 객체를 만들어야 올라가는 애들이라 올라갈지 확실하지 않아 넣을 수가 없음
//		name = "홈럼볼";
//		brand = "해태";
//		price = 2000;
		num = 150;
		num--;
	}
	
	public void inform() {
		System.out.println(name + ", " + brand + ", " + price + ", " + num);	
//		칸초, 롯데, 1000, 139
//		칸초, 롯데, 1000, 129
//		칸초, 롯데, 1000, 119
		
//		위의 결과 값 출력 이유
//		1. 프로그램 처음 시작 시 static이 포함되어 있는 코드는 static영역으로 올라감
//		2. 그로인해 static영역에 num = 100으로 올라간 후 static 블럭을 통해 num = 149가 되어 있음
//		3. 인스턴스 초기화를 통해서 객체가 한 번 생성 될 때마다 num값이 -10씩 된 값이 출력됨
	}
}
