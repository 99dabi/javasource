package practice10;

public abstract class OddDetector {
	
	private int n;
	
	public OddDetector(int n) {
		this.n=n;
	}
	protected int getN() {
		return n;
	}
	public boolean isOdd() {
		if(n%2==0) {
			return false;
		}
		return true;
	}
}
