package ch04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Exam07 {

	public static void main(String[] args) {
		List<JobSalary> result = getMethod("사원",1000);
		for(JobSalary js : result){
			System.out.println(js.getJob() + ":"+js.getSalary());
		}
		
		
		
	}
	
	public static List<JobSalary> getMethod(String job, int salary)
	{
		Connection conn=null;
		List<JobSalary> jss = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			String sql = "select job,sum(sal) as salary from emp where job<>? group by job having sum(sal)>=? order by salary";
			PreparedStatement pstmt = conn.prepareStatement(sql);		
			pstmt.setString(1, job);
			pstmt.setInt(2, salary);
			ResultSet rs =pstmt.executeQuery();
			
			while(rs.next())
			{
				JobSalary js = new JobSalary();
				js.setJob(rs.getString("job"));
				js.setSalary(rs.getInt("salary"));	
				jss.add(js);
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {e.printStackTrace();}
		finally{
			try {conn.close();} catch (SQLException e) {e.printStackTrace();}			
		}
		return jss;		
	}
}
