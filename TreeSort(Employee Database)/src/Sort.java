import java.util.*;

class Employee implements Comparable<Employee>
{
    int id;
    String name;
    double salary;
    String post;
    
    Employee(int id, String name,double sal, String post)
    {
    	this.id = id;
        this.name = name;
        this.salary = sal;
        this.post = post;
    }

//    void setDetails( double sal, String post)
//    {
//        this.salary = sal;
//        this.post = post;
//    }
    
    void getDetails()
    {
    	System.out.println("\nName : "+name+"\nId : "+id+"\nSalary : "+salary+"\nPost : "+post);
    }
    
    public int compareTo(Employee t)
    {
    	return this.id - t.id; // a - b asecnding sorting
    	//return e.id - this.id; // a - b desecnding sorting
    	
    	//return this.name.compareTo(e.name); //a - b asecnding sorting
    	//return e.name.compareTo(this.name);//a - b desecnding sorting
    }
    
    public String toString()
    {
    	return "\n\nName : "+name+"\nId : "+id+"\nSalary : "+salary+"\nPost : "+post;
    }
}

public class Sort {

	public static void main(String[] args) 
	{	
		TreeSet<Employee> t= new TreeSet<Employee>();
		
//		Scanner scan = new Scanner(System.in);
		System.out.println("Sorting Using TreeSet");
//		System.out.println("No. of Employee Details you want to Enter : ");
//		int num = scan.nextInt();
//		scan.nextLine();
//		
//		for (int i = 0; i < num; i++) 
//		{
//			System.out.println("Enter your Name : ");
//			String name = scan.nextLine();
//			System.out.println("Enter your ID : ");
//			int id = scan.nextInt();
//			System.out.println("Enter your Salary : ");
//			double salary = scan.nextDouble();
//			scan.nextLine();
//			System.out.println("Enter your Post : ");
//			String post = scan.nextLine();
//			
//			Employee e = new Employee(id, name);
//			e.setDetails(salary, post);
//			
//			tSet.add(e);
//			
//		}	
//		for (int i = 0; i < tSet.size(); i++) 
//		{
//			System.out.println(tSet);
//		}
//		
//		scan.close();
		
		t.add(new Employee(101, "Lokesh", 10000, "Admin"));
		t.add(new Employee(103, "Shivam", 10344, "Manager"));
		t.add(new Employee(104, "Punit", 1403445, "CEO"));
		t.add(new Employee(107, "Om", 234000, "Branch Manager"));
		t.add(new Employee(123, "Jay", 14500, "Developer"));
		t.add(new Employee(105, "Soham", 40000, "Staff"));
		t.add(new Employee(102, "Pawan", 15000, "Sales Manager"));
		t.add(new Employee(111, "UV", 145000, "Tester"));
		
		System.out.println(t);
		
	}

}
