package ch4;

public class ArrayEx10 {
	public static void main(String[] args) {
		//
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum=0;
		int total=0;
		//합계와 평균 구하기
		for(int[] arr:array) {
			for(int j:arr) {
				total+=j;
				sum++;
			}
			
		}System.out.println("최종 total = "+total+ ", 평균 = "+(total/sum));
	}
}
