package ch2;

public class NumMultiple {
	public static void main(String[] args) {
		//변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 
		//변수 num의 값을 뺀 나머지를 구하시오
//		int num=19;
//		int bigNum=(num/10+1)*10;
//		int result= bigNum-num;
//		System.out.println(bigNum+" - "+num+" = "+result);
		int num=20;
		System.out.println(10-(num%10));

	}

}
