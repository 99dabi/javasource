package ch5;

public class Board {
	//속성-글번호(1,2,3...),제목,작성자,내용
	int bno;
	String title;
	String writer;
	String contents;
	//생성자 - 기본생성자, 인자를 모두 받는 생성자
	public Board() {
		// TODO Auto-generated constructor stub
	}
	public Board(int bno, String title, String writer, String contents) {
		super();
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
	}	
}
