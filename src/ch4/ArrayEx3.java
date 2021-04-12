package ch4;

public class ArrayEx3 {
	public static void main(String[] args) {
		// 배열 선언, 생성, 초기화
		int score[]= {97,88,89,56,69};
		//String name[]={"park","kin","choi","lee","kim"};
		String name[]={"park","kin","choi","lee"};//배열 사용할때 많이 나오는 에러
		
//		//사용
//		for(int i=0;i<=(score.length-1);i++) {
//			System.out.print(score[i]+"\t");
//			System.out.println(name[i]);
//		}
//		
		//향상된 for문 
		for(int s:score) {//: 기준으로 사용  => 타입 변수명 : 배열명 
			System.out.println(s);
		}
		for(String str:name) {
			System.out.println(str);
		}
			
	}
		
	
}
