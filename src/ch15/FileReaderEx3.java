package ch15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderEx3 {
	public static void main(String[] args) {
		//특정 소스파일을 읽어서 화면에 출력 => 읽는거는 reader
		//행번호 붙여서 출력
		File file= new File
				("D:\\Soldesk_file\\javasource\\basic2\\src\\ch1\\BooleanVariable1.java");
		try(FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);	
				) {
			
			String str=null;
			int i=1;
	         while((str = br.readLine()) != null){
	            System.out.println(i+" "+str);
	            i++;
	         }
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		} 
		
	}

