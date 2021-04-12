package ch13;

import java.util.Arrays;

public class ArraysEx1 {
	public static void main(String[] args) {
		char arr1[] = {'H','a','p','p','y'};
		
		//배열복사 
		//1.직접 복사
		//2. System.arraycopy
		char arr2[] = new char[10];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.out.println(arr2);
		
		//3.Arrays 이용하기
		char arr3[]=Arrays.copyOf(arr1, arr1.length);
		System.out.println(arr3);
		
	}
}
