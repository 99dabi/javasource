package ch11;

public class NumberExcepction {
	public static void main(String[] args) {
		String data1="100";
		String data2 = "100a";
		
		int value1 = Integer.parseInt(data1);
		//(NumberExcepction.java:9)
		int value2 = Integer.parseInt(data2);
		
		System.out.println(value1+value2);
	}
}
