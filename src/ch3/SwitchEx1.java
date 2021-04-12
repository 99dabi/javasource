package ch3;

// switch : if~else 구조를 간결하게 만들어 준다
//			변수 값에 의해서 실행문 결정

public class SwitchEx1 {
	public static void main(String[] args) {
		//무작위 주사위 =>ifex6 변형
		int num=(int)(Math.random()*6+1);
		System.out.println(num);
		switch (num) {
		case 1:
			System.out.println("1이 나왔습니다.");
			break;
		case 2:
			System.out.println("2이 나왔습니다.");
			break;
		case 3:
			System.out.println("3이 나왔습니다.");
				break;
		case 4:
			System.out.println("4이 나왔습니다.");
			break;
		case 5:
			System.out.println("5이 나왔습니다.");
				break;
		default:
			System.out.println("6이 나왔습니다.");
			break;
		}
			
		
	}
}
