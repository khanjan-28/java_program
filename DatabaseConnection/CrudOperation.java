package DatabaseConnection;

import java.sql.*;

public class CrudOperation 
{
	Connection cn;
	
	public CrudOperation()
	{
		cn=DatabaseConnection.getConnection();
	}

	public void insertRecord(String accno,String accname,Integer bal)
	{
		
		try {
			String sql="INSERT INTO account VALUES('"+accno+"','"+accname+"',"+bal+")";
			Statement statement =cn.createStatement();
			int rows=statement.executeUpdate(sql);
			if(rows>0)
			{
				System.out.println("Data Inserted....");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
