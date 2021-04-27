package user;

public class UserVO {
	
	private int NO;
    private String username;
    private int birthyear;
    private String addr;
    private String mobile;
	
    public UserVO() {
		super();
	}
	public UserVO(int nO, String username, int birthyear, String addr, String mobile) {
		super();
		NO = nO;
		this.username = username;
		this.birthyear = birthyear;
		this.addr = addr;
		this.mobile = mobile;
	}
	
	public int getNO() {
		return NO;
	}
	public void setNO(int nO) {
		NO = nO;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "UserVO [NO=" + NO + ", username=" + username + ", birthyear=" + birthyear + ", addr=" + addr
				+ ", mobile=" + mobile + "]";
	}
    
    
    
}
