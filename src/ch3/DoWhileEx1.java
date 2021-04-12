package ch3;

import java.util.Scanner;

public class DoWhileEx1 {

	public static void main(String[] args) {
		//do 무조건 실행 => 나중에 조건 검사
		// 1~100 사이의 임의의 숫자 하나 생성
		//생성된 숫자를 사용자가 맞추는 형태
		// 생성된 숫자보다 사용자의 입력값이
		//더 크면 더 작은 수 입력하기 라는 메세지 출력
		//반대의 경우 더 큰수 입력하기 메세지 출력
		
		int input=0;
		int answer =(int)(Math.random()*100+1);
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1~100사이 예상되는 값을 입력하세요! :");
			input=sc.nextInt();
			if(input>answer) {
				System.out.println("너무 큰 수입니다.");
			}else if(input<answer) {
				System.out.println("너무 작은 수 입니다.");
			}
		}while(answer!=input);
		System.out.println("정답입니다!!");

	}

}
