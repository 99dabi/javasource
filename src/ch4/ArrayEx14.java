package ch4;

public class ArrayEx14 {

	public static void main(String[] args) {
		String data[]= {"abc","def","hijkl"};

		for(int i=0; i<data.length;i++) {
			char[] chArr = data[i].toCharArray();//데이터 배열을 캐릭터 배열로 변경시켜줘
			//"abc" =>chArr[] ='a', 'b', 'c' 
			for(int j=0; j<chArr.length;j++) {
				System.out.println(chArr[j]+" ");
			}System.out.println();
		}
	}

}
