package ch7;

public class UnitEx {

	public static void main(String[] args) {
		int x=10, y=9;
		Marine marine = new Marine();
		marine.move(x, y);
		marine.stop();
		marine.stimPack();
		
		Tank tank = new Tank();
		
		Dropship dropship = new Dropship();

	}

}
