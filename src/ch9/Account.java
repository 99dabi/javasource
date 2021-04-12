package ch9;

/*추상클래스(abstract class)
 * 클래스 : 설계도 
 * 추상 클래스 : 미완성 설계도(추상 메서드 포함)
 * 상속을 받는 하위 클래스에서 반드시 추상 메소드는 구현을 해야함
 * 객체 생성 불가능=> 생성자는 존재한다.
 * */
public abstract class Account {	
	String name;
	
	public Account() {
		System.out.println("Account 기본 생성자");
	}

	//이런 형태로 끝이 나야한다.
	//차이 1.키워드, 2.중괄호(구현부분)
	abstract void method1();//추상메소드(구현 부분이 없음)
	void method2() {};//일반 메소드
}
