package shop;

public class User {
	private String name;
	PayType paytype;

	public User(String name,PayType paytype) {
		super();
		this.paytype=paytype;
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PayType getPaytype() {
		return paytype;
	}
	public void setPaytype(PayType paytype) {
		this.paytype = paytype;
	}

	
}
