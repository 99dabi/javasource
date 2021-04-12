package ch4;

public class ArrayEx12 {

	public static void main(String[] args) {
		//배열 복사
		int oldArray[] = {10,20,30};
		
		int newArray[] = new int[5];
		
		//odlArray => newArray copy
		
		//자바에서 제공 : system.arraycopy
		//(Object src,int srcPos, Object dest, int destPos, int length)
		System.arraycopy(oldArray, 0, newArray, 2, oldArray.length);
		for(int i:newArray) {
			System.out.print(i+"\t");
			
		}
		
	}
	//배열
	//장점 : 동일한 타입의 변수를 선언해야 하는게 많은 경우 
	//단점 :  처음에 3개를 담았는데, 후에 추가로 담을 수 없음 그래서 옮기는 작업을 해야있는거

}
