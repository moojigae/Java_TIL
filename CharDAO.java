package com.kh.example.chap01_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileSave() {
		try(FileWriter fw = new FileWriter("B_char.txt")) {
//			���� ����� ��Ʈ���� try() �ȿ� �־ �ڵ����� close ó��
//			���� ��Ʈ���� �� �� �����ڷ� ';' ��
			fw.write("��, IO ���� ��մ�!!");
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
//		�� ,   I O   �� ��   �� �� �� ! ! A   a p p l e 
		}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch(IOException e) {
			e.printStackTrace();
		} 
	}
}
