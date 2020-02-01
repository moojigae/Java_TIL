package kh.model.vo;

//TCP ������ ����Ͽ� Ŭ���̾�Ʈ���� ������ ������ ���ε� ó���ϴ� ��Ʈ��ũ ���α׷��� �����Ϸ��� �Ѵ�. ���Ǵ� Book Ŭ������ [����](10��)�� ����ϰ�, ������ �����ͷ� �о ������ �����ϴ� �ڵ带 [��ġ����](30��)�� �ۼ��Ͻÿ�. (40��)
//[Ŭ���̾�Ʈ�� ���α׷��� ���� ����]
//[����]title �� price �ʵ带 �����Ѵ�
//- �⺻�����ڿ� �Ű����� �ִ� �����ڸ� �ۼ��Ѵ�.
//- �ʵ忡 ���� getter �� setter �ۼ��Ѵ�.
//- toString() �޼ҵ带 �������̵��Ͽ� �ν��Ͻ������� ���� ���� ������ �ۼ��Ͽ� �����Ѵ�.

//[��ġ����] : fileUpload() �޼ҵ带 �ۼ��Ͻÿ�. : public void fileUpload(){}
//- Socket ��ü �������� ������ �����Ѵ�. (���� IP : 192.168.20.34, ��Ʈ��ȣ : 3000)
//- books.dat ������ ������ ObjectInputStream ���� �о ������ �����Ѵ�.
//- ���� �бⰡ �Ϸ�Ǹ�, ������ null �� ������.
//- ������ ���� "exit" �޼����� �ް� ���� ���� �ݴ´�. : kh.model.vo.Book Ŭ������ ĸ��ȭ(EnCapsulation) ��Ģ�� ���缭 �����Ͻÿ�.
//- ����ȭ �����Ѵ�.

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;

public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String title;
	private int price;
	
	public Book() {}
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return title + " å�� " + price + "�Դϴ�.";
	}
	
	public void fileUpload() {
		try {
			Socket socket = new Socket("192.168.20.34",3000);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"));
			// ���Ͽ��� ��ü�� �޾ƿ� ��Ʈ��
			
			InputStream input = socket.getInputStream();
			// �������� ���� �޼����� �޾ƿ�  ��Ʈ��
			OutputStream output = socket.getOutputStream();
			// ������ ��ü�� ���� ��Ʈ��
			
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			// ������� ���� ������Ʈ��
			ObjectOutputStream oos = new ObjectOutputStream(output);
			
			try {
				while(true) {
					Book b = (Book)ois.readObject(); // ���Ͽ��� ��ü �������� �ڵ�
					oos.writeObject(b); // ������ ��ü�� ������ ������ �ڵ�
				}
			} catch(EOFException e) {
				oos.writeObject(null);
				while(true) {
					String message = br.readLine(); // �������� �޼����� �������� �� �޼����� message �� ����
					if(message.equals("exit")) { // ���� �� �޼����� exit �̸�
						br.close();
						oos.close();
						ois.close();
						socket.close(); // �ݾ���
						break; // �ݺ� ��������
					}
				}
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("�ڹٸ� ��ƶ�",30000));
		bookList.add(new Book("�ڹٸ� ��",25000));
		bookList.add(new Book("�ڹٸ� ���",35000));
		bookList.add(new Book("�ڹٸ�",20000));
		for(Book b : bookList) {
			System.out.println(b);
		}
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"));){
			
			for(Book b : bookList) {
				oos.writeObject(b);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void fileOpen() {
		try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("books.dat"));){
			ArrayList<Book> bookList = new ArrayList<Book>();
			while(true) {
				try {
					Book b = (Book)oos.readObject();
					bookList.add(b);
				} catch (EOFException e) {
					for(Book b : bookList) {
						System.out.println(b);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}