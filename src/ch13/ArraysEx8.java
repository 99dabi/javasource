package ch13;

import java.util.Arrays;
import java.util.Comparator;



public class ArraysEx8 {
public static void main(String[] args) {
	Student students[] = new Student[5];
	
	students[0]= new Student("송중기",98);
	students[1]= new Student("정해원",99);
	students[2]= new Student("박보검",24);
	students[3]= new Student("송강호",64);
	students[4]= new Student("조인성",50);
	
	//사ㅣ용자 정의 클래스를 sort시킬때 java.lang.ClassCastException 발생
	//예외를 막기 위해서는 Comparable 인터페이스를 구현한다. => compareTo-자신의 정렬기준을 넣어주는 것
	Arrays.sort(students,Comparator.reverseOrder());
	//System.out.println(students);// 주소값이 나옴
	
	//Arrays.toString(배열명) => 객체가 가지고 있는 toString 의 형태로 리턴시켜줌
	System.out.println(Arrays.toString(students));
}
}
