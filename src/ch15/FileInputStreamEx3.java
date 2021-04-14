package ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamEx3 {
	public static void main(String[] args) {
//		FileInputStream fis=null;
//		OutputStream out=null; 
//		try {
//			//바이트 기반 파일 읽기=>FileInputStream
//			File f = new File("c:\\test\\file1.txt");
//			fis= new FileInputStream(f);
//			//바이트 기반 화면 출력
//			out = System.out;
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
		
		File f = new File("c:\\test\\file1.txt");
		try(FileInputStream fis= new FileInputStream(f);
				OutputStream out=System.out; ) {
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
