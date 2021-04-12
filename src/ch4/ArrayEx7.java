package ch4;

public class ArrayEx7 {

	public static void main(String[] args) {
		int scores[][]= {
				{15,25},
				{45,55,66} 
		};
		
		int englishScores[][]=new int[2][];
		//각각의 행마다 열의 개수가 다르기 때문에 정의 할때 한번에 정의를 못하고 행만 정의할 수 있다
		englishScores[0]= new int[2];
		englishScores[1]= new int[3];
		
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores[i].length;j++) {
				System.out.print(scores[i][j]+"\t");
			}System.out.println();
		}
	
	}

}
