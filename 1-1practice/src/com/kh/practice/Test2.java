package com.kh.practice;

public class Test2 {
	public static void main(String[] args) {
		Object[] sarr = new String[4];

		sarr[0] = new String("123");
		sarr[1] = String.valueOf(new Integer(456));
//		sarr[2] = (String)new Object() // ��ü�� ��Ʈ������ ���� ����ȯ �� �� ����
		sarr[2] = (String)new Object().toString(); // new Object() ��ü�� �����ϸ� �ּҰ��� �����ǰ� �� �ּҰ��� String���� �ٲ��ִ� �޼ҵ�� toString() => java.lang.Object@15db9742 �ּҰ�
		sarr[3] = String.valueOf(789);	 // �迭 ���� ������. �迭 ���̸� 3���� 4�� �÷���

		for (Object obj : sarr) {
			System.out.println(obj);
		}

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
