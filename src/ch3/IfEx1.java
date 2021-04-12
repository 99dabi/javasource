package ch3;

public class IfEx1 {
	public static void main(String[] args) {
		//조건문 : if는 참일때 실행
		//조건식에 따라서 출력이 되는 구문
		int x=0;
		
		if (x==0) {
			System.out.println("x==0");
		}
		if (x!=0) {
			System.out.println("x!=0");
		}
		if (!(x==0)) {
			System.out.println("!(x==0)");
		}
		if (!(x!=0)) {
			System.out.println("!(x!=0)");
		}	
	}

}
