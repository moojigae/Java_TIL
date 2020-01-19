package com.kh.example.list.model.vo;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "(" + score + "점)";
	}
	
	
//	해당 오버라이딩을 사용하는 목적 : remove를 했을 때 안에 있는 데이터가 지우려는 데이터와 주소가 다르기 때문에
//	다른 주소로 인식하고 지워지지 않는다. 이를 해결하기 위해 사용됨
//	재정의의 방법은 많고 지금 사용하는 방법은 이클립스가 지원하는 방법 중 하나
//	hashCode()와 equals()는 같은 객체이니 당연히 결과가 같아야 하고 둘이 같아야 하는게 규약임
	@Override
	public int hashCode() {
		final int prime = 31; // 31: 컴퓨터가 계산했을 때 적당히 크면서 계산하기 좋은 소수가 31
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {	// this와 obj의 주소가 같으면 같은 객체이니 같으면이 조건으로 옴
//		 this는 주소를 가지고 있기 때문에 참조형 변수
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) { // getClass() : 내 클래스에 대한 정보를 가지고 있는 메소드
			return false;
		}
//		----------------------- 위에 객체 자체를 비교
//		----------------------- 아래 필드 비교 
		
		Student Other = (Student)obj; // 확장하기 위해 형변환
		if(name == null) {	// 내가 가지고 있는 애가 null인데 니가 가지고 있는데 null이 아니면 false
			if(Other.name != null) {
				return false;
			}
		} else if(!name.equals(Other.name)) { // 너가 가진 이름과 내가 가진 이름이 같지 않으면 false
			return false;
		}
//		---------------------- 기본자료형의 경우 아래와 같이 비교 참조형일 경우 위와 같이 비교
		if(score != Other.score) { // 스코어가 같지 않으면 false
			return false;
		}
		return true; // 나머지는 true
	}

	
@Override
public int compareTo(Student o) { 	// 어느 것을 기준으로 정렬할 것인지 기준점 재정의
//	이름에 대해서 오름차순 정렬
//	이름 ==> String
//	==> String에 대해 오름차순 정렬
	
	String otherName = o.getName();
	
	/*
	 * compareTo()의 반환 값 : int
	 * 비교 주체가 비교 대상과 같으면 0을 반환
	 * 비교 주체가 비교 대상보다 크면 1을 반환
	 * 비교 주체가 비교 대상보다 작으면 -1을 반환 
	 * */
	
	return name.compareTo(otherName);
//	return -name.compareTo(otherName); 내림차순은 마이너스만 붙이면 됨
}	
}
