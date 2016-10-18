package ch03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Exam06 {

	public static void main(String[] args) {
		
		//과제
		Employee emp=null;
		try {
			emp = getEmployee(1001);
			System.out.println(emp.getEmpno()+" : "+emp.getEname()+" : "+emp.getSal());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			List<Department> result;
			result = getDepartment("개발");
			for(Department dept : result){
				System.out.println(dept.getDeptno()+" : "+dept.getDname()+" : "+dept.getLoc());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	private static Employee getEmployee(int searchEmpno) throws ClassNotFoundException, SQLException {
		//select * from emp where  empno=?
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
		
		Employee emp = new Employee();
		String sql = "select * from emp where empno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		String number = String.valueOf(searchEmpno);
		pstmt.setString(1, number);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()){
		
		emp.setEmpno(rs.getInt("empno"));
		emp.setEname(rs.getString("ename"));
		emp.setJob(rs.getString("job"));
		emp.setMgr(rs.getInt("mgr"));
		emp.setHiredate(rs.getDate("hiredate"));
		emp.setSal(rs.getDouble("sal"));
		emp.setComm(rs.getDouble("comm"));
		emp.setDeptno(rs.getInt("deptno"));
		
		}
		rs.close();
		pstmt.close();
		conn.close();
		
		return emp;
		
	}
	
	private static List<Department> getDepartment(String searchDname) throws ClassNotFoundException, SQLException {
		// select * from dept where dname like ?
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
		List<Department> dp = new ArrayList<>();
		String sql ="select * from dept where dname like ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "%"+searchDname+"%");
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next())
		{
			Department dep = new Department();
			dep.setDeptno(rs.getInt("deptno"));
			dep.setDname(rs.getString("dname"));
			dep.setLoc(rs.getString("loc"));
			
			dp.add(dep);
		}
		rs.close();
		pstmt.close();
		conn.close();

		return dp;
	}

}
