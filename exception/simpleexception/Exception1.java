package exception.simpleexception;

import java.util.*;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter value for a : ");
		
		int no1=a.nextInt();
		
		Scanner b = new Scanner(System.in);
		System.out.println("Enter value for b : ");
		int no2=b.nextInt();

		try 
		{
			int[] arr= {2,3,10,0,6,9};
			
			for(int i : arr)
			{
				result= no1/arr[i];
				System.out.println("output : "+result);
			}
			
			result= no1/no2;
			System.out.println("output : "+result);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1.getMessage());
		}
		catch(Exception e)  //try without catch is possible when we use finally 
		{
			System.out.println("number can not be "+ e.getMessage());
		}
		finally
		{
			System.out.println("End of the code..");  //finally block always written after catch & only one final block allow
		}

	}
}
