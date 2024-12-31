package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import test.dto.MemberDTO;
import test.util.DBConnector;

public class MainClass13 {

	public static void main(String[] args) {
		int num = 2;
		MemberDTO dto = getData(num);
		if(dto == null) System.out.println("해당 정보가 없습니다.");
		else System.out.printf("num: %d, name: %s, addr: %s", dto.getNum(), dto.getName(), dto.getAddr());
	}
	
	/*
	 * 매개변수로 전달되는 번호에 해당하는 회원 정보를 select 해서 
	 * MemberDto 객체에 담아서 리턴해주는 메소드
	 */
	
	public static MemberDTO getData(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDTO dto = null;
		
		try {
			conn = new DBConnector().getConn();
			String sql = """
				SELECT * 
				FROM MEMBER
				WHERE NUM = ?
				""";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new MemberDTO();
//				dto.setNum(num);
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		return dto;
	}

}
