package com.kh.example.chap06_method.model.vo;

public class Traniee {
//	필드 선언
	private String name;
	private final String ACADEMY = "KH"; // 상수선언
	private char classRoom;
	private static double score;
	
	public Traniee() {}; // 기본 생성자
	public Traniee(String name) {
		this.name = name;
	}
	public Traniee(String name, char classRoom, double score) {
		this.name = name;
		this.classRoom = classRoom;
		Traniee.score = score; // class명.변수명 = static영역 값 불러오기
	}
	
//	필드에 있는 name값을 받아온 매개변수를 통해 초기화 시키는 메소드 setter 
	public void setName(String name) {
		this.name = name;
	}
	
//	필드에 있는 classRoom값을 받아온 매개변수를 통해 초기화 시키는 메소드 setter 
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	
//	필드에 있는 score값을 받아온 매개변수를 통해 초기화 시키는 메소드 setter 
	public static void setScore(double score) {
		Traniee.score = score;
	}
	
//	필드에 있는 name을 반환하는 getter
	public String getName() {
		return name;
	}
	
//	필드에 있는 ACADEMY을 반환하는 getter
	public String getACADEMY() {
		return ACADEMY;
	}
	
//	필드에 있는 classRoom을 반환하는 getter
	public char getClassRoom() {
		return classRoom;
	}
	
//	필드에 있는 score을 반환하는 getter
	public static double getScore() {
		return score;
	}
	
	public String inform() {
		return name + ", " + ACADEMY + ", " + classRoom + ", " + score;
	}
}
