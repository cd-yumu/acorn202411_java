package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.DeptDto;
import test.dto.EmpDeptDto;
import test.util.DBConnector;

public class MainClass09 {

	public static void main(String[] args) {
		
		List<EmpDeptDto> list = getList();
		for(EmpDeptDto tmp:list) {
			System.out.printf("사원번호: %d, 사원이름: %s, 부서번호: %s, 부서이름: %s \n",
					tmp.getEmpno(), tmp.getEname(), tmp.getDeptno(), tmp.getDname());
		}
	}
	
	public static List<EmpDeptDto> getList(){
		List<EmpDeptDto> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			String sql = """
					SELECT EMPNO, ENAME, DEPTNO, DNAME AS deptname
					FROM EMP
					JOIN DEPT USING(DEPTNO)
				""";
			
			conn = new DBConnector().getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpDeptDto dto = new EmpDeptDto();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("deptname"));
				list.add(dto);		
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return list;
	}

}
