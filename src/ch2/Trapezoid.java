package ch2;

public class Trapezoid {
	public static void main(String[] args) {
		//사다리꼴의 넓이를 구한 후 출력하시오
		//윗변 : 5, 아랫변 : 10, 높이 : 7
//		int upside=5,downside=10,height=7;
//		double Trapezoidal = (double)(upside+downside)*height/2;
//		System.out.println("사다리꼴의 넓이 : "+Trapezoidal);
		int top=5, bottom=10, height=7;
		int area = (top+bottom)*height/2;
		System.out.println("사다리꼴 넓이 : "+area);
	}
}

