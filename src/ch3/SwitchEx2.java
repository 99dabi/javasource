package ch3;

public class SwitchEx2 {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch (grade) {
		case 'A'://첫번째 문장에는 braek가 없기때문에 break가 없을때까지 내려감 
		case 'a':	
			System.out.println("우수회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원");
			break;
		
		default:
			System.out.println("손님");
			break;
		}
				

	}

}
