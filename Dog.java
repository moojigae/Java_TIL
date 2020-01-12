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
//		��ȯ ���� �� �̸� ���� ������ Ű
	
//	private String name;
//	private int age;			// �ش� 3�� Animal ������� ���� ����
//	private double weight;		
	private double height;
	private String hair;
	
	public Dog() {}
	public Dog(String name, int age, double weight, double height, String hair) {
//		this.name = name;
//		this.age = age;						// ������� ���� ����
//		this.weight = weight;
		super(name,age,weight); // �θ𿡰� ��� ���� �ʵ� �θ���
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
//	public void setAge(int age) {			// ������� ���� ����
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
//		return super.inform() + " " + height + " " + hair; 			// �θ� inform�� name+age+weight���� �����Ƿ� ���� �ڵ庸�� ���� ���� �� ����
//	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString() + " " + height + " " + hair; 	// super.toString()�� ���� Animal�� ��ǥ���� Dog���� ���� �ʵ� �� ��� 
		}
}
