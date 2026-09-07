import java.util.Scanner;

class palindrome_num
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = scanner.nextInt();

        is_palindrome(num);
    }

    static void is_palindrome(int n)
    {
        int temp=0,num,rev_num=0;
        num = n;
        while(n>0)
        {
            temp = n % 10;
            rev_num = (rev_num * 10) + temp;
            n = n / 10;
        }
        if(num == rev_num)
        {
            System.out.println(num+" is a Palindrome Number.");
        }
        else
        {
            System.out.println(num+" is not Palindrome  Number.");
        }
    }
}