package ch7;

/* 오버라이딩 규칙
 * 부모보다 접근 제한자를 좁게 가져서는 안됨
 * 부모의 메소드와 동일한 시그니처(리턴타입, 메소드명, 인자)를 가짐
 * 새로운 예외를 throws 할 수 없음
 */

public class SubListString extends ListString {
	String name="성춘향";
	
	@Override
	public void list() {
		// TODO Auto-generated method stub
		//부모의 동인한 메소드 호출할 때 
		super.list();//부모것을 부르고 싶다면, 무조건 붇여야 한다 
		System.out.println(name+"하위클레스이름");
	}
	public void writer() {
		System.out.println("하위 클래스의  name 값 : "+this.name);
		System.out.println("상위 클래스의  name 값 : "+super.name);
		this.list();
		super.list();
	}
}
