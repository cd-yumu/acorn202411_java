package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDTO;
import test.util.DBConnector;

public class MainClass06 {

	public static void main(String[] args) {
		// 회원 목록을 아주 쉽게 얻어낼 수 있다. (날로 먹을 수 있다.)
		List<MemberDTO> list = getList();
		for(MemberDTO tmp:list) {
			System.out.printf("번호: %d, 이름: %s, 주소: %s",
					tmp.getNum(), tmp.getName(), tmp.getAddr());
			System.out.println();
		}
	}
	
	public static List<MemberDTO> getList(){
		//여기에 어떻게 코딩하면 회원 목록 List<MemberDto>를 리턴해줄 수 있을까? 코딩해보세요
		
		// 리턴해줄 객체를 미리 생성하기
		List<MemberDTO> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			// DB 와 연결해서 회원 목록 불러오고
			conn = new DBConnector().getConn();
			String sql = """
				SELECT num, name, addr
				FROM member
				""";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				// SELECT 된 ROW 하나의 정보를 MemberDto 객체에 담는다.
				MemberDTO dto = new MemberDTO();
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
				// 회원 한명의 정보가 담긴 MemberDTO 객체를 ArrayList 객체에 누적시킨다.
				list.add(dto);
			}
		}catch(Exception e) {}
		
		return list;
	}
}
