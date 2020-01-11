package com.kh.example.dimension;

public class DimensionalArray {
	public void method1() {
		//  2���� �迭�� ����	: Stack	������ ���� ������
		//	�ڷ���[][] �迭��;
		//	�ڷ��� �迭��[][];
		// 	�ڷ���[] �迭��[];
		
		int[][] iArr1;
		int iArr2[][];
		int[] iArr3[];
		
		//  2���� �迭�� �Ҵ�
		//	�ڷ���[][] �迭�� = new �ڷ���[��ũ��][��ũ��];
		// 	�ڷ��� �迭��[][] = new �ڷ���[��ũ��][��ũ��];
		//  �ڷ���[] �迭��[] = new �ڷ���[��ũ��][��ũ��];
		
		// �����迭 : ���� ũ��� ������ ������ ���� ũ��� ������ ���� ����
		iArr1 = new int[3][5]; // �����迭: ��� ���� ũ�Ⱑ �������� �迭
	}
	
	public void method2() {
		// int���� iArr�̶�� �̸��� 3�� 5��¥�� �迭 ����
		int[][] iArr = new int[3][5];
		
		// �� ���
		// 1. �迭 �ε����� �����Ͽ� �� ���
		iArr[0][0] = 1;
		iArr[0][1] = 2;
		iArr[0][2] = 3;
		iArr[0][3] = 4;
		iArr[0][4] = 5;
		
		iArr[1][0] = 6;
		iArr[1][1] = 7;
		iArr[1][2] = 8;
		iArr[1][3] = 9;
		iArr[1][4] = 10;
		
		iArr[2][0] = 11;
		iArr[2][1] = 12;
		iArr[2][2] = 13;
		iArr[2][3] = 14;
		iArr[2][4] = 15;
		
		// 2. ���� for���� �̿��Ͽ� �� ���
		System.out.println("iArr.length : " + iArr.length); // 3
//		iArr.length�� Stack ������ iArr�� ã�� iArr�� Heap�� �ּ����� ��� ���� 
//		�� �ּҴ� ���� �ּ����̱� ������ �� ũ�Ⱑ ��� ��
		System.out.println("iArr[0].length : " + iArr[0].length); // 5
		
		int value = 1; // �迭 �ȿ� ���� �־� �ִ� ����
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length;j++) {
				iArr[i][j] = value;
				value++;
			}
		}
		
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length;j++) {
				System.out.printf("%-2d ", iArr[i][j]);
			}
//			1  2  3  4  5  
//			6  7  8  9  10 
//			11 12 13 14 15 
			System.out.println();
		}
		
	}
	public void method3() {
		//  ���� �迭
		//	�� ũ��� ������ ������ �� �࿡ ���� �� ũ�Ⱑ ������ ���� ���� ����
		// 	�ڷ����� ���� 1���� �迭 �������� �ϳ��� ���� ���� 2���� �迭�̱� ������
		// 	���� �ִ� 1���� �迭�� ���̰� �� ���� �ʿ�� ����
		
		int[][] iArr = new int[3][]; // ���� �迭 �Ҵ�
		iArr[0] = new int[2];
		iArr[1] = new int[1];
		iArr[2] = new int[3];	// 1���� �迭 �����
		
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%2d ", iArr[i][j]);
			}
			System.out.println();
//				 0  0 
//				 0 
//				 0  0  0 
		}
		
		// �� ���
		// 1. �ε��� �̿�
		iArr[0][0] = 1;
		iArr[0][1] = 2;
		
		iArr[1][0] = 3;
		
		iArr[2][0] = 4;
		iArr[2][1] = 5;
		iArr[2][2] = 6;
		
		// 2. ���� for�� �̿�
		int value = 1;
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length;j++) {
				iArr[i][j] = value++;
			}
		}
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%2d ", iArr[i][j]);
							
//				 1  2 
//				 3 
//				 4  5  6 
				
			}
			System.out.println();
		}
	}
	
	public void method4() {
		// ������ �迭�� �Ҵ�� �ʱ�ȭ ���ÿ� ����
		int[][] iArr1 = {{1, 2, 3, 4, 5},
						{6, 7, 8, 9, 10},
						{11, 12, 13, 14, 15}};
		
		for(int i = 0; i < iArr1.length; i++) {
			for(int j = 0; j < iArr1[i].length; j++) {
				System.out.printf("%2d ", iArr1[i][j]); 
			}
			System.out.println();
//				 1  2  3  4  5 
//				 6  7  8  9 10 
//				11 12 13 14 15 
		}
		
		int[][] iArr2 = {{1,2,3},{4,5,6,7,8,9},{10,11,12,13}};
		
		for(int i = 0; i < iArr2.length; i++) {
			for(int j = 0; j < iArr2[i].length; j++) {
				System.out.printf("%2d ", iArr2[i][j]);
			}
			System.out.println();
//				 1  2  3 
//				 4  5  6  7  8  9 
//				10 11 12 13 
		}
	}
}
