package ch2;

// 증감연산자 : ++,-- => +1 or -1
// ++a, a++ / a--, --a
// ++a, --a : 다른 연산을 수행하기 전에 피연산자의 값을 +1 or -1 
// a++, a-- : 다른 연산을 수행한 후에 피연산자의 값을 +1 or -1 
public class IncreaseDecreaseEx1 {
	public static void main(String[] args) {
		//a=a+1; = a++, ++a
		
		int x=10, y=20;
		System.out.println(" x = "+x);
		System.out.println(" y = "+y);
		
		x++;
		y++;
		
		System.out.println(" x = "+x);
		System.out.println(" y = "+y);
		
	}

}
