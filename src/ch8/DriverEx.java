package ch8;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		//하고 싶은 것 : drive(Vehicle vehicle)
		//1번 : driver.driver(new Vehicle());
		//2번 : driver.driver(new Bus());
		driver.driver(new Vehicle());
		driver.driver(new Bus());
		driver.driver(new Taxi());
		
		
		
	}
}
