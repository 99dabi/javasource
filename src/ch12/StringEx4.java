package ch12;

public class StringEx4 {

	public static void main(String[] args) {
		String str1 ="abcdefg";
		
		System.out.println(str1.contains("ab"));
		
		String str2 ="자바 프로그래밍";
//		//프 여부에 따른 결과 출력
		if(str2.contains("프")==true) {
			System.out.println("있습니다.");
		}else {
			System.out.println("없습니다.");
		}
		//삼항 연산자 형
		System.out.println(str2.contains("프")?"들어 있음":"없음");
	}
}
