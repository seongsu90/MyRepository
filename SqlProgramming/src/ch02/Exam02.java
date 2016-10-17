package ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver"); //메모리에 클래스 등록? // OracleDriver 객체를 DriverManager에 등록하는 코드가 OracleDriver에 존재한다.
		Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
		
		//매개변수화된 SQL문
		String sql="select ename,empno,sal from emp where ename like ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,"%성%"); // 1은 ? 의 순서이다.
		ResultSet rs=pstmt.executeQuery(); 
		
		while(rs.next())
		{
			int empno = rs.getInt(2);
			String ename=rs.getString("ename");
			int sal = rs.getInt("sal");
			System.out.println(empno+":"+ename+":"+sal);
		}
		
		
		rs.close();
		pstmt.close();
		conn.close();
	}

}
