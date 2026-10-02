package Model;


public abstract class Employee 
{
	protected int id;
	protected String name;
	protected String post;
	protected double salary;
	
	public Employee(int id, String name, String post, double salary)
	{
		this.id = id;
		this.name = name;
		this.post = post;
		this.salary = salary;
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
	
	public abstract double calsal();
	
//	public int compareTo(Employee t)
//    {
//		return Integer.compare(this.id, t.id);
//    }
	
	public String toString()
	{
		return "\nName : "+name+"\nId : "+getId()+"\nSalary : "+salary+"\nPost : "+post;
	}

	public int getId() {
		return id;
	}

	public int setId(int id) {
		this.id = id;
		return id;
	}
	
}
