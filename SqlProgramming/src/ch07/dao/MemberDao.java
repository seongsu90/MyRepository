package ch07.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch07.dto.Member;


public class MemberDao {

	public Member selectByMid(String mid) {
		Connection conn=null;
		Member m = new Member();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			String sql = "select * from member where mid=?";
			PreparedStatement prtmt = conn.prepareStatement(sql);
			prtmt.setString(1, mid);
			ResultSet rs = prtmt.executeQuery();
			
			if(rs.next())
			{
				
				m.setMid(rs.getString("mid"));
				m.setMname(rs.getString("mname"));
				m.setMage(rs.getInt("mage"));
				m.setMbirth(rs.getDate("mbirth"));
				
				}
					
			rs.close();
			prtmt.close();
		} catch (Exception e) {e.printStackTrace();	}
		finally{
			try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
		
		return m;
	}

	public List<Member> selectAll() {
			Connection conn=null;
			List<Member> m2 = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			String sql = "select * from member";
			PreparedStatement prtmt = conn.prepareStatement(sql);
			ResultSet rs = prtmt.executeQuery();
			
			while(rs.next())
			{
				Member m = new Member();
				m.setMid(rs.getString("mid"));
				m.setMname(rs.getString("mname"));
				m.setMage(rs.getInt("mage"));
				m.setMbirth(rs.getDate("mbirth"));
				m2.add(m);
			}
			rs.close();
			prtmt.close();
		} catch (Exception e) {e.printStackTrace();}
		finally{try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		return m2;
	}
	
	
}
