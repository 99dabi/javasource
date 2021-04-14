package ch15;

import java.io.FileWriter;

public class FileWriterEx {
	public static void main(String[] args) {
		//FileWriterEx
		try (FileWriter writer = new FileWriter("c:\\test\\output1.txt",true)){
			//원래는 새로 써야 하는데 boolean 형이 true면 뒤에 붙여서 작성됨
			// \r\n : 엔터
			// .write => String 처리가 간단해 진다.
			writer.write("FileWriter는 한글로 된 \r\n");
			writer.write("문자열을 바로 출력 가능 \r\n");
			writer.write("Writer 클래스는 문자 단위\r\n");
			writer.write("출력만 가능");
		} catch (Exception e) {	
		}
	}
}
