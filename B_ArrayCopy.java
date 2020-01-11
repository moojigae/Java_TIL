package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
//	 ���� ���� : �迭�� �ּҸ� ����, ������ ����
//	 ���� ���� : ������ ���ο� �迭�� �����Ͽ� ���� ���� ���� �����Ͽ� ���� ���
//	 1) for���� �̿��� 1:1 ����
//	 2) system.arraycopy() �� �̿��� ����
//	 3) Arrays.copyOf() �̿��� ����
//	 4) clone() �̿��� ���� 	<- ����� �������� ���� 
	
	public void method1() {
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = originArr; // ���� ����
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " "); // 1 2 3 4 5 
		}
		System.out.println();
		for(int i = 0; i < copyArr.length;i++) {
			System.out.print(copyArr[i] + " "); // 1 2 3 4 5 
		}
		System.out.println();
		// ���� �迭�� 0��° �ε����� 99�� ����
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " "); 	// 99 2 3 4 5
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");		// 99 2 3 4 5
		}
		System.out.println();
		
		System.out.println("originArr�� �ּ� �� : " + originArr); 	// originArr�� �ּ� �� : [I@15db9742
		System.out.println("copyArr�� �ּ� �� : " + copyArr);		// copyArr�� �ּ� �� : [I@15db9742
	}

	public void method2() {
		// ���� ���� 1. for�� �̿�
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[5];
		
		for(int i=0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];	// copyArr�� �� originArr �־�
		}
		for(int i=0; i < originArr.length;i++) {
			System.out.print(originArr[i] + " ");	// 1 2 3 4 5 
		}
		System.out.println();
		for(int i=0; i < copyArr.length;i++) {
			System.out.print(copyArr[i] + " ");		// 1 2 3 4 5 
		}
		System.out.println();
		
		System.out.println("==== originArr�� 0��° �ε����� 99�� ���� ====");
		originArr[0] = 99;
		
		for(int i=0; i<originArr.length;i++) {
			System.out.print(originArr[i] + " ");	// 99 2 3 4 5 
		}
		System.out.println();
		for(int i=0; i < copyArr.length;i++) {
			System.out.print(copyArr[i] + " ");		// 1 2 3 4 5 
		}
		System.out.println();
	}
	
	public void method3() {
		//��������2: arraycopy() �̿�
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
//						   �����迭������ġ	  ����迭������ġ
//		System.arraycopy(src, srcPos, dest, destPos, length);
//						���� �迭		 ���� �迭			 ���� ����
//		originArr �迭�� ��� �����͸� copyArr�迭�� ���縦 �ϴµ� 
//		copyArr�� 3��° �ε����������� �ٿ��ְ� ����
		
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");	// 1 2 3 4 5 
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");		// 0 0 0 1 2 3 4 5 0 0 
		}
		System.out.println();
		
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");	// 99 2 3 4 5  
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");		// 0 0 0 1 2 3 4 5 0 0 
		}
		System.out.println();
	}
	
	public void method4() {
		// ���� ���� 3. Arrays.copyOf() �̿�
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.out.println("==== ó�� �� ====");
		for(int i = 0; i < originArr.length;i++) {
			System.out.print(originArr[i] + " " );	// 1 2 3 4 5 
		}
		System.out.println();
		for (int i = 0; i < copyArr.length;i++) {
			System.out.print(copyArr[i] + " ");		// 0 0 0 0 0 0 0 0 0 0   int�� �⺻�� 0���� �ʱ�ȭ �Ǿ� ����
		}
		System.out.println();
		
		System.out.println("==== copyOf()�� ���� �� ====");
//		Arrays.copyOf(original, newLength)
//					  ���� �迭    ������ ����
		
		copyArr = Arrays.copyOf(originArr, originArr.length);
		// Arrays Ŭ������ �迭�� ����� �� ���� �޼ҵ���� ��� ����
		// collections �ݷ����� ����� �� ������ �޼ҵ���� ��� ���� Ŭ����
		
		for(int i = 0; i < originArr.length;i++) {
			System.out.print(originArr[i] + " " );		// 1 2 3 4 5
		}
		System.out.println();
		for (int i = 0; i < copyArr.length;i++) {
			System.out.print(copyArr[i] + " ");			// 1 2 3 4 5
		}
		System.out.println();
	}
}























