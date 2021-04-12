package ch10;

/*인터페이스
 * 추상 클래스와 비슷함
 * 추상 클래스보다 추상화가 더 높음 => 추상메소드와 상수만을 가질 수 있음
 * 다른 클래스를 작성하는데 도움 줄 목적으로 사용됨
 * 
 * 모든 메서드는 public abstract 이어야 하며 생략이 가능
 * 모든 맴버변수는 public static final이어야 하며 생략이 가능
 * 생성자 없음
 * 
 * JDK8 인터페이스 변화
 * 디폴트 메서드/정적 메서드
 * 
 * JDK9 인터페이스 변화
 * private 메소드
 */
public interface Account {
	static final int SPADE= 4;//상수는 대문자로
	//Account(){};//생성자 만들 수 없음
	
	abstract void test();
	void print();
	
	//8버전 이상일때만
	default int nethod2() {
		return 0;
	}
	static void method1() {
		
	}
	
	//9버전 이상인 경우
}
	