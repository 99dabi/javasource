package ch2;

public class ConditionalOperEx2 {
	public static void main(String[] args) {
		int score = 85;
		
		char grade=(score>90)?'A':((score>80)?'B':'C');
		System.out.println("등급 : "+grade);		
		//삼항연산자를 중첩으로 사용할꺼면 if사용해라
	}
}
