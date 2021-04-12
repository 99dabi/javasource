package ch4;

public class ReferenceEx1 {

	public static void main(String[] args) {
		//String strArr[]= new String[3];
		
//		String strArr[] =null;//◇
//		System.out.println(strArr.length);//◇Null Pointer access : 
//		// 참조타입 특징 - null할당(힙 영역의 객체를 참조하지 않음)
//		 
//		int intArr[]= null;
//		System.out.println(intArr.length);
		
		String strArr[]=new String[3];
		strArr[0]="홍길동";
		strArr[1]="홍길동";
		strArr[2]=new String("홍길동");
		//String은 == 일때 동일한 결과를 주지 않음
		//equals()사용하기
		System.out.println(strArr[0]==strArr[1]);
		System.out.println(strArr[0]==strArr[2]);
		System.out.println(strArr[0].equals(strArr[2]));
	}

}
