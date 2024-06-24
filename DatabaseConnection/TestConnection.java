package DatabaseConnection;


import java.util.Scanner;

public class TestConnection {

	public static void main(String[] args) {
		
				
	CrudOperation ins=new CrudOperation();
//	ins.insertRecord("acc02","Dev",2345);
//	ins.insertRecord("acc03","Dhvani",1345);
//	ins.insertRecord("acc04","Khanjan",3345);
//	ins.insertRecord("acc05","Bhumi",2300);
//	ins.insertRecord("acc06","Jay",2000);
				
				Select read=new Select();
				read.SelectOperation();
//				
//						
//				Update upd=new Update();
//				upd.UpdateOperation("acc04","Anjali",300);
//				System.out.println("Records After Update...");
//				read.SelectOperation();
//				
				Delete dlt=new Delete();
				dlt.DeleteOperation("acc02");
//				
				Select read1=new Select();
				read1.SelectOperation();
				
				

			}

		}

		
		
		
