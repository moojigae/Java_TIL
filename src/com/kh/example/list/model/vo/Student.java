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
		return name + "(" + score + "��)";
	}
	
	
//	�ش� �������̵��� ����ϴ� ���� : remove�� ���� �� �ȿ� �ִ� �����Ͱ� ������� �����Ϳ� �ּҰ� �ٸ��� ������
//	�ٸ� �ּҷ� �ν��ϰ� �������� �ʴ´�. �̸� �ذ��ϱ� ���� ����
//	�������� ����� ���� ���� ����ϴ� ����� ��Ŭ������ �����ϴ� ��� �� �ϳ�
//	hashCode()�� equals()�� ���� ��ü�̴� �翬�� ����� ���ƾ� �ϰ� ���� ���ƾ� �ϴ°� �Ծ���
	@Override
	public int hashCode() {
		final int prime = 31; // 31: ��ǻ�Ͱ� ������� �� ������ ũ�鼭 ����ϱ� ���� �Ҽ��� 31
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {	// this�� obj�� �ּҰ� ������ ���� ��ü�̴� �������� �������� ��
//		 this�� �ּҸ� ������ �ֱ� ������ ������ ����
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) { // getClass() : �� Ŭ������ ���� ������ ������ �ִ� �޼ҵ�
			return false;
		}
//		----------------------- ���� ��ü ��ü�� ��
//		----------------------- �Ʒ� �ʵ� �� 
		
		Student Other = (Student)obj; // Ȯ���ϱ� ���� ����ȯ
		if(name == null) {	// ���� ������ �ִ� �ְ� null�ε� �ϰ� ������ �ִµ� null�� �ƴϸ� false
			if(Other.name != null) {
				return false;
			}
		} else if(!name.equals(Other.name)) { // �ʰ� ���� �̸��� ���� ���� �̸��� ���� ������ false
			return false;
		}
//		---------------------- �⺻�ڷ����� ��� �Ʒ��� ���� �� �������� ��� ���� ���� ��
		if(score != Other.score) { // ���ھ ���� ������ false
			return false;
		}
		return true; // �������� true
	}

	
@Override
public int compareTo(Student o) { 	// ��� ���� �������� ������ ������ ������ ������
//	�̸��� ���ؼ� �������� ����
//	�̸� ==> String
//	==> String�� ���� �������� ����
	
	String otherName = o.getName();
	
	/*
	 * compareTo()�� ��ȯ �� : int
	 * �� ��ü�� �� ���� ������ 0�� ��ȯ
	 * �� ��ü�� �� ��󺸴� ũ�� 1�� ��ȯ
	 * �� ��ü�� �� ��󺸴� ������ -1�� ��ȯ 
	 * */
	
	return name.compareTo(otherName);
//	return -name.compareTo(otherName); ���������� ���̳ʽ��� ���̸� ��
}	
}
