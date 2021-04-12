package ch2;

public class Pencil {
	public static void main(String[] args) {
		//534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때
		//학생 당 몇 개를 가질 수 있고, 최종적으로 몇개가 남는지 출력하시오
		//변수명은 임의로 설정 가능
//		int Pencil =534;
//		int student=30;
//		int hP = 534/30;
//		int nP = 534%30;
//		System.out.println("연필은 학생당 "+hP+"개를 가질 수 있고"
//				+ " 최종적으로 "+nP+"개가 남습니다.");
		int pencil =534, students=30;
		System.out.println("학생 한 명 당 :"+(pencil/students));
		System.out.println("남은 연필 수 : "+(pencil%students));
		
	}
}

