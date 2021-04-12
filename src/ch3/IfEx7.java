package ch3;

public class IfEx7 {

public static void main(String[] args) {
	// 중첩 if
	// 점수가 81점 이상~ 100이하 랜덤으로 
	// 0 <= Math.random()*20 < 20
	// 최소가 81이라
	// 0+81 <=Math.random()*20 < 20+81
	int score = (int)(Math.random()*20)+81;
	System.out.println("점수 : "+score);
	
	String grade;
	if(score>=90) {
		if(score>=95) {
			grade="A+";
		}else {
			grade="A";
		}
	}else {
		if(score>=85) {
			grade="B+";
		}else {
			grade="B";
		}
	}
	System.out.println("학점 : "+grade);
}
}
