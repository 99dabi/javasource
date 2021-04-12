package ch10;

public interface AdderInterface {
	//x와 y를 받아서 합을 리턴하는 추상 메소드 선언
	int add(int x,int y);
	//n을 받아서 1에서 n까지 정수 합 리턴하는 추상 메소드 선언, n은 0보다 큰 수로 가정
	int add(int n);
	
	//AdderInterface를 구현받은 클래스 MyAdder를 작성한 후 main 클래스를 만들어 
	//테스트 하기
}
