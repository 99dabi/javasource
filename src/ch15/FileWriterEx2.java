package ch15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterEx2 {
	public static void main(String[] args) {
		//키보드에서 입력을 받아들여 파일에 출력하는 프로그램 작성
		//조건  : 키보드에서 q가 입력되기 전까지 계속 받아들이도록 한다.
		
//		String str=null;
//		boolean run=true;
		try(	Scanner sc = new Scanner(System.in);
				FileWriter fw = new FileWriter("c:\\test\\FileWriterEx2.txt");
				BufferedWriter bw = new BufferedWriter(fw)		
				) {
			System.out.println("파일에 쓸 데이터를 입력해 주세요");
			System.out.println("중단하려면 q를 입력해 주세요");
//			while (run) {
//				str= sc.nextLine();
//				if(str.equals("q")) {
//					System.out.println("종료합니다.");
//					run=false;
//					break;
//				}else {
//					bw.write(str);
//					bw.write("\r\n");
//				}
//			}
			String input = null;
			do {
				System.out.print(">> ");
				input = sc.nextLine();
				
				bw.write(input);
				bw.newLine();
			}while(!input.equalsIgnoreCase("q"));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
