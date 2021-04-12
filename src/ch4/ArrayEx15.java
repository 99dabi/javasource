package ch4;

import java.util.Scanner;

public class ArrayEx15 {

	public static void main(String[] args) {
		//단어 맞추기 게임
		String words[]= {"television","computer","mouse","phone"};
		char temp=' ';
		Scanner sc= new Scanner(System.in);
		String answer=" ";
		
		for(int i=0; i<words.length;i++) {
			char[] question = words[i].toCharArray();//데이터 배열을 캐릭터 배열로 변경시켜줘
			//"abc" =>chArr[] ='a', 'b', 'c' 
			
			//문자의 위치 섞기
			for(int j=0; j<question.length;j++) {
				int pos = (int)(Math.random()*question.length);
				temp=question[j];
				question[j]=question[pos];
				question[pos]=temp;
			
			}//문제 보여주기
			System.out.printf("%s 의 정답을 입력하세요>>",new String(question));
			System.out.println();
			
			//정답 입력하기
			answer=sc.nextLine();
			
			//정답이 일치하는지 확인
			if(words[i].equals(answer)) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("오답입니다.");
			}
		}

	}

}
