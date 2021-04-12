package ch4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EnumEx1 {
	public static void main(String[] args) {
		Week today = null;
		
		//오늘 날자 출력
		LocalDate now = LocalDate.now();
		//System.out.println(now);
		
		//날짜 연산 오늘에 해당하는 숫자 확인하기
		DayOfWeek week = now.getDayOfWeek();
		//System.out.println(week.getValue());//1(월요일)~7 (일요일)
		
		//
		switch (week.getValue()) {
		case 1:
			today = Week.MONDAY;//"월" enum타입으로 제한시킴
			break;
		case 2:
			today = Week.TUESDAY;
			break;
		case 3:
			today = Week.WENDSDAY;
			break;
		case 4:
			today = Week.THURSDAY;
			break;
		case 5:
			today = Week.FRIDAY;
			break;
		case 6:
			today = Week.SATURDAY;
			break;
		default:
			today = Week.SUNDAY;
			break;
		}
		System.out.println("오늘은 "+today+"요일입니다.");
		if(today==Week.SUNDAY) {
			System.out.println("일요일은 쉬는날!!");			
		}else {
			System.out.println("자바공부 하는날");
		}
	}
}
