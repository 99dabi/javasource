package ch10;

public class AccountEx {

	public static void main(String[] args) {
		//Cannot instantiate the type Account
		//Account account = new Account();=>안되기 때문에 
		//구현 클래스를 만드는데  자주사용하는것도 아니고 비효울적이라 
		//임시로 만들어 사용하는 방법 =>익명구현
		
		Account account = new CheckingAccount();
		CheckingAccount checking = new CheckingAccount();
		
		//익명구현 : 클래스 이름이 없기 때문에
		Account account2 = new Account() {
			
			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("TEST");
			}
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("print");
			}
		};
		account2.test();
		account2.print();
	}

}
