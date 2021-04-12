package ch7;

public class CreditLineAccount extends Account {
	private int creditLine;//마이너스 한도 필드

	public CreditLineAccount(String ano, String owner, int balance,int creditLine) {
		super(ano,owner,balance);
		this.creditLine = creditLine;
	}

	public int getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}
	//출금하다 = > 잔액 +마이너스한도(천만원)-출금액
	//부모의 withdrar =>재정의 (오버라이딩)
	
	@Override
	int withdraw(int amount) {//출금 재정의
		if(super.getBalance()+creditLine < amount) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		super.setBalance(super.getBalance()-amount);
		return super.getBalance();
	}
	
	
	
}
