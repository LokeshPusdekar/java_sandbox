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

import java.util. Scanner;

class user_registration 
{   
    public static void main(String[] argd)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Username:");
        String uname = scanner.nextLine();
        username(uname);
        System.out.println(); 

        System.out.println("Email:");
        String email = scanner.nextLine();
        email(email);
        System.out.println(); 

        System.out.println("Password:");
        String password = scanner.nextLine();
        password(password);
        System.out.println(); 

        System.out.println("Phone no:");
        long phoneno = scanner.nextLong();
        phone_no(phoneno);
        System.out.println(); 

        System.out.println("Age:");
        int age = scanner.nextInt();
        age(age);
    }

    static void username(String uname)
    {   
        boolean flag = true;
        while (flag) 
        {
            if ((uname.matches(".*[^a-zA-Z0-9].*")) || uname.length() >= 5 || uname.length() <=15 ) 
            {
               System.out.println("ERROR : Username must be 5–15 characters and Username can contain only letters & numbers."); 
             
            }
            else
                flag = false;
        }

        System.out.println("Username successfully generated. !!!");

        

    }
    static void email(String email)
    {
        if (email.indexOf('@') == -1 && email.indexOf('.') == -1)
        {
            System.out.println("Email successfully generated. !!!");
        }
        else{
            System.out.println("Email does not contain @ or Domain.");
        }
    }
    static void password(String pword)
    {
        if (pword.length()>=8 && pword.matches(".*[^a-zA-Z0-9].*")) 
        {
            System.out.println("Valid Password successfully generated. !!!.");
        }
        else
        {
            System.out.println("Password is not generated. !!!.");
        }    
    }
    static void phone_no(long phone_no)
    {
        if (phone_no <11 && phone_no >9) 
        {
            System.out.println("Valid.");  
        }
        else
        {
            System.out.println("Invalid.");  
        }
    }
    static void age(int age_no)
    {
        if (age_no >=18 && age_no <=70) 
        {
            System.out.println("Valid Age.");  
        }
        else
        {
            System.out.println("Invalid Age.");  
        }
    }

}
