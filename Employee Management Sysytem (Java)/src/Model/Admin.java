package Model;

public class Admin extends Employee
{	
	double allowance;
	
	public Admin(int id, String name, String post, double salary, double allowance)
	{
		super(id, name, post, salary);
		this.allowance = allowance;
	}
	
	public void setID(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name =  name;
	}
	
	public void setSalary(double salary)
	{
		this.salary =  salary;
	}
	
	public void setPost(String post)
	{
		this.post =  post;
	}
	
	public void setAllowance(double allowance)
	{
		this.allowance = allowance;
	}
	
	public int getID()
	{
		return this.id;
	}
	

	public String getName()
	{
		return this.name;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	
	public String getPost()
	{
		return this.post;
	}
	
	public double getAllowance()
	{
		return this.allowance;
	}
	
	public double calsal()
	{
		return this.allowance + this.salary;
	}
	
	public String toString()
	{
		return super.toString() + "\nAllowance : "+allowance+"\nTotal Salary : "+this.calsal();
	}
}
