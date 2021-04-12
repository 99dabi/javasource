package ch3;

public class IfEx6 {
	public static void main(String[] args) {
		// 주사위 번호 뽑기 1~6
		// 0.0 <= Math.random() <1.0 : double 타입의 임의의 변수가 나옴 
		// 1~10 
		// 0.0*10 <= Math.random() < 1.0*10
		// 0+1 < (int)Math.random() < 9+1
		//          ||
		//         \  /
		//          \/
		//1~10사이에 숫자가 무작위로 나오는 함수
		//int num = (int)(Math.random()*10)+1
		
		System.out.println("주사위");
		int num = (int)(Math.random()*6)+1;
		System.out.println(num);
		
		if(num==1) {
			System.out.println("1번");
		}else if(num==2) {
			System.out.println("2번");
		}else if(num==3) {
			System.out.println("3번");
		}else if(num==4) {
			System.out.println("4번");
		}else if(num==5) {
			System.out.println("5번");
		}else{
			System.out.println("6번");
		}
		
	}
}
