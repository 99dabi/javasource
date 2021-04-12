package ch6;

public class Account2 {
	//은행계좌 클래스
	//속성 - 계좌번호(210-25-12536),이름(홍길동),잔액(1000000)

	private int balance;
	final static int MIN_BALANCE=0;
	final static int MAX_BALANCE=1000000;
	
	public int getBalance() {
		return balance;
	}

//	public void setBalance(int balance) {
//		if(balance<MIN_BALANCE||balance>MAX_BALANCE)
//			return ;
//		this.balance = balance;
//	}
//	
	public void setBalance(int balance) {
		if(balance>=MIN_BALANCE&&balance<MAX_BALANCE)
			this.balance = balance;
		return ;
		
	}
	
	//setter와 getter를 작성하기
	//0 <=balance<=1000000범위의 값만 가짐
	//0과 1000000은 MIN_BALANCE와 MAX_BALANCE상수를 선언해서 이용		
	//setter의 매개값이 음수이거나 백만원을 초과하면 현재 balance값을 유지
	
	
}













