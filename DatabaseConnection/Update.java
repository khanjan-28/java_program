package DatabaseConnection;

import java.sql.*;
import javax.sql.*;
public class Update
{
	Connection cn;
	
	public Update()
	{
		cn=DatabaseConnection.getConnection();
	}

	public void UpdateOperation(String accno,String accname,int bal)
	{
		String sql="UPDATE account SET accname='"+accname+"' WHERE accno='"+accno+"'";
		
		try {
			Statement st=cn.createStatement();
			int r=st.executeUpdate(sql);
			if(r>0)
			{
				System.out.println("Record updated...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

