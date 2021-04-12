package ch7;

public class DmbCellPhone2 extends CellPhone{
	int channel;
	
	public DmbCellPhone2(String model, String color,int channel) {
		super();//부모의 기본생성자 호출 1)
		this.channel = channel;
		this.color=color;
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
