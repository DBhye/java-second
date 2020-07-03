package BlackJack;

import java.util.Arrays;
import java.util.List;

public class Game {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		System.out.println(cd);

		Card c= cd.getCard(); //랜덤한 카드를 1장 리턴 and 카드덱에서 삭제
	}
	
}
