package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class InputStreamReaderEx2 {
	public static void main(String[] args) {
		//filereaderex2에서 했던 방식과 비슷
	//읽어올파일 -> FileInputStream -> InputStreamReader -> 프로그램 처리
		//inputstreamreder 사용하는 이유는 string charsetName=>,"ms949" 와 같은 
		try(InputStreamReader fis=
				new InputStreamReader(new FileInputStream("c:\\test\\file1.txt"));
				FileWriter fos = new FileWriter("c:\\test\\output3.txt")) {
			int data=0;
			while((data=fis.read())!=-1) {
				//System.out.print((char)data);
				fos.write(data);
			}//버퍼를 사용해서 모아서 한꺼번에 사용
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
