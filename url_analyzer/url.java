// 5. URL Analyzer
// Create a program that analyzes a URL.
// Input:

// https://www.example.com/products?id=123&category=mobile

// Protocol       → https
// Subdomain      → www
// Domain         → example.com
// Port           → 8080
// Path           → /products/phones
// Query          → id=123&brand=apple
// Query Parameter→ id=123
// Query Parameter→ brand=apple
// Fragment       → reviews

// id = 123
// category = mobile

// Also detect whether the URL is valid.
//https://github.com/LokeshPusdekar/Firstbit/tree/main/FirstBit/C_Programming/Assignments/Assignment_1
//https://www.example.com:8080/products/phones?id=123&brand=apple#reviews




import java.util.Scanner;

class url 
{
    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a URL:");
        String url = scan.nextLine();
        url(url); 

    }

    static void url(String url)
    {
        // https://www.example.com:8080/products/phones?id=123&brand=apple#reviews

        //HTTPS
        if (url.contains("https")) 
        {
            System.out.println("Protocol        : https");
        }
        else
            System.out.println("Not Found.");
        

        // WWW
        if ( url.contains("www")) 
        {
            System.out.println("Sub Domain      : www");
        }
        else
            System.out.println("Not Found.");


        //DOMAIN NAME
        String[] temp = url.split("://");          // https  www.example.com:8080/products/phones?id=123&brand=apple#reviews
        String[] temp2 = temp[1].split(":");     // www.example.com   8080/products/phones?id=123&brand=apple#reviews
        String domain = temp2[0].substring(4);
        System.out.println("Domain          : "+domain);
        
        //PORT 
        String[] temp3 = temp2[1].split("/");   // 8080   products   phones?id=123&brand=apple#reviews
        System.out.println("Port            : "+temp3[0]);
        int port_len = temp3[0].length();
        // System.out.println("Port length      : "+port_len);

        //PATH
        String[] temp4 = temp2[1].split("[? #]");       // 8080/products/phones      id=123&brand=apple     reviews
        System.out.println("Path            : "+temp4[0].substring(port_len+1));

        //Querry
        String[] temp5 = temp4[1].split("&");
        for (int i = 0; i < temp5.length; i++) 
        {
            System.out.println("Querry_param_" + (i+1)+ "  : "+ temp5[i]);
        }

        //Fragments
        System.out.println("Fragment        : "+temp4[2]);
    }
    
}
