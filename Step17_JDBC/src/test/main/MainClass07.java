package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.EmpDto;
import test.dto.MemberDTO;
import test.util.DBConnector;

public class MainClass07 {

	public static void main(String[] args) {
		// 회원 목록을 아주 쉽게 얻어낼 수 있다. (날로 먹을 수 있다.)
		List<EmpDto> list = getList();
		for(EmpDto tmp:list) {
			System.out.printf("번호: %d, 이름: %s, 직업: %s, 급여: %.2f",
					tmp.getEmpno(), tmp.getEname(), tmp.getJob(), tmp.getSal());
			System.out.println();
		}
	}
	
	public static List<EmpDto> getList(){
		// 리턴해줄 객체를 미리 생성하기
		List<EmpDto> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			// DB 와 연결해서 회원 목록 불러오고
			conn = new DBConnector().getConn();
			String sql = """
				SELECT empno, ename, job, sal
				FROM emp
				ORDER BY empno ASC
				""";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				double sal = rs.getDouble("sal");
				// SELECT 된 ROW 하나의 정보를 MemberDto 객체에 담는다.
				EmpDto dto = new EmpDto();
				dto.setEmpno(empno);
				dto.setEname(ename);
				dto.setJob(job);
				dto.setSal(sal);
				// 회원 한명의 정보가 담긴 MemberDTO 객체를 ArrayList 객체에 누적시킨다.
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
