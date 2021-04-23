package sequence;

public class MemberVO {
	//메코드 하나와 동일한 모양
	private int userNo;
	private String userName;
	
	public MemberVO() {
		super();
	}
	public MemberVO(int userNo, String userName) {
		super();
		this.userNo = userNo;
		this.userName = userName;
	}
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "MemberVO [userNo=" + userNo + ", userName=" + userName + "]";
	}
	
	
}
