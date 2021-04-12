package ch4;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 배열 선언, 생성
		int score[] = new int[5];
		String name[] = new String[5];

		//초기화
		score[0]=97;
		score[1]=88;
		score[2]=89;
		score[3]=56; 
		score[4]=69;
		
		name[0]="park";
		name[1]="kin";
		name[2]="choi";
		name[3]="lee";
		name[4]="kim";
		
		//사용
		for(int i=0;i<=(score.length-1);i++) {
			System.out.print(score[i]+"\t");
			System.out.println(name[i]);
		}

		
			
	}
}
