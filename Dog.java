package com.kh.example.animal.mode.vo;

public class Dog extends Animal {
// - name : String
// - age : int
//	- weight : double
//	- height : double
//	- hair : String
	
//	+ Dog()
//	+ Dog(name:String, age:int, weight:double, height:double,hair:Stirng)
	
//	+getter/setter
//	+inform():String
//		반환 형식 ㅣ 이름 나이 몸무게 키
	
//	private String name;
//	private int age;			// 해당 3줄 Animal 상속으로 인해 삭제
//	private double weight;		
	private double height;
	private String hair;
	
	public Dog() {}
	public Dog(String name, int age, double weight, double height, String hair) {
//		this.name = name;
//		this.age = age;						// 상속으로 인해 삭제
//		this.weight = weight;
		super(name,age,weight); // 부모에게 상속 받은 필드 부르기
		this.height = height;
		this.hair = hair;
	}
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {			// 상속으로 인해 삭제
//		this.age = age;
//	}
//	public double getWeight() {
//		return weight;
//	}
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getHair() {
		return hair;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
//	public String inform() {
//		return super.getName() + " " + super.getAge() + " " + super.getWeight() + " " + height + " " + hair;
//		return super.inform() + " " + height + " " + hair; 			// 부모 inform에 name+age+weight값이 있으므로 위에 코드보다 양을 줄일 수 있음
//	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString() + " " + height + " " + hair; 	// super.toString()을 통해 Animal의 대표값과 Dog에서 만든 필드 값 출력 
		}
}
