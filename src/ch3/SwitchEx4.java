package ch3;

public class SwitchEx4 {
//braek가 없는 경우
	public static void main(String[] args) {
		//8~11 정수 호출
		
		int time = (int)(Math.random()*3+8);
		System.out.println("[현재시간 : "+time+"]");

		switch (time) {
		case 8:
			System.out.println("출근");
			
		case 9:
			System.out.println("회의 진행");
			
		case 10:
			System.out.println("업무 진행");
		
		default:
			System.out.println("외근");
			
		}
	}

}
