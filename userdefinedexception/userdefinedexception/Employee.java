package userdefinedexception;

public class Employee {

	private String ename;
	private int salary;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		try
		{
			if(salary < 5000)
			{
				throw new SalaryException("salary must be greater than 5000");
			}
			else
			{
				this.salary = salary;
			}
		}
		catch(SalaryException se)
		{
			System.out.println(se.getMessage());
		}
	}
	

	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
}
