package ch3;

public class ForEx4 {

	public static void main(String[] args) {
		// 구구단
		for (int i=1;i<10;i++) {
			for (int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		for (int i=1;i<10;i++) {
			System.out.printf("2 * %d = %d\n",i,i*2);
		}
	}

}
