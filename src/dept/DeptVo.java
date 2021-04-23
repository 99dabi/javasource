package dept;

public class DeptVo {

	
		//레코드 하나를 처리할 수 는 구조
		private int deptno;
		private String dname;
		private String loc;
		public DeptVo() {
			super();
		}
		public DeptVo(int deptno, String dname, String loc) {
			super();
			this.deptno = deptno;
			this.dname = dname;
			this.loc = loc;
		}
		public int getDeptno() {
			return deptno;
		}
		public void setDeptno(int deptno) {
			this.deptno = deptno;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		public String getLoc() {
			return loc;
		}
		public void setLoc(String loc) {
			this.loc = loc;
		}
		@Override
		public String toString() {
			return "DeptVo [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
		}
		
	

}
