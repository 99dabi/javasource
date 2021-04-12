package ch5;

public class Accumulator {
	//필드(인스턴스 필드)
	int total=0;
	//정적필드
	static int grandTotal=0;
	
	void accumulate(int amount) {
		total+=amount; //인스턴스 필드 값을 변화
		grandTotal+=amount; //정적 필드 값을 변화
	}
}
