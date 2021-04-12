package ch12;

import static java.lang.Math.*;

public class MathEx {
	public static void main(String[] args) {
		double val= 90.7552;
		
		//math는 안에 가지고 있는게 static이라서 앞에 클레스 없이 
		//사용가능
		
		System.out.println("round : "+Math.round(val));//반올림
		System.out.println("ceil : "+Math.ceil(1.1));//올림
		System.out.println("floor : "+Math.floor(1.5));//내림
		System.out.println("round : "+Math.round(-1.5));
		System.out.println("floor : "+Math.ceil(-1.5));
		System.out.println("floor : "+Math.floor(-1.5));
		
	}
}
