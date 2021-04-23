package emp;

import java.sql.Connection;
import java.util.List;
import static emp.jdbcUtil.*;
public class EmpSelectService {
	public List<EmpVO> getEmpList(){
		
		Connection con = getConnection();//static으로 끌고 오명 형식 안해도됨
		//Connection con = jdbcUtil.getConnection();//맞는 형식인데 
		
		//트랜잭션 처리를 위해서 Connection 객체를 서비스 클래스에서 생성
		//트랜잭션은 커넥션 단위로 처리
		EmpDAO dao = new EmpDAO(con);
		
		List<EmpVO> list= dao.select();
		
		close(con);
		return list;
	}
}
