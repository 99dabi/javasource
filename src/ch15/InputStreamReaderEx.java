package ch15;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
	public static void main(String[] args) {
	//읽어올파일 -> FileInputStream -> InputStreamReader -> 프로그램 처리
		//inputstreamreder 사용하는 이유는 string charsetName=>,"ms949" 와 같은 
		try(InputStreamReader fis=new InputStreamReader
				(new FileInputStream("c:\\test\\file1.txt"));) {
			int data=0;
			while((data=fis.read())!=-1) {
				System.out.print((char)data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
