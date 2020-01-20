package com.kh.example.set.model.vo;

public class Dog implements Comparable<Dog> {
	private String name;
	private double weight;
	
	public Dog() {}
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "(" +weight +"kg)";
	}
	
//	주소값으로 비교하면 값이 중복으로 들어가기 때문에 방지하기 위해 hashcode와 equals를 사용하여 안에 객체로 동일한지 여부 비교하기 위한 재정의
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int)weight;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		Dog Other = (Dog)obj;
		if(name == null) {
			if(Other.name != null) {
				return false;
			} else if(!name.equals(Other.name)) {
				return false;
			}
		}
		if(weight != Other.weight) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Dog o) {
		// 이름에 대한 오름차순
		String other = o.getName();
		return name.compareTo(other);
	}
	
//	@Override
//	public int compareTo(Object o) {		// 제네릭을 사용하지 않으면 Comparable에 노란줄 발생하고 Object 타입으로 지정되어 있음
//		
//	}
}
