package ch08.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

import ch08.dto.Board;

public class BoardDao {

	public void insert(Board b) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			String sql ="insert into board(bno,btitle,bcontent,bwriter,bhitcount,bdate) values(?,?,?,?,?,?)";
			PreparedStatement prtmt = conn.prepareStatement(sql);
			prtmt.setInt(1, b.getBno());
			prtmt.setString(2, b.getBtitle());
			prtmt.setString(3, b.getBcontent());
			prtmt.setString(4, b.getBwriter());
			prtmt.setInt(5, b.getBhitcount());
			prtmt.setDate(6, new Date(b.getBdate().getTime()));
			int result_N=prtmt.executeUpdate();
			
			if(result_N==1)
			{
				System.out.println(result_N+"행이 삽입되었습니다.");
			}
			prtmt.close();
		} catch (Exception e) {e.printStackTrace();}
		finally{try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		
		
	}

	public void update(Board b) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			String sql ="update board set btitle=?,bcontent=?,bwriter=?,bhitcount=?,bdate=? where bno=?";
			PreparedStatement prtmt = conn.prepareStatement(sql);
			prtmt.setString(1, b.getBtitle());
			prtmt.setString(2, b.getBcontent());
			prtmt.setString(3, b.getBwriter());
			prtmt.setInt(4, b.getBhitcount());
			prtmt.setDate(5, new Date(b.getBdate().getTime()));
			prtmt.setInt(6, b.getBno());
			int result_N=prtmt.executeUpdate();
			
			if(result_N>=1)
			{
				System.out.println(result_N+"행이 수정되었습니다.");
			}else{
				System.out.println("수정된 행이 없습니다.");
			}
			prtmt.close();
		} catch (Exception e) {e.printStackTrace();}
		finally{try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		
	}

	public void deleteByBno(String bno) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			String sql ="delete board where bno=?";
			PreparedStatement prtmt = conn.prepareStatement(sql);
			prtmt.setString(1, bno);
			
			int result_N=prtmt.executeUpdate();
			
			if(result_N>=1)
			{
				System.out.println(result_N+"행이 삭제되었습니다.");
			}else{
				System.out.println("수정된 행이 없습니다.");
			}
			prtmt.close();
		} catch (Exception e) {e.printStackTrace();}
		finally{try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		
	}

}
