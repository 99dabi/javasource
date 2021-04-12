package ch3;

public class ForEx7 {

	public static void main(String[] args) {
		// 구구단
		for (int i=1;i<10;i++) {
			for (int j=1;j<10;j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			System.out.printf("%d 단 끝\n",i);
		}

	}

}
