package ch4;

public class ArrayEx8 {

	public static void main(String[] args) {
		int scores[]= {79,88,91,33,100,55,95};
		
		int max=scores[0], min=scores[0];
		
		//최대값과 최소값 구하기
		for(int i=1;i<scores.length;i++) {
			if(max<scores[i]) {
				max=scores[i];		
			}
			if(min>scores[i]) {
				min=scores[i];
			}
			System.out.println("현재 max값 = "+max);
			System.out.println("현재 min값 = "+min);
		}System.out.println("최대값 : "+max+"\n최소값 : "+min);
		
		
	}

}
