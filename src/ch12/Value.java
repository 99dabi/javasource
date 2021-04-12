package ch12;

public class Value {
	int value;
	public Value(int value) {
		this.value=value;
	}
	@Override//부모가 넘겨준 그상태로 사용해야함
	public boolean equals(Object obj) {
		//equals 오버라이딩 
		//가지고 있는 값이 같다면 같음을 출력
		Value v = (Value) obj;
		if(this.value == v.value) {
			return true;
		}
		return false;
	}	@Override
	public String toString() {
		//value자체는 숫자라서 문자열로 나와야함
		
		return "value :"+value;
	}
}
