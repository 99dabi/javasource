package ch3;

public class ForEx1 {

	public static void main(String[] args) {
		// 1~10 까지 출력
		int i;
		//	 1	  2,5	 4
		for(i=1;i<=10;i++) {
			//3, 6
			System.out.print(i+"\t");
		}
		System.out.println();
		//10~1까지 출력
		for(int j=10;j>=1;j--) {
			System.out.print(j+"  ");
		}
	}
}
