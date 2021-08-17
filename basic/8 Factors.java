import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner (System.in);
		int n1 = sc.nextInt();
		
		System.out.print("Factors are : ");
		for(int i = 1; i<=n1; i++)
		{
		    if(n1 % i == 0 )
		    {
		        System.out.print(i+" ");
		        i++;
		    }
		}
	}
}
