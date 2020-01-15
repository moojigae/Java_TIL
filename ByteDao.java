package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDao {
	public void fileOpen() {
		try {
			FileInputStream fis = new FileInputStream("a_byte.txt");
//			a_byte.txt ������ ������� ��ü ����
					
//			������ ���� �����
//			while(fis.read() != -1) {	// 
//			read() �޼ҵ�� �� �̻� �о���� ���� ������ -1�� ��ȯ �׷��� ���ǽĿ� -1�� �ƴϸ��� ���� 
//				System.out.print((char)fis.read() + " ");
//			}
//			���� while���� �������� ���� fis.read()���� ó�� ���� �а� while�� ������ ����
//			while�� �ȿ��� �� �������� �ǹǷ� b�� ���� �ٽ� while������ �ö󰡰� while���� c�� �а� 
//			������ ���� d�� ���� ���� �۾��� �ݺ��ϹǷ� ���ϴ� ���� ����� �ȵ�
			
			int value; // ���ǽĿ��� �� �� ���� ��� ���� ����
			while((value = fis.read()) != -1) {
				System.out.print((char)value + " ");
			}
//		catch���� ������ �� �� �ְ� �� ���� ������ ����� �θ� ������ �� ������ �ۼ��ؾ� ��. Exception�ϳ��� ���� �� ���� ���� ����
		} catch(FileNotFoundException e) {		 
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void fileSave() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("a_byte.txt");
//			���� ����Ἥ a_byte.txt�� ��� ���� abcdefgcde�θ� ���� 
//			fos = new FileOutputStream("a_byte.txt",true); �Ű����� �ڿ� true�� ����
//			a_byte.txt�� ��� ���� abcdefgcdeabcdefgcdeabcdefgcde �̾� ������ ���� 
			
//			write(int b):void
			fos.write(97);		// a
			
//			write(byte[] b):void
			byte[] bArr = {98,99,100,101,102,103};	// b c d e f g
			
			fos.write(bArr);
			
//			write(byte[] b, int off, int len):void
			fos.write(bArr, 1, 3);
//			1 index���� 3�� :cde
			
		}  catch(FileNotFoundException e) {
			e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fos.close();		// ��Ʈ�� �ݱ�
//				IOException �߻� �����ϰ� ��Ʈ���� ������ �ݾ���� �ϱ� ������ ���� try������ ���� �� ����
//				fos.write(97);���� ������ �߻��ϸ� �ؿ� �ڵ�� ������ �ȵǱ� ������ ������ �߻��ص� ������
//				�ݾ��ֱ� ���� finally�� �־��ְ� ������ �߻��� �� �ִ� fos.close(); �ڵ�� finally �ȿ��� ó��  
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}














