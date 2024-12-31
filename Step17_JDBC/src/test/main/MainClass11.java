package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDTO;
import test.util.DBConnector;

public class MainClass11 {

	public static void main(String[] args) {
		
		int num = 2;
		String name = "해골";
		String addr = "행싱동";
		
		MemberDTO dto = new MemberDTO();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		
		if(update(dto)) {
			System.out.println("수정 완료");
		} else System.out.println("수정 실패");

	}
	
	/*
	 * 수정할 회원정보(번호, 이름, 주소)가 MemberDTO 객체에 담겨서 전달되는 메소드
	 * 성공 여부가 리턴되는 메소드
	 */
	
	public static boolean update(MemberDTO dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		
		try {
			conn = new DBConnector().getConn();
			
			String sql = """
				UPDATE MEMBER
				SET NAME = ?, ADDR = ?
				WHERE NUM = ?
				""";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			
			rowCount = pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null)conn.close();
				if(pstmt!=null)pstmt.close();
			}catch(Exception e) {}
		}
		
		if(rowCount>0) {
			return true;
		} else return false;
		
	}

}
