package com.kh.example.chap06_method.model.vo;

public class Traniee {
//	�ʵ� ����
	private String name;
	private final String ACADEMY = "KH"; // �������
	private char classRoom;
	private static double score;
	
	public Traniee() {}; // �⺻ ������
	public Traniee(String name) {
		this.name = name;
	}
	public Traniee(String name, char classRoom, double score) {
		this.name = name;
		this.classRoom = classRoom;
		Traniee.score = score; // class��.������ = static���� �� �ҷ�����
	}
	
//	�ʵ忡 �ִ� name���� �޾ƿ� �Ű������� ���� �ʱ�ȭ ��Ű�� �޼ҵ� setter 
	public void setName(String name) {
		this.name = name;
	}
	
//	�ʵ忡 �ִ� classRoom���� �޾ƿ� �Ű������� ���� �ʱ�ȭ ��Ű�� �޼ҵ� setter 
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	
//	�ʵ忡 �ִ� score���� �޾ƿ� �Ű������� ���� �ʱ�ȭ ��Ű�� �޼ҵ� setter 
	public static void setScore(double score) {
		Traniee.score = score;
	}
	
//	�ʵ忡 �ִ� name�� ��ȯ�ϴ� getter
	public String getName() {
		return name;
	}
	
//	�ʵ忡 �ִ� ACADEMY�� ��ȯ�ϴ� getter
	public String getACADEMY() {
		return ACADEMY;
	}
	
//	�ʵ忡 �ִ� classRoom�� ��ȯ�ϴ� getter
	public char getClassRoom() {
		return classRoom;
	}
	
//	�ʵ忡 �ִ� score�� ��ȯ�ϴ� getter
	public static double getScore() {
		return score;
	}
	
	public String inform() {
		return name + ", " + ACADEMY + ", " + classRoom + ", " + score;
	}
}
