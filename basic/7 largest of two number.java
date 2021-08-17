import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter two number : ");
		Scanner sc = new Scanner (System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if(n1>n2)
		    System.out.println("Largest "+n1);
		else
		    System.out.println("Largest "+n2);
		
	}
}
