package ch6;

public class Time {
//맴버변수, getter setter메소드, 메소드, 생성자 =>자바빈
	private int hour;
	private int minute;
	private int second;
	
//	private Time() {
//		// TODO Auto-generated constructor stub
//	}
	
	
	//set맴버변수 이름 : 맴버변수의 값을 세팅 =>setter method
	public void setHour(int hour) {
		if(hour>23||hour<0) {
			return;
		}
		this.hour=hour;
	}
	//get맴버변수이름 : 맴버변수의 값을 읽기 =>getter method
	public int getHour() {
		return hour;
	}
	public void setMinute(int minute) {
		if(minute<0||minute>59) {
			return;
		}
		this.minute=minute;
	}
	public int getMinute() {
		return minute;
	}
	public void setSecond(int second) {
		if(second<0|| second>59) {
			return;
		}this.second=second;
	}
	public int getSecond() {
		return second;
	}
}
