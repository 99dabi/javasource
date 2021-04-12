package ch3;

import java.io.IOException;

public class WhileEx5 {

	public static void main(String[] args) throws IOException {
		//
		boolean run = true;
		int speed=0, keyCode=0;
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("=============");
				System.out.println("1.종속|2.감속|3.중지");
				System.out.println("=============");
				System.out.println("선택 : ");
			}
			keyCode =System.in.read();
			//스캐너를 쓰지 않고 사용 키보드 사용하는 방법 
			//.read()=int로 받아서 돌려줌
			
			if(keyCode==49) {
				speed++;
				System.out.println("현재속도 ="+speed);
			}
			else if(keyCode==50) {
				speed--;
				System.out.println("현재속도 ="+speed);
			}else if(keyCode==51) {
				run=false;
				System.out.println("현재속도 ="+speed);
			}
		}System.out.println("시스템 종료");

	}

}
