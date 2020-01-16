package com.kh.example.chap00.file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method1() {
		
		try {
		File f1 = new File("test.txt");
		f1.createNewFile(); // �������� ����
		
		File f2 = new File("c:/test/test.txt");
		f2.createNewFile(); // ���ϸ� ������ִ� �޼ҵ�� ���� ������ ����� ���� ����/ test ������ ������ ���� 
		
		File f3 = new File("c:\\temp3\\temp2");
		File f4 = new File("c:\\temp3\\temp2\\test.txt");
//		f4.createNewFile(); ���丮�� ���� ��Ȳ���� ���� ������ ��θ� ã�� �� �����ϴ� ���� �߻�
		f3.mkdirs(); // ���ο� ���丮 ����
		f4.createNewFile();
		f4.delete();	// ���� �Ǵ� ���丮 �ϳ� ����
//		f3.delete();
		
		System.out.println(f2.exists()); // true	�����̳� ������ �����ϴ��� Ȯ���ϴ� �޼ҵ� exists() 
		System.out.println(f3.exists()); // true
		System.out.println(f3.isFile()); // false	�������� ���� Ȯ���ϴ� �޼ҵ� isFile()
		
//		�� �� �޼ҵ�
		System.out.println("���� ��: " + f1.getName());	// ���� ��: test.txt
		System.out.println("���� ���� ��� : " + f1.getAbsolutePath());	// ���� ���� ��� : D:\1_java_workspace\13_IO\test.txt
//		���� ��� : �����ϰ� ������ �ִ� ���
		System.out.println("���� ��� ��� : " + f1.getPath());	// ���� ��� ��� : test.txt
		System.out.println("���� �뷮 : " + f1.length());	// ���� �뷮 : 14
		System.out.println("���� �뷮 : " + f2.length());	// ���� �뷮 : 0
		System.out.println("f1 ���� ���� : " + f1.getParent());	// f1 ���� ���� : null
		System.out.println("f4 ���� ���� : " + f4.getParent()); // f4 ���� ���� : c:\temp3\temp2
		
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
