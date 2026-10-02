package Model;

public class Salesmanager extends Employee
{	
	int target;
	double incentive;
	
	public Salesmanager(int id, String name, String post, double salary, int target, double incentive)
	{
		super(id, name, post, salary);
		this.target =target ;
		this.incentive = incentive;
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
	
	public void setIncentive(double incentive)
	{
		this.incentive = incentive;
	}
	
	public void setTarget(int target)
	{
		this.target = target;
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
	
	public double getIncentive()
	{
		return this.incentive;
	}
	
	public int getTarget()
	{
		return this.target;
	}
	
	public double calsal()
	{
		return (this.incentive * this.target) + this.salary;
	}
	
	public String toString()
	{
		return super.toString() + "\n Incentives : "+incentive+"\nTarget : "+target+"\nTotal Salary : "+this.calsal();	
	}
}
