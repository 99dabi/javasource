package ch11;

public class CatchOrderEx {
	public static void main(String[] args) {
		//try : exception이 나는 코드 
		//catch : exception 받아서 처리하는 
		//finally : exception 발생시 프로그램이 반드시 실행해야 하는 코드
//		try {//try는 혼자 못온다.
//			String data1= args[0];
//			String data2= args[1];
//			
//			System.out.println("data = "+data1);
//			System.out.println("data = "+data2);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			//개발할 때 주로 사용
//			// TODO: handle exception
//			//e.printStackTrace();
//			//오류에 대한 메세지 확인
//			System.out.println(e.getMessage());
//			System.out.println("배열의 갯수를 확인해 보세요");
//		}
		
		try {
			
		} finally {
			// TODO: handle finally clause
		}
		
		try {//ArrayIndexOutOfBoundsException
			String data1= args[0];
			String data2= args[1];
			//NumberFormatExeption
			int op1 = Integer.parseInt(data1);
			int op2 = Integer.parseInt(data2);
			
			System.out.println(op1+op2);
		} catch (ArrayIndexOutOfBoundsException e) {			
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}finally {//finally는 예외와는 상관없이 무조건 적으로 실행
			System.out.println("무조건 수행");
		}
		}		
	}

