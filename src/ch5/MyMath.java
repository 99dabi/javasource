package ch5;

/* static
 * 멤버변수 중 모든 인스턴스가 공통으로 사용하는 것에 붙임
 * 인스턴스(new)를 생성하지 않아도 쓸 수 있음
 * 인스턴스 변수/인스턴스 메소드 사용불가
 * 대부분 정적필드 선언과 동시에 초기화 
 */


public class MyMath {
	//인스턴스 변수
	long a,b;
	//인스턴스 메소드
	long add() {
		return a+b;
	}
	long subtract() {
		return a-b;
	}
	long multiply() {
		return a*b;
	}
	double divide() {
		return a/b;
	}
	//정적 필드(클래스 변수)
	//정적 메소드(클래스 메소드)
	static long add(long c,long d) {
		//subtract(); (X)
		//int sum = a+b; (X)
		return c+d;
	}
	static long subtract(long c,long d) {
		return c-d;
	}
	static long multiply(long c,long d) {
		return c*d;
	}
	static double divide(double c,double d) {
		return c/d;
	}
}














