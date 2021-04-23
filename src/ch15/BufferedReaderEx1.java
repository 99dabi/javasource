package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderEx1 {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("c:\\test\\file1.txt");
				//글자 처리할때 BufferedReader 사용하면 좋은점 => readLine()-줄단위로 읽어오는거 
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("c:\\test\\output5.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				
				) {
			String str = null;
			while((str=br.readLine())!=null) {
				bw.write(str);
				bw.newLine();//엔터
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}	
}
