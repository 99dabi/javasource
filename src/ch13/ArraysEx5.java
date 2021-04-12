package ch13;

import java.util.Arrays;

public class ArraysEx5 {
	public static void main(String[] args) {
		char arr[]= {'ㅎ','ㅅ','ㄱ','ㄴ','ㅈ','ㄷ','ㅁ','ㄹ','ㅊ'};
		
		for(char ch :arr) {
			System.out.print(ch+" ");
		}System.out.println();

		Arrays.sort(arr);
		
		for(char ch :arr) {
			System.out.print(ch+" ");
		}
	}
}
