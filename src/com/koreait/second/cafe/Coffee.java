package com.koreait.second.cafe;

public class Coffee {
	private String name;
	private int price;
	
	public Coffee(MenuItem item) {
		name = item.getName();
		price = item.getPrice();
	}
}
