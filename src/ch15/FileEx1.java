package ch15;

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) {
		//생성시에는 있건 없건 오류가 나지 않는다.
		//오류는 접근하는 시점에 나타난다.
		// \t, \n, 폴더 구분 : \\,/ 
		File f1 = new File("c:\\exam\\test1.txt");
		f1.getName();
		//File(File parent, String child)
		File f2 = new File("c:\\temp","test1.txt");
		
		File parent = new File("c:\\temp");
		File f3 = new File(parent,"test1.txt");
		
		
	}
}
