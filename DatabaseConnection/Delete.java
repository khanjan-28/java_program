package DatabaseConnection;

import java.sql.*;
import javax.sql.*;

public class Delete
{
	Connection cn;

	public Delete() 
	{
		cn=DatabaseConnection.getConnection();
	}
	public void DeleteOperation(String no)
	{
		String sql="DELETE from account WHERE accno =+'"+no+"'";
		try {
			Statement st=cn.createStatement();
			int r=st.executeUpdate(sql);
			if(r>0)
			{
				System.out.println("Record Deleted..");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}

