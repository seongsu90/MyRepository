package com.mycompany.myapp.exam13.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.exam13.dto.Member;


@Component
public class Exam13MemberDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Member member){
		String sql="insert into member(mid,mname,mpassword,mage,mbirth) values(?, ?, ?, ?, ?)";
		int rowNo=jdbcTemplate.update(
				sql,
				member.getMid(),
				member.getMname(),
				member.getMpassword(),
				member.getMage(),
				member.getMbirth()
				);
		return rowNo;
	}

	
	public Member selectByMid(String mid){
		String sql="select mid,mname,mpassword,mage,mbirth from member where mid=?";
		
		List<Member> list = jdbcTemplate.query(
				sql,
				new Object[] {mid},
				new RowMapper<Member>(){
					@Override
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
							// mapRow는 결과의 행의 수만큼 생성(실행)된다. 
							Member member = new Member();
							member.setMid(rs.getString("mid"));
							member.setMname(rs.getString("mname"));
							member.setMpassword(rs.getString("mpassword"));
							member.setMage(rs.getInt("mage"));
							member.setMbirth(rs.getDate("mbirth"));
						return member;
					}
				}
				);
		return (list.size()!=0)?list.get(0):null; //mid가 pk이기 때문에 조건이 만족했다면 하나의 객체 리턴, 만족하지 못했다면 null 리턴
		
	}
	
	/*	public List<Member> selectByMname(String mname) throws SQLException{
		String sql ="select mid,mname,mpassword,mage,mbirth from member where mname like ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		List<Member> memList = new ArrayList<>(); //관례로 보내는것이다. 그래서 null 초기화가 아니고 생성한다.
		pstmt.setString(1, "%"+mname+"%");
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next())
		{
			Member member = new Member();
			member.setMid(rs.getString("mid"));
			member.setMname(rs.getString("mname"));
			member.setMpassword(rs.getString("mpassword"));
			member.setMage(rs.getInt("mage"));
			member.setMbirth(rs.getDate("mbirth"));
			memList.add(member);
		}
		rs.close();
		pstmt.close();
		return memList;
	}
	
	public int update(Member member) throws SQLException{
		String sql ="update member set mname=?,mpassword=?,mage=?,mbirth=? where mid=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);	
		pstmt.setString(1, member.getMname());
		pstmt.setString(2, member.getMpassword());
		pstmt.setInt(3, member.getMage());
		pstmt.setDate(4, new Date(member.getMbirth().getTime()));
		pstmt.setString(5, member.getMid());
		
		int rowNo = pstmt.executeUpdate();
		pstmt.close();
		return rowNo;
	}
	
	public int deleteByMid(String mid) throws SQLException //삭제된 행수를 리턴하기때문에 int형
	{
		String sql ="delete member where mid=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, mid);
		int rowNo = pstmt.executeUpdate();
		pstmt.close();
		return rowNo;
	}*/
}

