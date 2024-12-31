package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnector;

public class MainClass12 {

	public static void main(String[] args) {
		
		// 삭제할 num
		int num = 1;
		
		if(delete(num))System.out.println("삭제 성공");
		else System.out.println("삭제 실패");

	}
	
	// 매개변수로 전달되는 회원의 번호를 이용해서 회원 한명의 정보를 삭제하고 성공여부를 리턴아는 메소드
	public static boolean delete(int num) {
		
		// 선언 및 초기화
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		
		try {
			conn = new DBConnector().getConn();
			
			String sql = "DELETE FROM MEMBER WHERE NUM = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rowCount = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstmt!=null)pstmt.close();
			}catch(Exception e) {}
			
			
		}
		
		if(rowCount>0) return true;
		else return false;
		
	}

}
