package ch12;

public class ObjectEx {
	public static void main(String[] args) {
		//object 클래스에서는 == 과 equals 개념이 같음 => 주소값이 같으냐?
		Object obj1 = new Object();//object는 얘뿐이다.
		Object obj2 = new Object();
		
		System.out.println(obj1==obj2);

		System.out.println(obj1.equals(obj2));	
	}
}
