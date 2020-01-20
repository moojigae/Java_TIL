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
	
//	�ּҰ����� ���ϸ� ���� �ߺ����� ���� ������ �����ϱ� ���� hashcode�� equals�� ����Ͽ� �ȿ� ��ü�� �������� ���� ���ϱ� ���� ������
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
		// �̸��� ���� ��������
		String other = o.getName();
		return name.compareTo(other);
	}
	
//	@Override
//	public int compareTo(Object o) {		// ���׸��� ������� ������ Comparable�� ����� �߻��ϰ� Object Ÿ������ �����Ǿ� ����
//		
//	}
}
