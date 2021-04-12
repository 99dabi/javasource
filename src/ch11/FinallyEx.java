package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyEx {
	public static void main(String[] args) {
		//FileNotFoundException => Checkde Exeption : 쓰자마자 알려줌
		
		//자동으로 자원닫기
		try(FileInputStream fis = new FileInputStream("input.txt");
				FileOutputStream fos = new FileOutputStream("");) {	
			//변수선언을 try블록을 넣으면
		} catch (Exception e) {
			e.printStackTrace();
		}
//		finally {//예외 여부와 상관없이 무조건 수행 - 자원 해제
//			//IOException=>
//			try {
//				fis.close();//자원을 안닫아도 오류나지는 않음  
//				fos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
	}
}
