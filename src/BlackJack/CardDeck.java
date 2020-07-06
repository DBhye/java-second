package BlackJack;

import java.util.List;
import java.util.ArrayList;

public class CardDeck {
	private List<Card> arr = new ArrayList();

	// <Card> 객체 주솟값만 나온다.

	public CardDeck() {
		init();
		
	}

	private void init() {
		
		for (int i = 0; i < Card.PATTERNS.length; i++) {
			for (int z = 1; z < 13; z++) {
				//arr.add(new Card(Card.PATTERNS[i], getDeno(z)));
				String pattern = Card.PATTERNS[i];
				String deno = getDeno(z);
				int point = getPoint(z);
					
				Card c = new Card(pattern, deno, point);
				arr.add(c);
			}
		}
	}
	private int getPoint(int num) {
		return num > 10 ? 10 : num;
	}
	
	private String getDeno(int num) {
		switch (num) {
		case 1:
			return "A";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		default:
			return String.valueOf(num);
		}
	}

	@Override
	public String toString() {
		String str = "";
		for (Card c : arr) {
			str += (c + "\n");
		}
		return str;
	}
/*
	public Card getCard() {
			int i = (int) (Math.random() * 4 + 1);
		
			int z = (int) (Math.random() * 13 + 1);
				
		return new Card(Card.PATTERNS[i], getDeno(z));
			
				
		}*/
	
	public Card getCard() {
		int rIdx = (int)(Math.random() * arr.size());
		return arr.remove(rIdx);
	}
}

/*
 * for(int i=0; i<Card.PATTERN.length; i++) { for(int z=1; z<=13; z++) {
 * arr.add(new Card(Card.PATTERN[i], getDeno(z))); String pattern =
 * Card.PATTERNS[i]; String deno = getDeno(z); Card c = new Card(pattern,deno);
 * arr.add(c);
 */
