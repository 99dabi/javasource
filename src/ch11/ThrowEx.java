package ch11;

public class ThrowEx {
	public static void main(String[] args) {
		int arr[] = new int[0];
		
		try {
			System.out.println("합계 : "+getTotal(arr));
			System.out.println("평균 : "+getAverage(arr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static double getAverage(int arr[]) throws Exception {
		if(arr.length==0) {
			//강제 예외 발생
			throw new Exception("비어 있는 배열입니다.");//강제로 예외를 발생시킵니다.
		}return getTotal(arr)/arr.length;
	}
	static int getTotal(int arr[]) throws Exception {//나를 호출한 곳으로 예외룰 던지겠다
		if(arr.length==0) {
			throw new Exception("비어 있는 배열입니다.");
		}int total=0;
		for(int num:arr) {
			total+=num;
		}
		return total;
	}
}
