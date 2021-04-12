package shop;

public class CellPhon extends Product {

	private String carrier;
	
	public CellPhon(String pname, int price,String carrier) {
		super(pname, price);
		this.carrier=carrier;
	}

	@Override
	public void printExtra() {
		System.out.println("통신사 : "+carrier);

	}


	

}
