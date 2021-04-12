package ch8;

public class Car {
	//클래스 값이 필드로 들어오면 null이 초기화가 되어있음
	Tire frontLeftTire= new Tire(6,"앞왼쪽");//   앞 왼 바퀴
	Tire frontRightTire= new Tire(2,"앞오른쪽");//앞 오 바퀴
	Tire backLeftTire= new Tire(3,"뒤왼쪽");//   뒤 왼 바퀴
	Tire backRightTire= new Tire(4,"뒤오른쪽");// 뒤 오 바퀴

	//String str;//str equals()s
	
	int run() {
		System.out.println("자동차 달립니다.");
		if(!frontLeftTire.roll()) {
			stop();
			return 1; 
		}
		if(!frontRightTire.roll()) {
			stop();
			return 2;
		}if(!backLeftTire.roll()) {
			stop();
			return 3; 
		}
		if(!backRightTire.roll()) {
			stop();;
			return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}

