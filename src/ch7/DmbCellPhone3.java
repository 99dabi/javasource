package ch7;

public class DmbCellPhone3 extends CellPhone2{
	
	int channel;
	//기본 생성자 있음 => public DmbCellPhone3(){super()}
	
	public DmbCellPhone3(String model, String color,int channel) {
		super(model, color);
		this.channel=channel;
	}		
	
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 dmb방송 시작");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널"+channel+"번으로 변경");
	}
	void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
}
