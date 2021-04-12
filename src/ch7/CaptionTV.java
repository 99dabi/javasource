package ch7;

public class CaptionTV extends TV{
	boolean caption;
	
	public CaptionTV() {
		super();//없어도 항상 들어있음
	}

	void displayCation(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	
	
	
}
