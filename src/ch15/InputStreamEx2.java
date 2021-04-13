package ch15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx2 {
	public static void main(String[] args) {
		//new Scanner()
		
		//byte기반/키보드
				InputStream in= System.in;
				//바이트기반/화면
				OutputStream out = System.out;
		
		int input=0;
		//입력 스트림에서 한 바이트씩 읽어오기
		try {//코딩을 하자마자 알려주면 = 체크드 익셉션
			while((input=in.read())!=-1) {
				//System.out.println((char)input);
				out.write(input);
			}//read 1번째 거
			in.close();
			out.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
