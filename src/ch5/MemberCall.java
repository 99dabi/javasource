package ch5;

public class MemberCall {
	//인스턴스 변수
	int iv=10;
	//클래스 변수
	static int cv=20;
	
	//인스턴스 변수
	int iv2=cv;
	//클래스 변수
	//static int cv2=iv; (X)
	
//	MemberCall call = new MemberCall();
//	call.iv	
	static int cv2=new MemberCall().iv;
	
	
	//클래스 메소드
	static void staticMethod1() {
		System.out.println(cv);
		//System.out.println(iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
		//instanceMethod1();
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
	
}









