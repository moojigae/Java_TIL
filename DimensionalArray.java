package com.kh.example.dimension;

public class DimensionalArray {
	public void method1() {
		//  2차원 배열의 선언	: Stack	영역에 공간 생성됨
		//	자료형[][] 배열명;
		//	자료형 배열명[][];
		// 	자료형[] 배열명[];
		
		int[][] iArr1;
		int iArr2[][];
		int[] iArr3[];
		
		//  2차원 배열의 할당
		//	자료형[][] 배열명 = new 자료형[행크기][열크기];
		// 	자료형 배열명[][] = new 자료형[행크기][열크기];
		//  자료형[] 배열명[] = new 자료형[행크기][열크기];
		
		// 가변배열 : 행의 크기는 정해져 있으나 열의 크기는 정해져 있지 않음
		iArr1 = new int[3][5]; // 정변배열: 행과 열의 크기가 고정적인 배열
	}
	
	public void method2() {
		// int형의 iArr이라는 이름의 3행 5열짜리 배열 생성
		int[][] iArr = new int[3][5];
		
		// 값 기록
		// 1. 배열 인덱스에 접근하여 값 기록
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
		
		// 2. 이중 for문을 이용하여 값 기록
		System.out.println("iArr.length : " + iArr.length); // 3
//		iArr.length는 Stack 영역의 iArr을 찾고 iArr은 Heap의 주소지를 담고 있음 
//		그 주소는 행의 주소지이기 때문에 행 크기가 출력 됨
		System.out.println("iArr[0].length : " + iArr[0].length); // 5
		
		int value = 1; // 배열 안에 값을 넣어 주는 역할
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
		//  가변 배열
		//	행 크기는 정해져 있으나 각 행에 대한 열 크기가 정해져 있지 않은 상태
		// 	자료형이 같은 1차원 배열 여러개를 하나로 묶은 것이 2차원 배열이기 때문에
		// 	묶여 있는 1차원 배열의 길이가 꼭 같을 필요는 없음
		
		int[][] iArr = new int[3][]; // 가변 배열 할당
		iArr[0] = new int[2];
		iArr[1] = new int[1];
		iArr[2] = new int[3];	// 1차원 배열 만들기
		
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%2d ", iArr[i][j]);
			}
			System.out.println();
//				 0  0 
//				 0 
//				 0  0  0 
		}
		
		// 값 기록
		// 1. 인덱스 이용
		iArr[0][0] = 1;
		iArr[0][1] = 2;
		
		iArr[1][0] = 3;
		
		iArr[2][0] = 4;
		iArr[2][1] = 5;
		iArr[2][2] = 6;
		
		// 2. 이중 for문 이용
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
		// 다차원 배열의 할당과 초기화 동시에 가능
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
