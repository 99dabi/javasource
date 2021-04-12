package ch12;

public class Math3 {
	public static void main(String[] args) {
		//1~3까지 난수를 3개 생성한 뒤 한 줄에 출력하기
		//모두 같은 수가 나올때까지 반복하고, 모두 같은 수이면 성공 출력한 후 프로그램 종료
		int random1=0;
		int random2= 0;
		int random3= 0;
		// 2  1  2
		// 2  3  2
		// 1  3  3
		// 1  1  1
		//성공
		boolean run= true;
		while(run) {
			random1= (int)(Math.random()*3+1);
			random2= (int)(Math.random()*3+1);
			random3= (int)(Math.random()*3+1);
			System.out.print(random1);
			System.out.print(random2);
			System.out.print(random3);
			System.out.println();
			if(random1==random2&& random1==random3) {
				System.out.println("성공 종료합니다.");
				run = false;
			}
		}
	}
}
