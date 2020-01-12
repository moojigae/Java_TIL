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
// 	JVM초기값 : null, null, null, null
	
//	생성자 사용 목적(객체가 하는 일)
//		1. 객체 생성해주기 위한 목적
//		2. 매개변수로 전달 받은 값으로 필드 초기화하는 목적
	
//	생성자 사용 규칙
//		1. 생성자명은 클래스명과 동일해야 함
//		2. 반환형(리턴형)이 존재하지 않음
	
	public User() {} // 기본 생성자 : 매개변수가 없는 생성자
//	JVM이 기본적으로 생성해 줌
//	매개변수 있는 생성자를 만들면 JVM이 자동으로 생성해주지 않기 때문에 반드시 명시해야 함
	
//	public User() {}
//	Duplicate method User() in type User
//	같은 이름의 생성자(메소드)가 있을 때 오버로딩이 적용되지 않으면 에러 발생
	
	public User(String userId,String userPwd) {
//		System.out.println(id); // id입니다		매개변수로 전달 받은 값
//		System.out.println(pwd); // pwd입니다		매개변수로 전달 받은 값
//		매개변수는 지역변수
//		같은 변수 이름이라면 지역변수가 우선 순위를 먼저 가져가고 후순위는 전역변수가 됨
//		The assignment to variable userId has no effect
//		같은 지역변수에 지역변수 값을 넣고 있을 때 뜨는 메세지
		
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
	public User(String userId,String userPwd, String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId, userPwd); // 다른 생성자 호출 / 위에 두 줄 한 줄로 생략
		this.userName = userName;
	}
	
	public User(String userId,String userPwd, String userName, Date enrollDate) {
		this(userId, userPwd, userName);
		this.enrollDate = enrollDate;
	}
	
//	public User(String id, String name) {
//		Duplicate method User(String, String) in type User
//		매개변수 순서와 타입이 일치하기 때문에 에러 발생. 타입만 봄
//		userId = id;
//		userName = name;
//	}
	
	public void inform() {
		System.out.println(this);	// 객체에 대한 주소가 담김
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
		
//		User u1 = new User();		
//		System.out.println(u1);		u1에 User객체에 대한 주소값 담김 -> com.kh.example.chap05_constructor.model.vo.User@2ed94a8b
//		com.kh.example.chap05_constructor.model.vo.User@2ed94a8b	System.out.println(this);에 의한 주소 출력
//		u1.inform();		-> null, null, null, null

//		User u2 = new User("id입니다", "pwd입니다");   매개변수 id와 pwd에 값 넣기
//		u2.inform();
//		com.kh.example.chap05_constructor.model.vo.User@38082d64
//		id입니다, pwd입니다, null, null

//		User u3 = new User("id입니다","pwd입니다","이름입니다");
//		u3.inform();
//		com.kh.example.chap05_constructor.model.vo.User@dfd3711
//		id입니다, pwd입니다, 이름입니다, null
	}
}
