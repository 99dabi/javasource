package ch12;

public class WrapperEx1 {
	public static void main(String[] args) {
		//기본타입 -  int ,  byte short,long, char,   float, bouble,boolean
		//참조타입 - Integer,Byte,Short,Long,Character,Float,Double,Boolean
		int val=10;
		Integer i = Integer.valueOf(val);
		Integer i2 = Integer.valueOf(10);//String.valueOf(10.4)
		
		int a = Integer.parseInt("10");
		
		double d=Double.parseDouble("3.141592");
		
		Character c = Character.valueOf('c');
		
		Boolean b = Boolean.valueOf("true");
		
		Integer i3 =10;//auto boxing//형을 자동으로 정해주는
		
		int val2= i3;//auto UnBoxing
				
	}
}
