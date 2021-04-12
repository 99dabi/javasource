package ch12;

public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person("pink","potato");
		Person p2 = new Person("pink","potato");
		Person p3 = new Person("blue","potato");
		Person p4 = new Person("pink","pota");
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));
		//패키지 명. 클래스 가저옴
		System.out.println(p1.getClass());	
		//toString : ch12.Person@5aaa6d82위치 알려줌
		//			 맴버변수의 값을 출력 용도
		System.out.println(p1.toString());
		System.out.println(p2.toString());


	}

}
