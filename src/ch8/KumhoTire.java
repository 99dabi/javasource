package ch8;

public class KumhoTire extends Tire {

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		// TODO Auto-generated constructor stub
	}
	@Override//부모가 가지고 있는 것 재정의 하겠다
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+"Tire 수명 : "+
		(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+" Kumho Tire 펑크 ***");
			return false;
		}
	}

}
