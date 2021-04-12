package ch3;

public class ForEx11 {

	public static void main(String[] args) {
		//1~10 사이의 숫자로 4x+5y=60의 해를 구해서 (x,y)형태로 출력하기	
		for(int x=1;x<=10;x++) {
			for(int y=1;y<=10;y++) {
				if(4*x+5*y==60) {
					System.out.printf("(%d,%d)",x,y); 
				}
			}
		}
	}
}
