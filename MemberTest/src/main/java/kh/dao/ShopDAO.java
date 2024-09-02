package kh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kh.dto.ShopMember;

public class ShopDAO {
	
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public ShopMember selectMember(Connection conn, String memberId){
		
		ShopMember sm = null; // 결과 저장용 변수
		
		try {
			String sql = "SELECT * FROM SHOP_MEMBER WHERE MEMBER_ID = ?"; // sql 작성
			pstmt = conn.prepareStatement(sql); // PreparedStatement 객체 생성
			
			// sql 수행 후 결과 반환 받기
			rs = pstmt.executeQuery();
			
			if(rs.next()) { 
				String id = rs.getString("MEMBER_ID");
				String pw = rs.getString("MEMBER_PW");
				String phone = rs.getString("PHONE");
				String gender = rs.getString("GENDER");
				// 각 컬럼의 값 얻어오기
				
				sm = new ShopMember(id,pw,phone,gender); 
				// 조회된 컬럼값을 이용해 sm 객체 생성
			}
		}catch(SQLException e) { // sql 구문 오류 / 글자 수 넘어가는거 포함?
			e.printStackTrace();// 이걸 작성해줘서 여기서 굳이 sql구문을 완성 안
								// 시켜도 되는건가? - 이건 아닌듯 ㅇㅇ..
			
		}catch(Exception e) { // 해줘야되나 ??.?.?.?.?
			e.printStackTrace();
		} // close 해줬어야됐나..? 어차피 dao 재사용안하니까 안 해줘도 되나..?
		
		return sm;
	}
}
