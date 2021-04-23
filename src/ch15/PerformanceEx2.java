package ch15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class PerformanceEx2 {
	public static void main(String[] args) {
		// BufferedinputStream + FileInputStream 
		//VS BufferedinputStream + FileInputStream+read배열
		try(FileInputStream fis = new FileInputStream("c:\\test\\picture.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis)
				){
			long start = System.currentTimeMillis();
			while(bis.read()!=-1) {
				
			}long end = System.currentTimeMillis();
			System.out.println("BufferedinputStream +	FileInputStream 사용시 : "
			+(end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("c:\\test\\picture.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis)
				
				){
			byte buf[]= new byte[4096];
				long start = System.currentTimeMillis();
				while(bis.read(buf)!=-1) {
					
				}long end = System.currentTimeMillis();
				System.out.println("BufferedinputStream + FileInputStream+read배열 사용시 : "
				+(end-start));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
}
