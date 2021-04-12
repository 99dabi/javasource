package ch1;
//변수의 유효범위-선언된 블록 내에서만 사용 가능
public class VariableScope1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int value =15;//♬
		//int v2;//○
		{
			int v2= value+20;//♬value는 범위가 더 상위에 있기때문에 사용가능
			System.out.println(v2);
		}
		
		//System.out.println(v2);//○컴파일 에러
		//어디에 선언됬는가에 따라 사용될 수 있는 범위가 결정된다.
		
		
		
	}

}
