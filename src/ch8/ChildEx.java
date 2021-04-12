package ch8;

public class ChildEx {

	public static void main(String[] args) {
//이 변수의 이름으로 접근할 수 있는것은 부모가 가지고 있는것
		Parent Parent = new Child();
		//부모의 참조 변수로 접근할 수 있는 범위는 Parent 클래스가 가지고 
		//있는 메소드로 제한된다.
		//(단, 오버라이딩 된 메소드가 있다면 자식 클래스의 메소드가 실행이 된다)
		
		Parent.method1();//부모꺼
		Parent.method2();//부모꺼,내꺼
		
		//child.method3();//내꺼  The method method3() is undefined for the type Parent
		
	//-=--------------------------		
		//강제 캐스팅
		//자식타입 = (자식타입)부모타입
		Child child = (Child) Parent;
		child.method3();
		
		//ClassCastException//캐스팅은 되는데 실행시 오류
//		Parent p1 = new Parent();
//		child = (Child)p1;
		
	}
}