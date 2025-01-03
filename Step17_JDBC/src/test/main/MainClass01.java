package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass01 {

	public static void main(String[] args) {
		/*
		 *  java 로 oracle 에 scott/TIGER 계정으로 접속해서 
		 *  모든 사원의 사원번호, 사원 이름, 직업, 급여를 사원 이름으로 내림차순 정렬해서 출력
		 */
		
		//DB 연결객체를 담을 지역 변수 만들기
		Connection conn=null;
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "scott", "TIGER");
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 실행할 sql 문을 미리 준비하기 (java 10 부터 추가된 새로운 문자열 만드는 문법)
			String sql = """
				SELECT empno, ename, job, sal, hiredate
				FROM emp
				ORDER BY empno ASC
				""";
			
			String sql2 = """
				SELECT DEPTNO, DNAME, LOC 
				FROM DEPT
				""";
			
			String sql3 = """
				SELECT EMPNO, ENAME, DEPTNO, DNAME
				FROM EMP 
				JOIN DEPT USING(DEPTNO)
				ORDER BY EMPNO DESC
				""";
			
			// PreparedStatement 객체의 참조값 얻어오기
//			pstmt = conn.prepareStatement(sql); 
//			pstmt = conn.prepareStatement(sql2);
			pstmt = conn.prepareStatement(sql3);
			
//			prepareStatement 가 sql문을 대신 실행해주는 객체 (insert, delete ,....)
//			DQL 이다	select
//			SML 아니다. insert update delete

			
			
			// SELECT 문 실행하고 결과 값을 ReasultSet 으로 얻어내기
			rs = pstmt.executeQuery();
			
			// 반복문 돌면서
			while(rs.next()) {
//				int empno = rs.getInt("empno"); // 해당 컬럼 인텍스 맞는 값 반환
//				String ename = rs.getString("ename");
//				String job = rs.getString("job");
//				double sal = rs.getDouble("sal");
//				System.out.println(empno+"|"+ename+"|"+job+"|"+sal);
//				System.out.println(String.format("%d|%s|%s|%.2f", empno, ename, job, sal));
				
				
//				System.out.println(String.format("%d|%s|%s", rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc")));
				
//				System.out.println(String.format("%d|%s|%d|%s", rs.getInt("empno"), rs.getString("ename"), rs.getInt("deptno"), rs.getString("dname")));

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
