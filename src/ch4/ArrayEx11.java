package ch4;

public class ArrayEx11 {

	public static void main(String[] args) {
		//배열 복사
		int oldArray[] = {10,20,30};
		
		int newArray[] = new int[oldArray.length];
		
		//odlArray => newArray copy
		
		for(int i=0;i<oldArray.length;i++) {
			newArray[i]=oldArray[i];
		}
		
		for(int i:newArray) {
			System.out.println(i+"\t");
		}
	}

}
