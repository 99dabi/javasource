package ch8;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0 ; i<=5;i++) {
			
			int problumLocation = car.run();//tire에서 stop이 걸리면 숫자가 넘어옴
			switch (problumLocation) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire 로 교체");
				//대입은 같은 속성이 아니면 불가능하다.
				car.frontLeftTire = new HankookTire(15, "앞왼쪽");
				break;
			case 2:
				System.out.println("앞 오른쪽 HankookTire 로 교체");
				car.frontRightTire = new HankookTire(13, "앞오른쪽");
				break;
			case 3:
				System.out.println("뒤 왼쪽 HankookTire 로 교체");
				car.backLeftTire = new HankookTire(14, "뒤왼쪽");
				break;
			case 4:
				System.out.println("뒤 오른쪽 HankookTire 로 교체");
				car.backRightTire = new HankookTire(15, "뒤 오른쪽");
				break;
			}
			System.out.println("---------------------------------");
		}	
		car.run();
	}
}
