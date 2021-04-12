package ch7;

public class CheckingTrafficCardAccountEx extends CheckingAccount {
	//교통카드 기능 여부
	private boolean hasTrafficCard;
	
	public CheckingTrafficCardAccountEx
	(String ano, String owner, int balance, String cardNo,boolean hasTrafficCard) {
		super(ano, owner, balance, cardNo);
		this.hasTrafficCard=hasTrafficCard;
		
	}
	//교통비 지불 - 교통카드 기능이 있다면
	//교통카드 기능 확인- 기능이 있다면 (카드번호, 잔액 확인 후 - > 교통비 지출)
	int payTrafficCard(String cardNo, int amount) {
		if(!hasTrafficCard) {
			System.out.println("교통카드 기능이 없습니다.");
			return 0;
		}
		//checkingaccount에서 pay기능 가져옴
		return pay(cardNo,amount);
	}
}
