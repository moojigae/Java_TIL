package kh.model.vo;

//TCP 소켓을 사용하여 클라이언트에서 서버로 파일을 업로드 처리하는 네트워크 프로그램을 구현하려고 한다. 사용되는 Book 클래스를 [원인](10점)에 기술하고, 파일의 데이터로 읽어서 서버로 전송하는 코드를 [조치내용](30점)에 작성하시오. (40점)
//[클라이언트용 프로그래밍 실행 순서]
//[원인]title 과 price 필드를 선언한다
//- 기본생성자와 매개변수 있는 생성자를 작성한다.
//- 필드에 대한 getter 와 setter 작성한다.
//- toString() 메소드를 오버라이딩하여 인스턴스변수의 값에 대한 문장을 작성하여 리턴한다.

//[조치내용] : fileUpload() 메소드를 작성하시오. : public void fileUpload(){}
//- Socket 객체 생성으로 서버와 연결한다. (서버 IP : 192.168.20.34, 포트번호 : 3000)
//- books.dat 파일의 내용을 ObjectInputStream 으로 읽어서 서버로 전송한다.
//- 파일 읽기가 완료되면, 서버로 null 을 보낸다.
//- 서버로 부터 "exit" 메세지를 받고 나면 소켓 닫는다. : kh.model.vo.Book 클래스를 캡슐화(EnCapsulation) 원칙에 맞춰서 구현하시오.
//- 직렬화 선언한다.

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;

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
		return title + " 책은 " + price + "입니다.";
	}
	
	public void fileUpload() {
		try {
			Socket socket = new Socket("192.168.20.34",3000);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"));
			// 파일에서 객체를 받아올 스트림
			
			InputStream input = socket.getInputStream();
			// 서버에서 보낸 메세지를 받아올  스트림
			OutputStream output = socket.getOutputStream();
			// 서버에 객체를 보낼 스트림
			
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			// 성능향상 위한 보조스트림
			ObjectOutputStream oos = new ObjectOutputStream(output);
			
			try {
				while(true) {
					Book b = (Book)ois.readObject(); // 파일에서 객체 가져오는 코드
					oos.writeObject(b); // 가져온 객체를 서버로 보내는 코드
				}
			} catch(EOFException e) {
				oos.writeObject(null);
				while(true) {
					String message = br.readLine(); // 서버에서 메세지를 가져오고 그 메세지를 message 에 저장
					if(message.equals("exit")) { // 만약 그 메세지가 exit 이면
						br.close();
						oos.close();
						ois.close();
						socket.close(); // 닫아줌
						break; // 반복 빠져나옴
					}
				}
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}