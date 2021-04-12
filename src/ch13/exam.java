package ch13;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;



public class exam {public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
//문1 Scanner를 사용해 학점('A','B','C','D','F')을 5개만 문자로 입력받아
//ArrayList 에 저장한다. 다시 ArrayList를 검색하여 5개의 학점을 점수
//(A=4.0, B=3.0,C=2.0,D=1.0,F=0.0)
	//출력 예시) 빈칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F) 
	//>>  B A F C D  3.0 4.0 0.0 2.0 1.0
		System.out.println("문제 1) ");
		System.out.print("학점('A','B','C','D','F')을 5개만 문자로 입력하시오");
		System.out.println();
		ArrayList<Character> grade = new ArrayList<Character>();

		StringTokenizer str1 = new StringTokenizer(sc.nextLine()," ");
		
		while(str1.hasMoreTokens()) {
			grade.add(str1.nextToken().charAt(0));
		}
		//		for(int i =0;i<5;i++) {
//			grade.add(sc.nextLine().charAt(0));
//		}System.out.println();
		System.out.println(grade);
		for(int i=0;i<grade.size();i++) {
			char a=grade.get(i);
			switch (a) {
			case 'A':
				System.out.print("4.0\t");
				break;
			case 'B':
				System.out.print("3.0\t");
				break;
			case 'C':
				System.out.print("2.0\t");
				break;
			case 'D':
				System.out.print("1.0\t");
				break;
			case 'F':
				System.out.print("0.0\t");
				break;
		}
		}
	
	//문2) Scanner를 사용하여 5개의 실수 값을 사용자로부터 받아서
	//ArrayList에 저장한 후 검색하여 가장 큰 수를 출력
		ArrayList<Double> doubleNum = new ArrayList<Double>();
		System.out.println();
		System.out.println("문제 2) ");
		System.out.println("5개의 실수를 입력하여 주시요.");
		double max=0;
		StringTokenizer str2 = new StringTokenizer(sc.nextLine()," ");		
		while(str2.hasMoreTokens()) {
			doubleNum.add(Double.parseDouble(str2.nextToken()));
		}
		max=doubleNum.get(0);
		for(int i=1;i<doubleNum.size();i++) {
			if(max<doubleNum.get(i)) {
				max=doubleNum.get(i);
			}
		}System.out.println("가장 큰 수 : "+max);

	//예시)3.14 2.2 -5.5 99.9 33.7 가장 큰 수는 99.9
	
	//문제3) 한 어린이의 키를 2012~2020년 사이에 1년단위로 입력받아 ArrayList에 저장.
	//가장 키가 많이 자란 연도 출력
	//예시)  120 122 125 130 139 160 169 173 175
	//가장 키가 많이 자란 년도는 2016년 21.0cm
		System.out.println("문제3) 한 어린이의 키를 2021~2020년 사이에 1년단위로 입력");
		System.out.println("2012 2013 2014 2015 2016 2017 2018");
		
		ArrayList<Integer> intNum = new ArrayList<Integer>();
		StringTokenizer str3 = new StringTokenizer(sc.nextLine()," ");		
		while(str3.hasMoreTokens()) {
			intNum.add(Integer.parseInt(str3.nextToken()));
		}
		
		int backYear=intNum.get(0);
		int bastYear=0;
		int tall=0;
		for(int i=1;i<intNum.size();i++) {
			if(intNum.get(i)-backYear>tall) {
				bastYear=i;
				tall=intNum.get(i)-backYear;
			}
			backYear=intNum.get(i);
		}System.out.println("가장 키가 많이 자란 년도는 "+
			(2012+bastYear-1)+"년 "+tall+"cm이다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}}
