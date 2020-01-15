package com.kh.example.chap02_Wrapper.controller;

public class WrapperController {
	public void method1() {
//		String을 기본 자료형으로 바꾸기
		Byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("3");
		long l = Long.parseLong("4");
		float f = Float.parseFloat("5");
		double d = Double.parseDouble("6");
		boolean bool = Boolean.parseBoolean("true");
		
		char ch = "abc".charAt(0);
		
		System.out.println(b); // 1
		System.out.println(s); // 2
		System.out.println(i); // 3
		System.out.println(l); // 4
		System.out.println(f); // 5.0
		System.out.println(d); // 6.0
		System.out.println(bool); // true / 숫자가 매개변수로 들어가면 false 반
		System.out.println(ch); // a
	}
	public void method2() {
//		기본 자료형을 String으로 바꾸기
		String b = Byte.valueOf((byte)1).toString();
		String b1 = 1 + "";
		String b2 = String.valueOf(1);
		String s = Short.valueOf((short)2).toString();
		String i = Integer.valueOf(3).toString();
		String l = Long.valueOf(4L).toString();
		String f = Float.valueOf(0.1f).toString();
		String d = Double.valueOf(0.2).toString();
		String bool = Boolean.valueOf(true).toString();
		String ch = Character.valueOf('a').toString();
		
		System.out.println(b); 	// 1
		System.out.println(b1);	// 1
		System.out.println(b2);	// 1
		System.out.println(s);	// 2
		System.out.println(i);	// 3
		System.out.println(l);	// 4
		System.out.println(f);	// 0.1
		System.out.println(d);	// 0.2
		System.out.println(bool);	// true
		System.out.println(ch);	// a
	}
}
