package ch2;

public class IncreaseDecreaseEx2 {
	public static void main(String[] args) {
		int x =10;
		int y =10;
		int z;
		
		System.out.println("---------------");
		x++;
		++x;
		System.out.println("x = "+x);
		
		System.out.println("---------------");		
		y--;
		--y;		
		System.out.println("y = "+y);
		
		System.out.println("---------------");
		z=x++;//z=12,x=13 // =(대입연산자),++(증감연산자)
		//1.z=x; 2.x=x+1
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		
		System.out.println("---------------");
		z=++x;//z=14,x=14// =(대입연산자),++(증감연산자)
		//1.x=x+1; 2.z=x;
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		
		System.out.println("---------------");
		z= ++x + y++;//x=15 y=9 z=15+8=23 //대입연산자(=), 산술연산자(+), 증감연산자(++) //1.x=x+1; 2.z=x+y; 3.y=y+1;
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
	}
}
