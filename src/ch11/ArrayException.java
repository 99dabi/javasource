package ch11;

public class ArrayException {
	public static void main(String[] args) {
		// ArrayException
		//int arr[]= new int[2];
		
		// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
		//System.out.println(arr[3]);
		if(args.length==2) {
		
		String data1= args[0];
		String data2= args[1];
		
		System.out.println("data = "+data1);
		System.out.println("data = "+data2);
		}		
	}
}
