package BlackJack;

public class Dealer extends Gamer {
	
	
	public void moreCards(CardDeck cd) {
		//카드덱의 cd를 변수로 가져왔다(상속받았으므로 가능)
	
		int totalPoint = 17;
		while(getTotalPoint()<totalPoint) {
		receiveCard(cd.getCard());
		 //카드덱의 getCard를 public으로 만들었으므로 바로 사용할 수 있다.
		}
		
	}
	
}
