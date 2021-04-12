package ch8;

public class ChildEx2 {

	public static void main(String[] args) {
//이 변수의 이름으로 접근할 수 있는것은 부모가 가지고 있는것
		Parent parent1 = new Child();
		method1(parent1);
		method2(parent1);
		
		Parent parent2 = new Parent();
		method1(parent2);
		method2(parent2);	
	}
	//instanceof : 레퍼런스가 가리키는 객체가 해당 클래스 타입인지 아닌지 확인
	//사용법 : 객체레퍼런스 instanceof 클래스 타입
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1() - Child 변환 성공");
		}else {
			System.out.println("method1() - Child 변환 실패");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2() - Child 변환 성공");
	}
}