package ch5;

public class Card {
	//속성 - 숫자,종류(다이아몬드,스페이드,클로버,하트),너비
	//필드(인스턴스 필드,프로퍼티,멤버변수)
	int number;
	String kind;
	
	//정적필드
	static int width=100;
	static int height=100;
	
	public Card(int number, String kind) {
		super();
		this.number = number;
		this.kind = kind;		
	}	
}
