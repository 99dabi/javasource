package ch15;

import java.io.IOException;
import java.io.InputStream;

public class SystemInEx {
	//메인 호출하는 애한테 처리하라고 해라
	public static void main(String[] args) throws IOException {
		System.out.println("============메뉴=============");
		
		System.out.println("1.예금조회");
		System.out.println("2.예금출금");
		System.out.println("3.예금입금");
		System.out.println("4.종료");
		System.out.print("메뉴선택 : ");
		
		InputStream in = System.in;
		
		char input=(char)in.read();//예외처리 나는 친구라 던짐
		
		switch (input) {
		case '1':
			System.out.println("예금 조회 선택");
			break;
		case '2':
			System.out.println("예금 츨금 선택");
			break;
		case '3':
			System.out.println("예금 입금 선택");
			break;
		case '4':
			System.out.println("종료 선택");
			break;

		default:
			break;
		}
	}
}
