package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	
	// DB 연결 후 Connection 객체 리턴 메소드
	public Connection getConn() {
		Connection conn = null;
		// DB 와 연결하기
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"acorn", "acorn1234");
			System.out.println("Oracle DB - ACORN 계정 접속 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		// Connection 객체 리턴
		return conn;
	}
	
	
}
