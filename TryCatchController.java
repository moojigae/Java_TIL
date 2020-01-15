package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1() ȣ�� ��...");
		try {
			method2();
			System.out.println("���� �߻� �ÿ� ��µɱ�? method2���� ���� �߻��ϴϱ� catch�� �Ѿ�� ��� �ȵ� ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.out.println(e.getMessage()); // IOException�� ������ �߻����׽��ϴ� / e.getMessage() �޼����� �ѱ�� ���� ��
		} catch(Exception e) {
			System.out.println("Exception���� ����");
		} finally {
			System.out.println("���� �߻� ���ο� ��� ���� ������ �����");
		}
		System.out.println("method1() ���� ��...");
	}
	
	public void method2() throws IOException {
		System.out.println("method2() ȣ�� ��...");
		method3();
		System.out.println("method2() ���� ��...");	// ���� �ȵ�
	}
	
	public void method3() throws IOException {
		System.out.println("method3() ȣ�� ��...");
		throw new IOException("IOException�� ������ �߻����׽��ϴ�"); // �߻��� �� �̷��� �޼����� �ѱ�ڴٶ�°� �Ű����� �ȿ� ����
//		System.out.println("method3() ���� ��..."); 	���� �ȵǴ� �ڵ�
	}
}
