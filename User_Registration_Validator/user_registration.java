// User Registration Validator
// Create a program that validates a user's registration details.
// The user provides:

// Username
// Email
// Password
// Phone number
// Age
// Validate the following:
// Username must be 5–15 characters.
// Username can contain only letters, numbers, and _.
// Email must contain a valid @ and domain.
// Password must contain at least 8 characters.
// Password must contain uppercase, lowercase, digit, and special character.
// Phone number must contain exactly 10 digits.
// Age must be between 18 and 60.
// Display either:
// Registration Successful

// or all validation errors.
package java_sandbox.User_Registration_Validator;
import java.util.Scanner;

class user_registration 
{   
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Username:");
        String uname = scanner.nextLine();
        username(uname, scanner);
        System.out.println(); 

        System.out.println("Email:");
        String email = scanner.nextLine();
        email(email, scanner);
        System.out.println(); 

        System.out.println("Password:");
        String password = scanner.nextLine();
        password(password, scanner);
        System.out.println(); 

        System.out.println("Phone no:");
        String phoneno = scanner.nextLine();
        phone_no(phoneno, scanner);
        System.out.println(); 

        System.out.println("Age:");
        int age = scanner.nextInt();
        age(age, scanner);

        
    }

    static void username(String uname, Scanner scanner)
    {   
        while (true) 
        {
            if ((uname.matches("[a-zA-Z0-9]+")) && uname.length() >= 5 && uname.length() <= 15 ) 
            {
               System.out.println("Username successfully generated. !!!");
               break;
            }
            else
            {
                System.out.println("ERROR : Username must be 5–15 characters and Username can contain only letters & numbers.");
                System.out.println();
                System.out.print("Enter username again: ");
                uname = scanner.nextLine();
            }
        }

        
    }
    static void email(String email, Scanner scanner)
    {   
        while (true) 
        {
            if (email.indexOf('@') != -1 && email.indexOf('.') != -1)
            {
                System.out.println("Email successfully generated. !!!");
                break;
            }
            else{
                System.out.println("Email does not contain @ or Domain.");
                System.out.println();
                System.out.println("Enter Email again:");
                email = scanner.nextLine();
            }            
        }

    }
    static void password(String pword, Scanner scanner)
    {   
        while (true) 
        {   
            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;
            boolean hasSpecial = false;

            for (int i = 0; i < pword.length(); i++) 
            {   
                char ch = pword.charAt(i);
                if (Character.isUpperCase(ch)) 
                {
                    hasUpper = true;   
                }   
                else if (Character.isLowerCase(ch)) 
                {
                    hasLower = true;    
                } 
                else if (Character.isDigit(ch))
                {
                    hasDigit = true;
                }    
                else
                {
                    hasSpecial = true;
                }
            }
            if (pword.length() >= 8 && pword.length() <= 15 && hasDigit && hasLower && hasUpper && hasSpecial)
            {
                System.out.println("Valid Password successfully generated. !!!.");
                break;    
            }
            else
            {
                System.out.println("Password is not generated. !!!.");
                System.out.println();
                System.out.println("Enter the Password again:");
                pword = scanner.nextLine();
            }       
        }
 
    }
    static void phone_no(String phone_no, Scanner scanner)
    {   
        while (true) 
        {
            if (phone_no.matches("[0-9]{10}")) 
            {
                System.out.println("Valid."); 
                break; 
            }
            else
            {
                System.out.println("Invalid.");  
                System.out.println();
                System.out.println("Enter the Phone Number again:");
                phone_no = scanner.nextLine();
            }
        }
    }
    static void age(int age_no, Scanner scanner)
    {   
        while (true) 
        {
            if (age_no >=18 && age_no <=70) 
            {
                System.out.println("Valid Age.");  
                break;
            }
            else
            {
                System.out.println("Invalid.");  
                System.out.println();
                System.out.println("Enter the Age again:");
                age_no = scanner.nextInt();
            }    
        }
 
    }


}
