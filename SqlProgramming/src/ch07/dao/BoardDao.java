package ch07.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch07.dto.Board;

public class BoardDao {

	public Board selectByBno(int bno) {
		Connection conn=null;
		Board b = new Board();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			
			String sql ="select * from board where bno=?";
			PreparedStatement prtmt = conn.prepareStatement(sql);
			prtmt.setInt(1, bno);
			ResultSet rs = prtmt.executeQuery();
			
			if(rs.next())
			{
				
				b.setBno(rs.getInt("bno"));
				b.setBtitle(rs.getString("btitle"));
				b.setBcontent(rs.getString("bcontent"));
				b.setBwriter(rs.getString("bwriter"));
				b.setBhitcount(rs.getInt("bhitcount"));
				b.setBdate(rs.getDate("bdate"));
			}
			rs.close();
			prtmt.close();
		} catch (Exception e) {e.printStackTrace();}
		finally{try {conn.close();} catch (SQLException e) {	e.printStackTrace();	}}
		return b;
	}

	public List<Board> selectAll() {
			Connection conn=null;
			List<Board> bb = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			String sql="select * from board";
			PreparedStatement prtmt = conn.prepareStatement(sql);
			ResultSet rs= prtmt.executeQuery();
			
			while(rs.next())
			{
				Board b = new Board();
				b.setBno(rs.getInt("bno"));
				b.setBtitle(rs.getString("btitle"));
				b.setBcontent(rs.getString("bcontent"));
				b.setBwriter(rs.getString("bwriter"));
				b.setBhitcount(rs.getInt("bhitcount"));
				b.setBdate(rs.getDate("bdate"));
				bb.add(b);
			}
			rs.close();
			prtmt.close();
			
		} catch (Exception e) {e.printStackTrace();}
		finally{try {conn.close();} catch (SQLException e) {	e.printStackTrace();	}}
		return bb;
	}

}
