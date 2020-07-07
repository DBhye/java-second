package BlackJack;

import java.util.Arrays;
import java.util.List;

public class Game {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		//System.out.println(cd);
		Card c = cd.getCard(); // 랜덤한 카드를 1장 리턴 and 카드덱에서 삭제

		// Gamer.receiveCard //클래스명.메소드는 스태틱 메소드이다.(클래스메소드라고도 한다.)

		Gamer gamer = new Gamer();// 변수타입은 주솟값을 가리킬 수 있냐없냐만 결정한다!! (상속을 떠올리자)
		Card card = cd.getCard(); //카드를 뽑고 카드덱에서 삭제.
		gamer.receiveCard(card);

		//gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());

		gamer.openCard(); // =이 없으면 보이드형 (반환타입 없음)
		Dealer dealer = new Dealer();
		dealer.moreCards(cd);
		
		//static으로 만들면 메소드가 실행시에 미리 메모리에 할당된다 (객체 생성없이도 사용가능)
		//대문자라서 whoIswin에 static 붙이기
		Rule.whoIsWin(gamer,dealer);
		//비겼는지 누가 이겼는지 결과를 나타남!
	}
}