package shop;

public abstract class Product {
	//추상 클래스 : 변수, 상수, 일반메소드, 추상메소드
	private String pname;
	private int price;
	
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	public void printDetail() {
		//기본 정보인 상품 이름 과 가격을 출력해라.
		System.out.println("상품이름 "+pname+"\t 가격 : "+price);
		// 상세 정보를 출력하려고  printExtra()메서드 호출
		printExtra();
	}
	public abstract void printExtra();
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	
}
