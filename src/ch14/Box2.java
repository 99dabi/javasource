package ch14;

//box1 클래스를 Generics 적용 후 
//Gemerics : 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시 타입 체크 해줌
//타입 안정성/ 타입 체크와 형변환을 생략할 수 있으므로 코드가 간결해짐

// T : type / E : element / K : key / V : value
public class Box2<T> {//제네릭스
	//T : type
	//기본타입
	//참조타입 => Account, Car...,Integer, Float
	//부모 = 자식
	private T item;
	public T getItem() {
		return item;
	}public void setItem(T item) {
		this.item=item;
	}
}
