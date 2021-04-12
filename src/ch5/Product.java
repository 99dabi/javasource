package ch5;

public class Product {
	//속성 - 상품코드(String),상품명(String),제조사(String),제조단가,할인율
	String pCode;
	String pName;
	String company;
	int price;
	int discount;
	//생성자 - 모든 필드를 파라메터로 받는 생성자/할인율을 뺀 나머지 필드를 받는 생성자
	public Product(String pCode, String pName, String company, int price, int discount) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.company = company;
		this.price = price;
		this.discount = discount;
	}
	public Product(String pCode, String pName, String company, int price) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.company = company;
		this.price = price;
	}	
	//기능 - 할인율을 변경한다. 판매가를 계산한다. 제조단가 * (100-할인율) / 100
	void setDiscount(int discount) {
		this.discount = discount;
	}
	
	int selPrice() {
		return price * (100-discount)/100;
	}
}












