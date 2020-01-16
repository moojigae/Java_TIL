package com.kh.example.chap01_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileSave() {
		try(FileWriter fw = new FileWriter("B_char.txt")) {
//			내가 사용한 스트림을 try() 안에 넣어서 자동으로 close 처리
//			여러 스트림이 들어갈 때 구분자로 ';' 들어감
			fw.write("와, IO 정말 재밌다!!");
			fw.write('A');
			fw.write(' ');
			char[] cArr = {'a','p','p','l','e'};
			fw.write(cArr);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		
		try(FileReader fr = new FileReader("B_char.txt");) {
		int value;
		while((value = fr.read()) != -1) {
			System.out.print((char)value + " ");
//		와 ,   I O   정 말   재 밌 다 ! ! A   a p p l e 
		}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch(IOException e) {
			e.printStackTrace();
		} 
	}
}
