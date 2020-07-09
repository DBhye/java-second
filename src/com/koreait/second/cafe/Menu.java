package com.koreait.second.cafe;

import java.util.List;


import java.util.ArrayList;

public class Menu {
	private List<MenuItem> arr = new ArrayList();
	
	public Menu() {
		arr.add(new MenuItem("아메리카노",1500));
		arr.add(new MenuItem("카푸치노",2000));
		arr.add(new MenuItem("카라멜 마끼아또",2500));
		arr.add(new MenuItem("에스프레소",2000));
		
	}
	
	public void printMenu() {
		for(MenuItem c : arr) {
			System.out.println(c);
						
		}
	}
	
	public void showMenus() {
		System.out.println(" Menu ");
		for(int i=0; i<arr.size(); i++) {
			MenuItem m = arr.get(i); // arr[i];
			System.out.printf("%d. %s %,d원\n", i+1, m.getName(), m.getPrice());
		}
	}
	
	
	
	public MenuItem choose(int i) {
		
		return arr.get(i);
	}     
}
