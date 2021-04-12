package ch4;

import java.util.Scanner;

public class ArrayEx17 {
	public static void main(String[] args) {
		boolean run= true;	
		int studentNum=0;
		int[] scores=null;
		Scanner sc =new Scanner(System.in);
		
		//1.번 변수
		int stuNum=0;
		//2번 
		
		//3번 변수
		
		//4번변수
		int maxScore=0, sumScore=0;
		
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("--------------------------");
			System.out.print("선택>> ");
			System.out.println();
			
			int selectNo= sc.nextInt();
			if(selectNo==1) {
				//사용자 입력값에 맞춰 배열생성
				System.out.print("학생수를 입력하세요 >> ");
				studentNum= sc.nextInt();
				scores=new int[studentNum];
			}else if(selectNo==2) {
				//생성된 배열에 초기화
				for(int i=0;i<scores.length;i++) {
					System.out.print((i+1)+"번 학생의 점수 입력 >> ");
					scores[i]=sc.nextInt();
				}
				
			}else if(selectNo==3) {
				//학생 점수 확인
				for(int j=0;j<scores.length;j++) {
					System.out.println((j+1)+"번 : "+scores[j]);				
				}	
			}else if(selectNo==4) {
				//분석 최댓값, 평균
				//스코어 초기화
				maxScore=scores[0]; sumScore=scores[0]; 
				for(int k=1;k<scores.length;k++) {
					if(maxScore<scores[k]) {
						maxScore=scores[k];
					}
					sumScore+=scores[k];
					System.out.println("maxScore : "+maxScore+
							"\t sumScore : "+sumScore);
				}
				System.out.println("최종 : maxScore : "+maxScore+
						"\t aveScore : "+sumScore/(scores.length-1));
			}else if(selectNo==5) {
				run = false;
			}
	
		}
		System.out.println("프로그램 종료");
	}
}
