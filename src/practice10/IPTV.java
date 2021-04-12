package practice10;

public class IPTV extends ColorTV {
	String ip;
	public IPTV(int size, int color,String ip) {
		super(size, color);
		this.ip=ip;
	}
	@Override
	public void printProperty() {
		System.out.print("나의 IPTV는 "+ip+" 주소의 ");
		super.printProperty();
	}
}
