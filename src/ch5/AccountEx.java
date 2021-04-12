package ch5;

public class AccountEx {
	public static void main(String[] args) {
		Account account = 
				new Account("120-31-5689", "홍길동", 100000);
		
		
		//입금한다.
		account.deposit(50000);		
		//잔액확인
		System.out.println("잔액 확인 : "+account.balance);
		
		//출금한다.
		//System.out.println("잔액 확인 : "+account.withdraw(30000));
				
		int balance=account.withdraw(30000);
		System.out.println("잔액 확인 : "+balance);		
	}
}







