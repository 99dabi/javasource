package ch15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReaderEx1 {
	public static void main(String[] args) {
		//Reader / Writer => 문자 단위
		//InputStream/OutputStream =>바이트 단위 
		FileReader reader =null;
		try {
			//reader = new FileReader("c:\\test\\file1.txt");
			reader = new FileReader("c:\\test\\file1.txt",
					Charset.forName("ms949"));
			int ch=0;
			while((ch=reader.read())!=-1) {
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
