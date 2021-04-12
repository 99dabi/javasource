package ch3;
import java.util.Scanner;
public class IfEx5 {
	public static void main(String[] args) {
		//점수에 따라서 등급을 나누기
		//100~90 : A, 89~80 : B, 79~70 : C, 69~60 : D, 나머지 F
		//다중조건식 : if~else
		Scanner sc= new Scanner(System.in);
		System.out.println("당신의 점수는?");
		
		int score=sc.nextInt();
		char grade=' ';//전체 블록 밖에서 선언
		
		if(score>=90) {
			System.out.println("점수가 100~90");
			grade='A';
		}else if(score>=80) {
			System.out.println("점수가 89~80");
			grade='B';
		}else if(score>=70) {
			System.out.println("점수가 79~70");
			grade='C';
		}else if(score>=60) {
			System.out.println("점수가 69~60");
			grade='D';
		}else {
			System.out.println("점수가 60미만입니다.");
			grade='F';
		}
		System.out.println("등급은 "+grade+" 입니다.");
		System.out.printf("등급은 %c입니다.",grade);	
//int : %d, float,double : %f, String %s
	}
}
