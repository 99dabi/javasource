package ch5;

import java.util.Scanner;

public class BoardEx {
	public static void main(String[] args) {
		//Board 객체 배열 3
		Board boardArr[] = new Board[3];
		
		for(int i=0;i<boardArr.length;i++) {
			boardArr[i] = new Board();
		}
			
		Scanner sc = new Scanner(System.in);
		//입력후 출력	
		for(Board board:boardArr) {			
			System.out.print("글번호 : ");
			board.bno = Integer.parseInt(sc.nextLine());
			System.out.print("제목 : ");
			board.title = sc.nextLine();
			System.out.print("작성자 : ");
			board.writer = sc.nextLine();
			System.out.print("내용 : ");
			board.contents = sc.nextLine();
		}
		
		//입력후 출력	
		for(Board board:boardArr) {			
			System.out.println("글번호 : "+board.bno);
			System.out.println("제목 : "+board.title);			
			System.out.println("작성자 : "+board.writer);			
			System.out.println("내용 : "+board.contents);			
		}

	}
}








