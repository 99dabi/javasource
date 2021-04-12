package ch12;

public class ValueEx {
	public static void main(String[] args) {
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		Value value3 = value1;
		
		System.out.println(value1==value2);
		
		//equals() : 주소가 같은지 여부
		//자식클래스 오버라이딩 => value 맴버변수의 값이 같은지
		//equals() 오버라이딩 하는경우가 있는데 원하는 형으로 변형하려면 하는경우가 많다
		System.out.println(value1.equals(value2));
		System.out.println(value1.equals(value3));
		
		System.out.println(value1.toString());
	}
}
