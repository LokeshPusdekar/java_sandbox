import java.util.Scanner;

class calculator 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculation syntax(20 + 30):");
        int num1 = scanner.nextInt();
        char symbol = scanner.next().charAt(0);
        int num2 = scanner.nextInt();

        switch (symbol) 
        {
            case '+':
                Add(num1, num2);
                break;
            
            case '-':
                Subtract(num1, num2);
                break;

            case '*':
                Multiply(num1, num2);
                break;

            case '/':
                Divide(num1, num2);
                break;

            default:
                System.out.println("Invalid Input.");
                break;
        }

    }

    static void Add(int n1, int n2)
    {
        int sum = n1 + n2;
        System.out.println(sum + " is Addtion of two numbers.");
    }

    static void Subtract(int n1, int n2)
    {
        int sub = n1 - n2;
        System.out.println(sub + " is Subtraction of two numbers.");
    }
    // static void Subtract(int n2, int n1)
    // {
    //     int sub = n2 - n1;
    //     System.out.println(sub + " is Subtraction of two numbers.");
    // }

    static void Multiply(int n1, int n2)
    {
        int multiply = n1 * n2;
        System.out.println(multiply + " is Multiplication of two numbers.");
    }

    static void Divide(int n1, int n2)
    {
        int divide = n1 / n2;
        System.out.println(divide + " is Division of two numbers.");
    }
    // static void Divide(int n2, int n1)
    // {
    //     int divide = n2 / n1;
    //     System.out.println(divide+ "is Division of two numbers.");
    // }
    
}
