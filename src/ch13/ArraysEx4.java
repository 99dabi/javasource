package ch13;

import java.util.Arrays;

public class ArraysEx4 {

	public static void main(String[] args) {
		String arr[]= {"good","height","apple","piano","zero"};

		//정렬 전
		for(String s : arr) {
			System.out.print(s+" ");
		}System.out.println();
		
		//오름차순 정렬
		Arrays.sort(arr);
		
		//정렬 후
		for(String s : arr) {
			System.out.print(s+" ");
		}System.out.println();
	}

}
