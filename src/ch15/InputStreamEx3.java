package ch15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx3 {
	public static void main(String[] args) {
		//byte기반/키보드
		InputStream in= System.in;
		//바이트기반/화면
		OutputStream out = System.out;
		
		int input=0;
		byte[] b = new byte[100];
		//read 사용시  byte 배열 사용해야함
		//byte배열
		try {
			//입력 스트림에서 지정된 byte 수만큼 읽어오기
			while((in.read(b))!=-1) {
				//System.out.println(b);//주소값
				out.write(b);
			}//read 1번째 거
			
			in.close();
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
