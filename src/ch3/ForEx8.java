package ch3;

public class ForEx8 {

	public static void main(String[] args) {
		// 1~100까지 정수 중에서 3의 배수만을 더하기 (단, 9의 배수는 안더하기
		int sum=0;
		for(int i=3;i<=100;i+=3) {
			if(i%9 != 0) {
				sum+=i;
				System.out.println("더한값"+i);
			}else {
				System.out.println("안더한 값"+i);
			}
		}System.out.println(" 1~100까지 정수 중에서 3의 배수만을 더한 값은 :"
				+ ""+sum);

	}

}
