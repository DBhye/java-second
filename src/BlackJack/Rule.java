package BlackJack;

public class Rule {
	public static void whoIsWin(Gamer gamer, Dealer dealer) {
		/*
		int sum = gamer.getTotalPoint();
		int sum2 = dealer.getTotalPoint();
		if (sum > sum2) {
			System.out.println("게이머 승리!");

		} else if (sum2 > sum) {
			System.out.println("딜러 승리!");
		}*/
		System.out.println("~딜러카드~");
		dealer.openCard();
		System.out.println("~게이머카드~");
		gamer.openCard();
		
		int lastPoint = 21;
		int gPoint = gamer.getTotalPoint();
		int dPoint = dealer.getTotalPoint();
		// 게이머 점수 == 딜러점수 또는 (게이머점수 > 21 and 딜러 점수 > 21)
		if(gPoint == dPoint || (gPoint > lastPoint && dPoint > lastPoint)) {
			System.out.println("비겼음");
			//(게이머점수<=21 and 게이머점수>딜러점수) 또는 딜러점수>21
		} else if ((gPoint <= lastPoint && gPoint > dPoint) || dPoint > lastPoint) {
			System.out.println("게이머 승");
			//그 외는
		}else {
			System.out.println("딜러 승");
		}
	}
}
