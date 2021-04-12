package ch4;



public class ArrayEx5 {
	public static void main(String[] args) {
		int iArr1[] = new int[10];
		int[] iArr2 = new int[] {1,2,3,4,5};
		int iArr3[] = {100,25,35,65,95};//값이 정해져있다면 추천하는 방법
		char chArr[] = {'a','b','c','d','e'};
		double dArr[] = {35.5,36.5,37.5};
		boolean bArr[] = {true,false, true,false};
		
		System.out.println(iArr1);
		for(int i: iArr3) {
			System.out.println(i);
		}
		for (char ch : chArr) {
			System.out.print(ch+"\t");
		}
		for(double d:dArr) {
			System.out.print(d+"\t");
		}
		for (boolean b : bArr) {
			System.out.println(b+"\t");
		}
	}
}
