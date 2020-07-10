package com.koreait.second.cafe;

public class Cafe {
	public static void main(String[] args) {
		//MenuItem mi= new MenuItem("아메리카노",1500);
		//MenuItem mi2= new MenuItem("카푸치노",2000);
		//System.out.println(mi);
		//System.out.println(mi2);
		
		
		//Menu menu = new Menu();
		//menu.showMenus();
		
		//MenuItem mi = menu.choose(0);
		//System.out.println(mi);
		
		Customer cus = new Customer();
		Menu menu = new Menu();
		Barista bas = new Barista();
		
		//MenuItem mi = cus.order(menu);
		//System.out.println(mi);
		
		
		MenuItem choiceMenu = cus.order(menu);
		Coffee coffee = bas.makeCoffee(choiceMenu);
		//주문받은 메뉴 확인
		//만들어서 리턴
		
		cus.drinkCoffee(coffee);
		
	}
}
