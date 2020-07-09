package com.koreait.second.cafe;

public class MenuItem {
	private String name; //값 저장, 속성
	private int price;	//생성자, 메소드통해서 값넣기
	//생성자가 메소드와 구별되는 점 : 반환타입 x, 이름이 클래스와 같다.
	public MenuItem(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	} //this로 안쓰면 메소드안의 지역변수로만 존재한다.
	
	//생성자가있으므로 기본생성자는 없어진다.
	public String getName() {
		
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		 return String.format("메뉴 이름: %s\n 가격: %d",name,price);
	}
}
