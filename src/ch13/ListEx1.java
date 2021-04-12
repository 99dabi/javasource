package ch13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		//List<E> : 
		//E =>리스트 안에 담아야 할 타입을 작성(참조타입)3
		//int =>Integer
		//List<Integer> list1= new ArrayList<Integer>();
		//비어있는 형태 생성
		ArrayList<Integer> list1= new ArrayList<Integer>();
		//다형성
		
		//요소 추가
		list1.add(1);
		list1.add(10);
		list1.add(100);
		list1.add(1000);
		list1.add(10000);
		list1.add(100000);

		//확인
		System.out.println(list1);
		
		for(Integer i :list1) {
			System.out.println(i);
		}		
		//sort해서 출력
		list1.sort(Comparator.reverseOrder());
		for(Integer i :list1) {
			System.out.print(i+"\t");
		}	
	}
}
