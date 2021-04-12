package ch5;

public class MiniCalc {
	int plus(int x, int y) {
		return x+y; // ④ 17
	}	
	double avg(int x, int y) {// x=7, y=10
		double sum = plus(x,y); // ③ plus(x,y)  ⑤ sum=17
		return sum/2;  // ⑥ 17/2
	}	
	void execute() { //①
		double result = avg(7,10); // ② avg(7,10); //⑦ 8.5
		println("실행 결과 : "+result); 
	}	
	void println(String message) {//⑧
		System.out.println(message); //⑨ 
	}
}
