package ch08.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dto.Account;

public class AccountDao {
	private Connection conn;

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	
	public int update(Account acc) throws SQLException
	{
		String sql="update account set abalance=? where ano=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		 //여기서 예외처리하면 안된다. throws 를 던져야된다. 메인쪽에서 롤백을 하기 위해 여기서 예외를 잡으면 안된다.
		pstmt.setInt(1, acc.getAbalance());
		pstmt.setString(2, acc.getAno());
		int rowNo = pstmt.executeUpdate();
		return rowNo;
		
	}
}
