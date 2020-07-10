package com.koreait.second.cafe;

import java.util.Scanner;

public class Customer {

	public MenuItem order (Menu menu) {
		menu.showMenus();
		Scanner scan = new Scanner(System.in);
		MenuItem mi = null;

		while (mi == null) {
			try {

				System.out.println("원하는메뉴?");
				String menuNo = scan.nextLine();
				int intMenuNo = Integer.parseInt(menuNo);
				mi = menu.choose(intMenuNo - 1);
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요");

			} catch (Exception e) {
				System.out.println("메뉴를 잘 못 선택하셨습니다.");
			}

		}
		scan.close();
		return mi;
	}
	
	public void drinkCoffee (Coffee coffee) {
		
		String name = coffee.getName();
		
		System.out.printf("%s를 마십니다.",name);
	}
}
