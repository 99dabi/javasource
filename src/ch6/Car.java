package ch6;

public class Car {
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0)
			return;
		this.speed = speed;
	}
	public boolean isStop() {//형이 boolean형이라 is
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
}
