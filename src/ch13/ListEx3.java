package ch13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
		String fruit[]= {"사과","포도","딸기","자두","수박"};
		
		//
		List<String> list1 = Arrays.asList(fruit);
		
		System.out.println(list1);
		
		//요소를 추가했을때 
		//list1.add("메론");//java.lang.UnsupportedOperationException
		
		List<String> list2 = new ArrayList<String>(Arrays.asList(fruit));
		list2.add("메론");
		
		System.out.println(list2);
		for(String s : list1) {
			System.out.println(s);
		}
	}
}
