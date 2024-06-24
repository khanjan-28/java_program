package DatabaseConnection;

import java.sql.*;
import javax.sql.*; 

public class Select
{
	Connection cn;
	Statement st;
	public Select()
	{
		cn=DatabaseConnection.getConnection();
	}
	public void SelectOperation()
	{
		
		String sql="SELECT * FROM account";
		try {
			st=cn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(" "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	

}

