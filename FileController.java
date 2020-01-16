package com.kh.example.chap00.file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method1() {
		
		try {
		File f1 = new File("test.txt");
		f1.createNewFile(); // 새로파일 생성
		
		File f2 = new File("c:/test/test.txt");
		f2.createNewFile(); // 파일만 만들어주는 메소드로 없는 폴더는 만들어 주지 않음/ test 폴더가 없으면 에러 
		
		File f3 = new File("c:\\temp3\\temp2");
		File f4 = new File("c:\\temp3\\temp2\\test.txt");
//		f4.createNewFile(); 디렉토리가 없는 상황에서 쓰면 지정된 경로를 찾을 수 없습니다 에러 발생
		f3.mkdirs(); // 새로운 디렉토리 생성
		f4.createNewFile();
		f4.delete();	// 파일 또는 디렉토리 하나 삭제
//		f3.delete();
		
		System.out.println(f2.exists()); // true	파일이나 폴더가 존재하는지 확인하는 메소드 exists() 
		System.out.println(f3.exists()); // true
		System.out.println(f3.isFile()); // false	파일인지 여부 확인하는 메소드 isFile()
		
//		그 외 메소드
		System.out.println("파일 명: " + f1.getName());	// 파일 명: test.txt
		System.out.println("저장 절대 경로 : " + f1.getAbsolutePath());	// 저장 절대 경로 : D:\1_java_workspace\13_IO\test.txt
//		절대 경로 : 고유하게 가지고 있는 경로
		System.out.println("저장 상대 경로 : " + f1.getPath());	// 저장 상대 경로 : test.txt
		System.out.println("파일 용량 : " + f1.length());	// 파일 용량 : 14
		System.out.println("파일 용량 : " + f2.length());	// 파일 용량 : 0
		System.out.println("f1 상위 폴더 : " + f1.getParent());	// f1 상위 폴더 : null
		System.out.println("f4 상위 폴더 : " + f4.getParent()); // f4 상위 폴더 : c:\temp3\temp2
		
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
