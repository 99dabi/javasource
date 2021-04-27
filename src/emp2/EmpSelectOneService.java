package emp2;

import static emp.jdbcUtil.*;

import java.sql.Connection;

public class EmpSelectOneService {//service Class에서는 전달만 함
	
	public EmpVO getEmp(int empno) {
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		EmpVO vo = dao.selectOne(empno);
		//결과만 받으면 됨
		return vo;
		
	}
	
}
