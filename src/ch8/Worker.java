package ch8;

public class Worker {
	public void work(Employee employee) {
		employee.work();
	}
	
	
	//호출하는 일자체는 같아서 아에 부모클래스를 선언해 다 수용할 수 있게 한다.
//	public void work(Ceo employee) {
//		employee.work();
//	}
//	public void work(Admin employee) {
//		employee.work();
//	}
}
