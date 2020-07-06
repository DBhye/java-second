package BlackJack;

import java.util.Arrays;
import java.util.List;

public class Game {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		System.out.println(cd);
		Card c= cd.getCard(); //랜덤한 카드를 1장 리턴 and 카드덱에서 삭제
		
							
		
		//Gamer.receiveCard //클래스명.메소드는 스태틱 메소드이다.(클래스메소드라고도 한다.)
		
		Gamer gamer = new Gamer();//변수타입은 주솟값을 가리킬 수 있냐없냐만 결정한다!! (상속을 떠올리자)
		Card card = cd.getCard();
		gamer.receiveCard(card);
		
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		
		
		gamer.openCard();  //=이 없으면 보이드형 (반환타입 없음)
	}
	
}
