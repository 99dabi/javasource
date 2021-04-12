package ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataEx {
	public static void main(String[] args) {
		//date객체 생성시 현재 시간 날짜 다 보여줌
		Date date = new Date();
		System.out.println(date);//Fri Apr 09 10:05:03 KST 2021
		
		//패턴을 넣음 =>2021년 04월 09일 10:10:17 원하는 정보가 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyy년 MM월 dd일 hh:mm:ss");
		//System.out.println(sdf.format(date));
		System.out.println(sdf.format(new Date()));
	}
}
