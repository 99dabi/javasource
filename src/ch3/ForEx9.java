package ch3;

public class ForEx9 {

	public static void main(String[] args) {
		//1~100까지 정수 중에서 3의 배수와 5의 배수 총합 구하기
		int tDrainage=0;
		int fDrainage=0;
		
		
		for(int i=0;i<=100;i++) {
			if(i%3==0) {
				tDrainage+=i;
				System.out.println("현재"+i+"가 3의 배수에 추가되 "
				+tDrainage+"입니다.");
			}if(i%5==0) {
				fDrainage+=i;
				System.out.println("현재"+i+"가 5의 배수에 추가되 "
				+fDrainage+"입니다.");
			}
			
		}System.out.println("3의 배수 총합 :"+tDrainage+
				" 5의 배수 총합 : "+fDrainage);
	}

}
