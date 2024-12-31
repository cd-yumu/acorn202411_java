package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.FoodDto;
import util.DBConnector;

public class FoodDao {
	
	public boolean insert(FoodDto dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;

		try {
			conn = new DBConnector().getConn();
			String sql = """
					INSERT INTO food
					(id, REGDATE, CATEGORY, MENU, PRICE, REVIEW)
					VALUES(FOOD_SEQ.NEXTVAL,TO_DATE(?,'YYYY-MM-DD'), ?, ?, ?, ?)
					""";

			pstmt = conn.prepareStatement(sql);
			
			// binding
			pstmt.setString(1, dto.getRegdate());
			System.out.println("바인딩된 날짜: " + dto.getRegdate());
			pstmt.setString(2, dto.getCategory());
			pstmt.setString(3, dto.getMenu());
			pstmt.setInt(4, dto.getPrice());
			pstmt.setString(5, dto.getReview());
			
			// 쿼리 실행 후 결과 row 개수 저장
			rowCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		if (rowCount > 0)
			return true;
		else
			return false;
		
	}
	
	public boolean update(FoodDto dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;

		try {
			conn = new DBConnector().getConn();
			String sql = """
					UPDATE FOOD
					SET REGDATE = TO_DATE(?,'YYYY-MM-DD'), CATEGORY = ?, MENU = ?, PRICE = ?, REVIEW = ?
					WHERE ID = ?
					""";

			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getRegdate());
			pstmt.setString(2, dto.getCategory());
			pstmt.setString(3, dto.getMenu());
			pstmt.setInt(4, dto.getPrice());
			pstmt.setString(5, dto.getReview());
			pstmt.setInt(6, dto.getId());
			
			rowCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		if (rowCount > 0)
			return true;
		else
			return false;
		
	}
	
	public boolean delete(int id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;

		try {
			conn = new DBConnector().getConn();
			String sql = "DELETE FROM FOOD WHERE ID = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rowCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		if (rowCount > 0)
			return true;
		else
			return false;
	}
	
	public FoodDto getData(int id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FoodDto dto = null;

		try {
			conn = new DBConnector().getConn();
			String sql = "SELECT * FROM FOOD WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto = new FoodDto();
				dto.setId(id);
				dto.setRegdate(rs.getString("regdate"));
				dto.setCategory(rs.getString("category"));
				dto.setMenu(rs.getString("menu"));
				dto.setPrice(rs.getInt("price"));
				dto.setReview(rs.getString("review"));				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return dto;
		
	}
	
	public List<FoodDto> getList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<FoodDto> list = new ArrayList();

		try {
			conn = new DBConnector().getConn();
			String sql = "SELECT * FROM FOOD ORDER BY REGDATE ASC";

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				FoodDto dto = new FoodDto();
				dto.setId(rs.getInt("id"));
				dto.setCategory(rs.getString("category"));
				dto.setMenu(rs.getString("menu"));
				dto.setPrice(rs.getInt("price"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setReview(rs.getString("review"));
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return list;
	}

}
