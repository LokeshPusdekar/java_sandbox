import java.util.*;

class Employee
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

    

}

public class arrayList 
{

	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Employee> aList = new ArrayList<Employee>();
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
			aList.add(e);
		}
		
		for (int i = 0; i < aList.size(); i++) 
		{
			aList.get(i).getDetails();;
		}
		
		scan.close();
	}
		
}
