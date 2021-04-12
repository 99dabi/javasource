package ch7;

public class CheckingAccountEx{

	public static void main(String[] args) {
		CheckingAccount obj = new CheckingAccount
				("111-11-11","홍길동",100000,"555-666");
		//예금하다
		obj.deposit(1000000);
		//잔액 확인
		System.out.println("잔액 확인 : "+obj.getBalance());//부모의 속성도 가져다 쓸 수 있다
		
		//체크카드 사용 => 카드번호, 
		
		//못빼개해야함
		obj.pay("444-333", 10000);
		
		//체크카드
		System.out.println("잔액 : "+obj.pay("555-666", 100000));
		
	}

}
