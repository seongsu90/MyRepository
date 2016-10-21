package finalsource.dao;

import java.beans.PropertyChangeListenerProxy;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import finalsource.dto.Board;



public class BoardDao {
	private Connection conn;
	
	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public int insert(Board board) throws SQLException{
		String sql = "insert into board(bno,btitle,bcontent,bwriter,bhitcount,bdate) values(seq_board_bno.nextval, ?, ?, ?, 0, sysdate)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, board.getBtitle());
		pstmt.setString(2, board.getBcontent());
		pstmt.setString(3, board.getBwriter());
				
		int rowNo = pstmt.executeUpdate();
		pstmt.close();
				
		return rowNo;
	}
	
	public Board selectByBno(int bno)throws SQLException{
		String sql="select * from board where bno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bno);
		Board board = null;
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next())
		{
			board = new Board();
			board.setBno(rs.getInt("bno"));
			board.setBtitle(rs.getString("btitle"));
			board.setBcontent(rs.getString("bcontent"));
			board.setBwriter(rs.getString("bwriter"));
			board.setBhitcount(rs.getInt("bhitcount"));
			board.setBdate(rs.getDate("bdate"));
		}
		rs.close();
		pstmt.close();
		return board;
	}
	
	public List<Board> selectByBtitle(String btitle) throws SQLException
	{
		String sql ="select * from board where btitle like ?";
		List<Board> b = new ArrayList<>();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "%"+btitle+"%");
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next())
		{
			Board board = new Board();
			board.setBno(rs.getInt("bno"));
			board.setBtitle(rs.getString("btitle"));
			board.setBcontent(rs.getString("bcontent"));
			board.setBwriter(rs.getString("bwriter"));
			board.setBhitcount(rs.getInt("bhitcount"));
			board.setBdate(rs.getDate("bdate"));
			
			b.add(board);
		}
		rs.close();
		pstmt.close();
		
		return b;
	}
	
	public int update(Board board) throws SQLException{
		String sql ="update board set btitle=?,bcontent=?,bwriter=? where bno=?";
		PreparedStatement prtmt = conn.prepareStatement(sql);
		prtmt.setString(1, board.getBtitle());
		prtmt.setString(2, board.getBcontent());
		prtmt.setString(3, board.getBwriter());
		prtmt.setInt(4, board.getBno());
		
		int rowNo=prtmt.executeUpdate();
		prtmt.close();
		
		return rowNo;
	}
	
	public int deleteByBno(int bno) throws SQLException //삭제된 행수를 리턴하기때문에 int형
	{
		String sql = "delete board where bno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bno);
		int rowNo = pstmt.executeUpdate();
		pstmt.close();
		return rowNo;
	}
}
