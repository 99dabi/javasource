package ch13;

import java.util.Arrays;

public class ArraysEx3 {
	public static void main(String[] args) {
		char arr[]= {'a','q','c','r','z','o','f','g','s'};
		
		//정렬전
		for(char ch :arr) {
			System.out.print(ch+" ");
		}
		System.out.println();

		//정렬
		Arrays.sort(arr);
		
		//정렬후
		for(char ch :arr) {
			System.out.print(ch + " ");
		}
	}
}
