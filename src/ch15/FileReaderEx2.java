package ch15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReaderEx2 {
	public static void main(String[] args) {

		FileReader reader =null;
		FileWriter writer= null;
		try {
			reader = new FileReader("c:\\test\\output1.txt"
					,Charset.forName("ms949"));
			writer = new FileWriter("c:\\test\\output2.txt");
//			int ch=0;
//			while((ch=reader.read())!=-1) {
//				writer.write(ch);
//			}
			//배열로 처리
			char[] ch = new char[1024];
			while(reader.read(ch)!=-1) {
				writer.write(ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
				writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
