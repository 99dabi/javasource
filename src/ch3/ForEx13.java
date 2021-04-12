package ch3;

public class ForEx13 {

	public static void main(String[] args) {
		//구구단 2~9단 출력
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				//System.out.print(i+"*"+j+"="+i*j+"\t");
				System.out.printf("%d x %d= %2d\t",i,j,i*j);
				// %2d => 2자리 맞춰서 출력됨 
			}
			System.out.println(i+"단 끝");
		}
		
	}
}
