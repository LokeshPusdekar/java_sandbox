import java.util.Scanner;

class Strong_num
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = scanner.nextInt();
        scanner.close();

        is_strong_num(num);
    }

    static void is_strong_num(int n)
    {   
        int number,temp=0,sum=0;
        number = n;

        while(n > 0)
        {   
            int fact = 1;
            temp = n % 10;
            for(int j=1; j<=temp; j++)
            {   
                fact = fact * j;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if(sum == number )
        {
            System.out.println(sum+" This is a Strong Number.");
        }
        else
        {
            System.out.println(sum+" This is not a Strong Number.");
        }
    }
}