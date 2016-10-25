package finalsource.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import finalsource.dao.BoardDao;
import finalsource.dto.Board;



public class TestBoardDao {

	public static void main(String[] args) {
		//testInsert();
		//testselectByBno();
		//testselectByBtitle();
		//testupdate();
		//testdeleteByBno();
		testSelectByPage(2,10);
	}

	
	private static void testdeleteByBno() {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			
			BoardDao dao = new BoardDao();
			dao.setConn(conn);
			
			int rowNo = dao.deleteByBno(10);
			
			System.out.println(rowNo+"행 삭제함");
			
		} catch (Exception e) {e.printStackTrace();}
		finally{try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		
	}

	private static void testupdate() {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			
			BoardDao dao = new BoardDao();
			dao.setConn(conn);
			
			Board board = new Board();
			board.setBno(10);
			board.setBtitle("제목10_2");
			board.setBcontent("내용10_2");
			board.setBwriter("user10");
			board.setBhitcount(5);
			board.setBdate(new Date());
			
			int rowNo = dao.update(board);
			
			System.out.println(rowNo+"행 수정함.");
			
			
		} catch (Exception e) {e.printStackTrace();}
		finally{try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		
	}

	private static void testselectByBtitle() {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			
			BoardDao dao = new BoardDao();
			dao.setConn(conn);
			
			List<Board> list = dao.selectByBtitle("제목");
			
			for(Board board : list)
			{
				System.out.print(board.getBno()+": ");
				System.out.print(board.getBtitle()+": ");
				System.out.print(board.getBcontent()+": ");
				System.out.print(board.getBwriter()+": ");
				System.out.print(board.getBhitcount()+": ");
				System.out.print(board.getBdate());
				System.out.println();
			}
			
			
			
		} catch (Exception e) {e.printStackTrace();}
		finally{try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		
	}

	private static void testselectByBno() {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			
			BoardDao dao = new BoardDao();
			dao.setConn(conn);
			
			Board board = dao.selectByBno(10);
			
			if(board!=null){
			System.out.print(board.getBno()+": ");
			System.out.print(board.getBtitle()+": ");
			System.out.print(board.getBcontent()+": ");
			System.out.print(board.getBwriter()+": ");
			System.out.print(board.getBhitcount()+": ");
			System.out.print(board.getBdate());
			System.out.println();
			}
			
			
		} catch (Exception e) {e.printStackTrace();}
		finally{try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		
	}

	private static void testInsert() {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			
			BoardDao dao = new BoardDao();
			dao.setConn(conn);
			
			Board board = new Board();
			board.setBtitle("제목10");
			board.setBcontent("내용10");
			board.setBwriter("user10");
			int rowNo=dao.insert(board);
			
			System.out.println(rowNo+"행이 삽입됨");
			
		} catch (Exception e) {e.printStackTrace();}
		finally{try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
	}
	
	private static void testSelectByPage(int pageNo, int rowsPerPage) {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			
			BoardDao dao = new BoardDao();
			dao.setConn(conn);
			
			List<Board> list = dao.selectByPage(pageNo, rowsPerPage);
			
			for(Board board : list){
			System.out.print(board.getBno()+": ");
			System.out.print(board.getBtitle()+": ");
			System.out.print(board.getBcontent()+": ");
			System.out.print(board.getBwriter()+": ");
			System.out.print(board.getBhitcount()+": ");
			System.out.print(board.getBdate());
			System.out.println();
			}
			
			
		} catch (Exception e) {e.printStackTrace();}
		finally{try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		
		
	}
	
	

}
