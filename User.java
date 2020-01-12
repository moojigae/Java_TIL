package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
//	- userId : String
//	- userPwd : String
//	- userName : String
//	- enrollDate : Date(java.util)
	
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
// 	JVM�ʱⰪ : null, null, null, null
	
//	������ ��� ����(��ü�� �ϴ� ��)
//		1. ��ü �������ֱ� ���� ����
//		2. �Ű������� ���� ���� ������ �ʵ� �ʱ�ȭ�ϴ� ����
	
//	������ ��� ��Ģ
//		1. �����ڸ��� Ŭ������� �����ؾ� ��
//		2. ��ȯ��(������)�� �������� ����
	
	public User() {} // �⺻ ������ : �Ű������� ���� ������
//	JVM�� �⺻������ ������ ��
//	�Ű����� �ִ� �����ڸ� ����� JVM�� �ڵ����� ���������� �ʱ� ������ �ݵ�� ����ؾ� ��
	
//	public User() {}
//	Duplicate method User() in type User
//	���� �̸��� ������(�޼ҵ�)�� ���� �� �����ε��� ������� ������ ���� �߻�
	
	public User(String userId,String userPwd) {
//		System.out.println(id); // id�Դϴ�		�Ű������� ���� ���� ��
//		System.out.println(pwd); // pwd�Դϴ�		�Ű������� ���� ���� ��
//		�Ű������� ��������
//		���� ���� �̸��̶�� ���������� �켱 ������ ���� �������� �ļ����� ���������� ��
//		The assignment to variable userId has no effect
//		���� ���������� �������� ���� �ְ� ���� �� �ߴ� �޼���
		
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
	public User(String userId,String userPwd, String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId, userPwd); // �ٸ� ������ ȣ�� / ���� �� �� �� �ٷ� ����
		this.userName = userName;
	}
	
	public User(String userId,String userPwd, String userName, Date enrollDate) {
		this(userId, userPwd, userName);
		this.enrollDate = enrollDate;
	}
	
//	public User(String id, String name) {
//		Duplicate method User(String, String) in type User
//		�Ű����� ������ Ÿ���� ��ġ�ϱ� ������ ���� �߻�. Ÿ�Ը� ��
//		userId = id;
//		userName = name;
//	}
	
	public void inform() {
		System.out.println(this);	// ��ü�� ���� �ּҰ� ���
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
		
//		User u1 = new User();		
//		System.out.println(u1);		u1�� User��ü�� ���� �ּҰ� ��� -> com.kh.example.chap05_constructor.model.vo.User@2ed94a8b
//		com.kh.example.chap05_constructor.model.vo.User@2ed94a8b	System.out.println(this);�� ���� �ּ� ���
//		u1.inform();		-> null, null, null, null

//		User u2 = new User("id�Դϴ�", "pwd�Դϴ�");   �Ű����� id�� pwd�� �� �ֱ�
//		u2.inform();
//		com.kh.example.chap05_constructor.model.vo.User@38082d64
//		id�Դϴ�, pwd�Դϴ�, null, null

//		User u3 = new User("id�Դϴ�","pwd�Դϴ�","�̸��Դϴ�");
//		u3.inform();
//		com.kh.example.chap05_constructor.model.vo.User@dfd3711
//		id�Դϴ�, pwd�Դϴ�, �̸��Դϴ�, null
	}
}
