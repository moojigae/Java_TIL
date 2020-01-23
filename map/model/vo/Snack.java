package com.kh.example.map.model.vo;

public class Snack {
	private String flavor;
	private int price;

	public Snack() {
	}

	public Snack(String flavor, int price) {
		this.flavor = flavor;
		this.price = price;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return flavor + "[" + price + "¿ø]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}

		Snack Other = (Snack) obj;
		if (flavor == null) {
			if (Other.flavor != null) {
				return false;
			}
		} else if (!flavor.equals(Other.flavor)) {
			return false;
		}
		if (price != Other.price) {
			return false;
		}

		return true;
	}
}
