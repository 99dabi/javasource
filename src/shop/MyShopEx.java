package shop;

public class MyShopEx {
	public static void main(String[] args) {
		Myshop shop = new Myshop();
		//상점 이름 지정
		System.out.println("상점이름을 입력해 주세요 : ");
		shop.setTitle("이오난사");	
		//User생성
		shop.genUser();
		//제품 생성
		shop.genProduct();
		
		
		//상점을 시작
		shop.start();
		
	
		
	}
}
