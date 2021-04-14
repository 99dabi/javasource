package ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamEx6 {
	public static void main(String[] args) {
//		FileInputStream fis=null;
//		FileOutputStream out=null; 
//		try {
//			//음악파일 옮기기
//			//바이트 기반 파일 읽기=>FileInputStream
//			File f = new File("c:\\test\\Rolling.mp3");
//			fis= new FileInputStream(f);
//			//바이트 기반 파일 출력
//			//f를 읽어 test20에 저장
//			out =new FileOutputStream("c:\\test\\Rolling2.mp3");
//			
//			fis.read();
//			byte b[]= new byte[100];
//			while((fis.read(b))!=-1) {
//				out.write(b);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				fis.close();
//				out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			};			
//		}
		File f = new File("c:\\test\\Rolling.mp3");
		try(FileInputStream fis= new FileInputStream(f);
				FileOutputStream out=new FileOutputStream
						("c:\\test\\Rolling2.mp3"); ) {
			fis.read();
			byte b[]= new byte[100];
			while((fis.read(b))!=-1) {
				out.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
