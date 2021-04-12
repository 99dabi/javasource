package ch8;

public class PromotionEx {

	public static void main(String[] args) {
		//자동 타입 변환- 상속관계
		A obj1 = new B();
		System.out.println("-----------");
		A obj2 = new C();System.out.println("-----------");
		A obj3 = new D();System.out.println("-----------");
		A obj4 = new E();System.out.println("-----------");
		
		//Type mismatch: cannot convert from E to B
		//B obj5 = new E();
	}

}
