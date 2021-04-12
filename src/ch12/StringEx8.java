package ch12;

public class StringEx8 {
	public static void main(String[] args) {
		String str="12345";
		//출력문이 1+2+3+4+5 =
		int sum =0;
		for(int i=0;i<str.length();i++) {
			//'1','2','3','4','5' =>"1","2","3","4","5"=>1,2,3,4,5
			sum+=Integer.parseInt(String.valueOf(str.charAt(i))); 
		}	
		System.out.println(sum);
	}
}
