import java.util.*;
class Employee implements Comparable<Employee>
{
    int id;
    String name;
    double salary;
    String post;
    
    Employee(int id, String name)
    {
    	this.id = id;
        this.name = name;
    }

    void setDetails( double sal, String post)
    {
        this.salary = sal;
        this.post = post;
    }
    
    void getDetails()
    {
    	System.out.println("\nName : "+name+"\nId : "+id+"\nSalary : "+salary+"\nPost : "+post);
    }
    
    public int compareTo(Employee e)
    {
    	//return this.id - e.id; // a - b asecnding sorting
    	//return e.id - this.id; // a - b desecnding sorting
    	
    	//return this.name.compareTo(e.name); //a - b asecnding sorting
    	return e.name.compareTo(this.name);//a - b desecnding sorting
    }
}
public class Tree {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		TreeSet<Employee> tSet= new TreeSet<Employee>();
		
		System.out.println("No. of Employee Details you want to Enter : ");
		int num = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < num; i++) 
		{
			System.out.println("Enter your Name : ");
			String name = scan.nextLine();
			System.out.println("Enter your ID : ");
			int id = scan.nextInt();
			System.out.println("Enter your Salary : ");
			double salary = scan.nextDouble();
			scan.nextLine();
			System.out.println("Enter your Post : ");
			String post = scan.nextLine();
			
			Employee e = new Employee(id, name);
			e.setDetails(salary, post);
			
			tSet.add(e);
			
		}	
		for (int i = 0; i < tSet.size(); i++) 
		{
			System.out.println(tSet);
		}
		
		scan.close();

	}

}
