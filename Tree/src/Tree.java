import java.util.*;

public class Tree 
{
	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		TreeSet<Integer> t = new TreeSet<Integer>();
		System.out.println("Tell me how many numbers you want to Enter : ");
		int num = scan.nextInt();
		System.out.println("Enetr the Random Values to sort :");
		
		for (int i = 0; i < num; i++) 
		{		
			int n = scan.nextInt();
			t.add(n);
			System.out.println("Current size : "+t.size());
		}
		System.out.println(t);
		scan.close();
	}
}
