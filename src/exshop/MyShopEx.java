package exshop;

public class MyShopEx {
	public static void main(String[] args) {
		
		MyShop shop = new MyShop();
		//상점 이름 지정
		shop.setTitle("My Shop");
		//User 생성
		shop.genUser();
		//제품 생성
		shop.genProduct();
		//상점 시작
		shop.start();
	}
}
