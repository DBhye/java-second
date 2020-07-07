package BlackJack;

public class GameTest {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
		
		for(int i=0; i<2; i++) {
			dealer.receiveCard(cd.getCard());
			gamer.receiveCard(cd.getCard());
		}
		dealer.moreCards(cd);
		
		gamer.moreCards(cd);
		//내가가진 카드의 종류를 보여주고
		//카드 더받을지? 카드 받고싶을 때 까지
		//누가이긴지 보여줌
		Rule.whoIsWin(gamer, dealer);
	}

}
