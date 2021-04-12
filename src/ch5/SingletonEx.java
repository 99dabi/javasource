package ch5;

public class SingletonEx {
	public static void main(String[] args) {
		// constructor Singleton() is not visible
		// 외부에서 new 연산자로 생성자 호출 불가
		// Singleton single = new Singleton();
		
		Account account1 = new Account();
		Account account2 = new Account();
		Account account3 = new Account();
		System.out.println(account1==account2?"account1==account2":"account1!=account2");
		System.out.println(account1==account3?"account1==account3":"account1!=account3");
		
		
		
		//Singleton 객체 사용=> new
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		Singleton single3 = Singleton.getInstance();
		Singleton single4 = Singleton.getInstance();
			
		
		System.out.println(single1==single2);
		System.out.println(single3==single4);
		System.out.println(single1==single3);
		System.out.println(single2==single4);

	}
}
