package ch4;

import java.util.Scanner;

public class ArrayEx18 {
	public static void main(String[] args) {
		// 학생들의 점수를 받아서 최고 점수 및 평균점수를 구하기 
		Scanner sc = new Scanner(System.in);
		//배열생성
		int[] scores=null;
		
		//몇 명의 학생? => 입력
		System.out.print("학생이 몇명인가요? ");
		int stNum= sc.nextInt();

		//배열 생성
		scores=new int[stNum];
		
		//
		int newScore=0;
		
		//배열에 학생들 점수입력
//		for(int i=0;i<stNum;i++) {
//			System.out.printf((i+1)+"번의 점수를 입력하세요. : ");
//			newScore=sc.nextInt();
//			scores[i]=newScore;
//		}
		//
		for(int i=0;i<scores.length;i++) {
			System.out.print("점수 입력 >> ");
			scores[i]=sc.nextInt();
		}
		
		for(int score:scores) {
			System.out.println(score);
		}
		//확인용
		//System.out.println(scores.length);
		System.out.println("입력완료 ");
		System.out.println("\n입력된 결과");
		for(int j=0;j<scores.length;j++) {
			System.out.println((j+1)+"번 : "+scores[j]);
			
		}	
		
	}
}
