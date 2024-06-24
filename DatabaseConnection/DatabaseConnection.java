package DatabaseConnection;


import java.sql.*;
import javax.sql.*;

public class DatabaseConnection {

		
		private static final String DB_URL ="jdbc:mysql://localhost:3306/bank";
		private static final String DB_USERNAME="root";
		private static final String DB_PASSWORD="k1234";
		
		static  Connection cn;
		
		
		
		public static Connection getConnection() {
			
			try {
				
			
				Class.forName("com.mysql.cj.jdbc.Driver");   // 2 . driver register
				cn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
				
			//	System.out.println(cn);
			//	System.out.println("connected");
			
			}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				 
			} 
			 catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
			return(cn);
	}
	}