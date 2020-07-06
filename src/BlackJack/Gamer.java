package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
	//private List<Card> arr = new ArrayList(); 
	//리시브 카드가 여러번 호출되어도 값이 모두 저장되도록 리스트로 전역변수 선언함.
	private List<Card> arr;
	
	public Gamer() {
		arr= new ArrayList();
	}
	
	public void receiveCard(Card card) {
		arr.add(card);
	}
	
	public void openCard() {
		/*for(int i=0; i<arr.size(); i++) {
			
			System.out.println(arr.get(i));		
		}*/
		for(Card c : arr) {
			System.out.println(c);
		}
		System.out.printf("합계 : %d",getTotalPoint());
	}
	
	public int getTotalPoint() {
		int sum=0;
		for(Card c : arr) {
			sum+=c.getPoint();
		}
		return sum;
	}
}
