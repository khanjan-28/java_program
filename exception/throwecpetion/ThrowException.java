package exception.throwecpetion;

public class ThrowException {
	
	private int marks;
	
	public int getMarks()
	{
		return marks;
	}
	
	public void setMarks(int marks)
	{
		try
		{
			if(marks < 0)
			{
				throw new ArithmeticException();  //throw : when we want it on custome situation 
			}
			else
			{
				this.marks = marks;
			}
		}
		catch(ArithmeticException ar)
		{
			System.out.println("marks should not be negative");
		}
	}

}
