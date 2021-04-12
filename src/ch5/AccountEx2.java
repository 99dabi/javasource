package ch5;

public class AccountEx2 {
	public static void main(String[] args) {
		Account account = 
				new Account("120-31-5689", "홍길동", 100000);		
		//입금한다.
		account.deposit(50000);	
		
		AccountEx2 obj = new AccountEx2();
		obj.accountPrint(account);
		//출금한다.
		account.withdraw(30000);
		obj.accountPrint(account);
		
		Account account2 = 
				new Account("120-31-5799", "성춘향", 200000);		
		//입금한다.
		account2.deposit(50000);	
		obj.accountPrint(account2);
		//출금한다.
		account2.withdraw(30000);
		obj.accountPrint(account2);
	}
	void accountPrint(Account obj) {		//잔액확인
		System.out.println(obj.name+ " 잔액 확인 : "+obj.balance);		
	}
}







