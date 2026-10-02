package Model;


public class HR extends Employee
{	
	double commision;
	
	public HR(int id, String name, String post, double salary, double commision)
	{	
		super(id, name, post, salary);
		this.commision = commision;	
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
	
	public void setCommision(double commision)
	{
		this.commision = commision;
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
	
	public double getCommision()
	{
		return this.commision;
	}
	
	
	public double calsal()
	{
		return this.commision + this.salary;
	}
	
	public String toString()
	{
		return super.toString() + "\nCommision : "+commision+"\nTotal Salary : "+this.calsal();
	}
}