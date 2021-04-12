package ch13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx7 {
	public static void main(String[] args) {
		List<String> arrayList =new ArrayList<String>();
		List<String> LinkedList =new LinkedList<String>();
		//arrayList는 처음에 공간을 안잡으면기본으로 10개가 들어가는데 이는 효율이 좋지 않음
		
		System.out.println("===순차적인 추가===");
		System.out.println("ArrayList : " +add1(arrayList));
		System.out.println("LinkedList : "+add1(LinkedList));
		System.out.println();
		System.out.println("===중간에 추가===");
		System.out.println("ArrayList : " +add2(arrayList));
		System.out.println("LinkedList : "+add2(LinkedList));
		System.out.println();
//		System.out.println("===순차적인 삭제===");
//		System.out.println("ArrayList : " +remove1(arrayList));
//		System.out.println("LinkedList : "+remove1(LinkedList));
		System.out.println();
		System.out.println("===중간에 삭제===");
		System.out.println("ArrayList : " +remove2(arrayList));
		System.out.println("LinkedList : "+remove2(LinkedList));
		System.out.println();
		
	}
	public static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i =0 ; i<1000000; i++) {
			list.add(i+"");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	public static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i =0 ; i<10000; i++) {
			list.add(500,"X");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	public static long remove1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i =list.size()-1 ; i>=0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	public static long remove2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i =0 ; i<10000; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
}
