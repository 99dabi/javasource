package ch3;

public class ForEx12 {

	public static void main(String[] args) {
		// 정수 12345를 선언하고 각 자릿수를 더한 결과를 출력하기
				// 1+2+3+4+5 =15;
		int num = 12345;		
//		int hap=0;
//		for (int i = 4;i>=0;i--) {
//			if(i!=0) {
//				
//				numc-=numc/(10*i);
//				hap=hap+numc/(10*i);
//			}else {
//				hap+=1;
//			}System.out.println(hap);
//		}System.out.println(hap);
		int sum=0;
		for(int i=0;i<5;i++) {
			sum +=num%10;
			num=num/10;
		}System.out.println("sum = "+sum);
		
		
		
	}

}
