package ch6;

public class AccountEx {

	public static void main(String[] args) {
		// Account2 객체 생성 - 기본 생성자로 
		Account2 acc = new Account2();
		
		// 잔액을 변경하는 setBalance를 이용해 잔액 변경하기 => 10000
		acc.setBalance(10000);
		
		//현재 잔고 출력하기 : getBalance()이용
		System.out.println("현재 잔고 : "+acc.getBalance());
		//setBalance 를 이용해 잔액 변경하기 =>-100으로
		//현재 잔고출력
		acc.setBalance(-200);
		System.out.println("현재 잔고 : "+acc.getBalance());
		//setBalance를 이용해 잔액 변경 =>2000000
		//현재 잔고출력
		acc.setBalance(2000000);
		System.out.println("현재 잔고 : "+acc.getBalance());
		//setBalance를 이용해 잔액 변경 =>30000
		//현재 잔고출력
		acc.setBalance(300000);
		System.out.println("현재 잔고 : "+acc.getBalance());
	}

}
