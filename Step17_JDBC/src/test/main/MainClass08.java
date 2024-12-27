package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.DeptDto;
import test.util.DBConnector;

public class MainClass08 {

	public static void main(String[] args) {
		
		List<DeptDto> list = getList();
		for(DeptDto tmp:list) {
			System.out.printf("부서번호: %d, 부서명: %s, 부서의 위치: %s \n",
					tmp.getDeptno(), tmp.getDname(), tmp.getLoc());
		}
	}
	
	public static List<DeptDto> getList(){
		List<DeptDto> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			String sql = """
					SELECT deptno, dname, loc
					FROM dept
				""";
			
			conn = new DBConnector().getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				DeptDto dto = new DeptDto();
				dto.setDeptno(deptno);
				dto.setDname(dname);
				dto.setLoc(loc);
				
				list.add(dto);		
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return list;
	}

}
