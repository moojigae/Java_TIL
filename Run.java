package com.kh.example.chap05_constructor.run;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(u1);
//		com.kh.example.chap05_constructor.model.vo.User@2ed94a8b
//		u1�� User��ü�� ���� �ּҰ� ���
//		The constructor User() is undefined
//		�Ű����� �ִ� �����ڸ� ���� ���¿��� �⺻ �����ڸ� ������ �� ��Ÿ���� ����
		u1.inform();
		
		User u2 = new User("id�Դϴ�", "pwd�Դϴ�");
//		�Ű����� id�� pwd�� �� �ֱ�
		u2.inform();
		
		User u3 = new User("id�Դϴ�","pwd�Դϴ�","�̸��Դϴ�");
		u3.inform();
		
		
	}
}
