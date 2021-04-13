package ch14;

public class BoundType {
	//number 상속하고 있는 타입만 넣을 수 있음
	public static<T extends Number>int compare(T t1,T t2){
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);
	}
}
