package ch1;

public class VariableScope2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=15;
		int v2=0;//◎not have been initialized : 할당된 값 없음(초기화 안했음)
		if(value>10) {
			//int v2 = value-5;//§
			v2=value-5;//◎
		}
		System.out.println(v2);//§ v2 호출 불가//◎
		System.out.println("   a   ");//출력문안에 사용하는 공백은 의미가 있음
	}

}
