package practice10;

import java.util.Scanner;


public class CalcEx {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 >> ");
		int x=Integer.parseInt( sc.nextLine());
		System.out.println("두번째 수 >> ");
		int y= Integer.parseInt( sc.nextLine());
		System.out.println("연산지 입력 >> ");
		
		String cal=sc.nextLine();
		System.out.println(cal);
		switch (cal) {
		case "+":
			Calc add = new Add(x,y);
			System.out.println(add.calculate());
			break;
		case "-":
			Calc sub = new Sub(x,y);
			System.out.println(sub.calculate());
			break;
		case "*":
			Calc mul = new Mul(x,y);
			System.out.println(mul.calculate());
				break;
		case "/":
			Calc div = new Div(x,y);
			System.out.println(div.calculate());
			break;
		}
	}
	
}
