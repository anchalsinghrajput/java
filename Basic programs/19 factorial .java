import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		long fact=1;
		if(n<0)
		{
		    System.out.print("Enter valid input");
		    System.exit(0);
		}
		if(n==0)
		{
		    fact=1;
		}
		else
		{
		    for(int i = 1 ; i<=n ; i++)
		    {
		        fact = fact * i;
		    }
		}
		
		System.out.print("factorial : " +fact);
	}
}
