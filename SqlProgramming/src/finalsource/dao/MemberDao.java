package finalsource.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import finalsource.dto.Member;

public class MemberDao {
	private Connection conn;
	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public int insert(Member member) throws SQLException{
		String sql="insert into member(mid,mname,mpassword,mage,mbirth) values(?, ?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.getMid());
		pstmt.setString(2, member.getMname());
		pstmt.setString(3, member.getMpassword());
		pstmt.setInt(4, member.getMage());
		pstmt.setDate(5, new Date(member.getMbirth().getTime()));
		
		int rowNo = pstmt.executeUpdate();
		pstmt.close();
		return rowNo;
	}
	
	public Member selectByMid(String mid)throws SQLException{
		String sql="select mid,mname,mpassword,mage,mbirth from member where mid=?";
		Member member = null;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, mid);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next())
		{
			member = new Member();
			member.setMid(rs.getString("mid"));
			member.setMname(rs.getString("mname"));
			member.setMpassword(rs.getString("mpassword"));
			member.setMage(rs.getInt("mage"));
			member.setMbirth(rs.getDate("mbirth"));
		}
		rs.close();
		pstmt.close();
		
		return member;
	}
	
	public List<Member> selectByMname(String mname) throws SQLException{
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
	}
}

