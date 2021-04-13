package ch14;

public class boxEx2 {
	public static void main(String[] args) {
		Box2<String> box = new Box2<>();
		//						오른쪽 타입은 필수가 아님
		
		//box.setItem(new String("홍길동"))
		box.setItem("홍길동");
		System.out.println(box.getItem());//String obj =(String)box.getItem();
		
//		box.setItem(33);
//		System.out.println(box.getItem());
//		
//		box.setItem(33.14f);
//		System.out.println(box.getItem());
//		
//		box.setItem(true);
//		System.out.println(box.getItem());
	}
}
