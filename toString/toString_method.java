class Employee
{
    int id;
    String name;
    int salary;
    String post;

    void setDetails(int id, String name, int sal, String post)
    {
        this.id = id;
        this.name = name;
        this.salary = sal;
        this.post = post;
    }

    int getDetails()
    {
        return this.salary;
    }
    
    void update()
    {
        System.out.println("Project details are updated....");
    }

    public String toString()
    {
        return "Id = "+id+"\nName = "+name+"\nSalary = "+salary+"\nPost = "+post;
    }
}

class Admin extends Employee
{
    int allowance;

    void setDetails( int allowance)
    {
        this.allowance = allowance;
    }
    int getDetails()
    {
        return salary + allowance;
    }

    void update()
    {
        System.out.println("Updating the Current month Accountings.");
    }

    public String toString()
    {
        return super.toString()+"\nAllowance = "+this.allowance;
    }
}

class Salemanager extends Employee
{
    int incentive;
    int target;

    void setDetails( int incentive, int target)
    {
        this.incentive = incentive;
        this.target = target;
    }

    int getDetails()
    {
        return salary + (incentive * target);
    }
    
    void update()
    {
        System.out.println("Updating the current month Sales");
    }

    public String toString()
    {
        return super.toString()+"\nIncentives = "+this.incentive+"\nTarget = "+this.target;
    }
}

class HR extends Employee
{
    int commision;

    void setDetails(int commision)
    {
        this.commision = commision;
    }

    int getDetails()
    {
        return salary + commision;
    }
        
    void update()
    {
        System.out.println("Updating the Numbers of new recrutments.");
    }

    public String toString()
    {
        return super.toString()+"\nCommision = "+this.commision;
    }
}

class Display
{
    public static void main(String[] args) 
    {
        Employee e = new Employee();

        e = new Admin();
        Admin a = new Admin();
        e = a;
        e.setDetails(102, "Sayali", 500000,"Admin");
        a.setDetails(5000);
        System.out.println(e);
        e.update();
        System.out.println();


        e = new Salemanager();
        Salemanager s = new Salemanager();
        e = s;
        e.setDetails(104, "Punit", 500000,"Sales Manager");
        s.setDetails(13000,10);
        System.out.println(e);
        e.update();
        System.out.println();

        e = new HR();
        HR h = new HR();
        e = h;
        e.setDetails(107, "Shivam", 500000,"HR");
        h.setDetails(110000);
        System.out.println(e);
        e.update();
        System.out.println();

    }
}