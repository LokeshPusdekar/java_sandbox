import java.util.Scanner;

class evenodd
{
    public static void main(String args[]) 
    {      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Value:");
        System.out.flush(); 
        int num = scanner.nextInt();
        scanner.close();

        is_even_odd(num);
    }

    static void is_even_odd(int n)
    {
        if(n % 2 == 0)
        {
            System.out.println(n+" is Even Number.");
        }
        else
        {
            System.out.println(n+" is Odd Number.");
 
        }
    }
}