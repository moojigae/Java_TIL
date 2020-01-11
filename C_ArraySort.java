package com.kh.example.array;

import java.util.Arrays;

public class C_ArraySort {
	// ���Ŀ��� �Ӹ� �ƴ϶� ���� ��ġ �ٲ� �� ��� ��
	public void method1() {
		// ������ �� �� �����ϱ�
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 : " + num1);	// num1 : 10
		System.out.println("num2 : " + num2);	// num2 : 20
		
//		num1 = num2;
//		num2 = num1;
		
//		num1 : 20
//		num2 : 20
		
		int temp; // �ӽ÷� ���� ������ ���� ����
		temp = num1; // temp : 10
		num1 = num2; // num1 : 20
		num2 = temp; // num2 : 10
		
		System.out.println("num1 : " + num1);	// num1 : 20
		System.out.println("num2 : " + num2);	// num2 : 10
		
		int[] arr = {2,1,3};
		int temp2;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");	// 2 1 3 
		}
		
		temp2 = arr[0];
		arr[0] = arr[1];
		arr[1] = temp2;
	
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");	// 1 2 3
		}
	
	}	
	public void method2() {
		int[] iArr = {2,5,4,6,1,3};
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");	// 2 5 4 6 1 3 
		}
		System.out.println(); 
		
		Arrays.sort(iArr);
		
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " "); // 1 2 3 4 5 6 
		}
		
	}
}

