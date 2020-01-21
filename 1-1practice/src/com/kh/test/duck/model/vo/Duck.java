package com.kh.test.duck.model.vo;

public abstract class Duck {
	private String name;
	private String kinds;
	
	protected Duck() {}
	protected Duck(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	public String getKinds() {
		return kinds;
	}
	
	@Override
	public String toString() {
//		toString ��ǥ�� ��ȯ
		return "���� " + kinds + "�̰�, �̸��� " + name + "�Դϴ�.";
	}
	
	public abstract void quack();	// �߻� �޼ҵ�
}
