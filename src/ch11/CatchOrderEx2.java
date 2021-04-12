package ch11;

public class CatchOrderEx2 {
	public static void main(String[] args) {
		
//		try {//ArrayIndexOutOfBoundsException
//			String data1= args[0];
//			String data2= args[1];
//			//NumberFormatExeption
//			int op1 = Integer.parseInt(data1);
//			int op2 = Integer.parseInt(data2);
//			
//			System.out.println(op1+op2);
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		//Exception이 다잡아서 다른 예외는 필요 없음
////		catch (ArrayIndexOutOfBoundsException e) {			
////			e.printStackTrace();
////		}
//		finally {//finally는 예외와는 상관없이 무조건 적으로 실행
//			System.out.println("무조건 수행");
//		}
		
		try {//ArrayIndexOutOfBoundsException
			String data1= args[0];
			String data2= args[1];
			//NumberFormatExeption
			int op1 = Integer.parseInt(data1);
			int op2 = Integer.parseInt(data2);
			
			System.out.println(op1+op2);
		}
		
		//Exception이 다잡아서 다른 예외는 필요 없음
		catch (ArrayIndexOutOfBoundsException|NumberFormatException  e) {			
			//e.printStackTrace();
			System.out.println("매개인자의 개수를 확인하거나, 숫자로 변환이 가능한지 확인해 주세요.");
		}
		finally {//finally는 예외와는 상관없이 무조건 적으로 실행
			System.out.println("무조건 수행");
		}
		
	}		
}

