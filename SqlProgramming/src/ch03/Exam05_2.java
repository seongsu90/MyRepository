package ch03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam05_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		while(true)
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","kosa12345");
			Scanner scan = new Scanner(System.in);
			System.out.print("검색할 이름: ");
			String name = scan.nextLine();
			String sql = "select employee_id,first_name from employees where lower(first_name) like ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "%"+name+"%");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				String employee_id = rs.getString(1);
				String first_name = rs.getString(2);
				System.out.println(employee_id+":"+first_name);
			}
			rs.close();
			conn.close();
			pstmt.close();
			
		}
	}
	
	
}
