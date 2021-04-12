package ch6;

public class TimeEx {

	public static void main(String[] args) {
		Time t = new Time();
		//t.hour = 25;//잘못된 값이들어와도 막지 못함
		t.setHour(12);
		t.setMinute(25);
		t.setSecond(61);
		
		System.out.printf(" 현재 시간 : %d : %d : %d",
				t.getHour(),t.getMinute(),t.getSecond());
		
	}

}
