package ch15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
		//new Scanner()
		//byte기반/키보드
		InputStream in= System.in;
		//바이트기반/화면
		OutputStream out = System.out;
		
		//입력 스트림에서 한 바이트씩 읽어오기
		try {//코딩을 하자마자 알려주면 = 체크드 익셉션
			int input=in.read();
			//System.out.println((char)input);//문자 보고싶어서 형변환
			out.write(input);//형변환이 필요 없음
			
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
