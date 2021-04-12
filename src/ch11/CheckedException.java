package ch11;

public class CheckedException {

	public static void main(String[] args) throws ClassNotFoundException {
		//컴파일 예외 - CheckedException
		//ClassNotFoundException

		findClass();
		
	}
	static void findClass() throws ClassNotFoundException{//넘기는 코드
		Class.forName("");
	}
}
