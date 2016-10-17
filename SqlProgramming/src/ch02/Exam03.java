package ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam03 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver"); //메모리에 클래스 등록? // OracleDriver 객체를 DriverManager에 등록하는 코드가 OracleDriver에 존재한다.
		Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
		
		//매개변수화된 SQL문
		String sql="select empno,ename,(sal*12+nvl(comm,0)) as yearsal from emp "; //뒤에 한칸 띄어준다.
		sql +="where sal>? and deptno=? ";
		sql +="order by yearsal desc";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,400);
		pstmt.setInt(2,30);
		ResultSet rs=pstmt.executeQuery(); 
		
		while(rs.next())
		{
			int empno = rs.getInt("empno");
			String ename=rs.getString("ename");
			int yearsal = rs.getInt("yearsal");
			System.out.println(empno+":"+ename+":"+yearsal);
		}
		
		
		rs.close();
		pstmt.close();
		conn.close();
	}

}
