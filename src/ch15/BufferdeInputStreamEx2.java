package ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferdeInputStreamEx2 {//1의 간단버전
	public static void main(String[] args) {
		//읽어올 파일 =>FileInputStream=>버퍼=>프로그램 사용
		try(	BufferedInputStream bis = new BufferedInputStream
						(new FileInputStream("c:\\test\\Rolling.mp3"));
				BufferedOutputStream bos = new BufferedOutputStream
						(new FileOutputStream("c:\\test\\Rolling2.mp3"));
						) {
				//버퍼에 있는것 가져다가 쓴다.
			int data = 0;
			while((data=bis.read())!=-1) {
				bos.write(data);
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
