package ch11;

public class Account {
	private long balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance+=money;
	}
	public void withdraw(int money) throws Exception {
		if(balance<money) {//실행시키면안됨
			//1번 return ;
			//2번 System.out.println("잔액이 부족함");
			//3번
			//throw new Exception("잔고 부족"+(money-balance)+"부족함");
			throw new BalanceInsufficientException("잔고 부족"+(money-balance)+"부족함");
					
		}balance-=money;
	}
}
