package ch10;
public class inputInterface implements AdderInterface {
	int sum;	
	@Override
	public int add(int a,int b) {
		return a+b;
	}
	@Override
	public int add(int n) {
		if(n>0) {
			for(int i=1;i<n;i++) {
				sum+=n;
			}			
		}else {
			System.out.println("숫자를 잘못입력했습니다.");
		}
		return sum;
	}
}
