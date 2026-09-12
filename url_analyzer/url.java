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



package java_sandbox.url_analyzer;

import java.util.Scanner;

class url 
{
    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a URL:");
        String url = scan.nextLine();
        url(url ); 

    }

    static void url(String url)
    {
        // https://www.example.com:8080/products/phones?id=123&brand=apple#reviews

        String https = url.substring(0, 4);
        String www = url.substring(8, 10);

        System.out.println("Protocol   : "+https);
        System.out.println("Sub Domain : "+www);
        System.out.println("Port       : "+https);
        System.out.println("Path       : "+https);
        System.out.println("Querry     : "+https);
        System.out.println("Parameter  : "+https);
        System.out.println("Fragment   : "+https);

    }
    
}
