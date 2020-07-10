package com.koreait.second.cafe;

public class Coffee {
	private String name;
	private int price;
	
	public Coffee(MenuItem item) {
		name = item.getName();
		price = item.getPrice();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
