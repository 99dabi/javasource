package ch7;

public class CaptionTV2 extends TV2{
	
	boolean caption;
	
	public CaptionTV2(String color, boolean power, int channel, boolean caption) {
		super(color, power, channel);
		// TODO Auto-generated constructor stub
	}

	void displayCation(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	
	
	
}
