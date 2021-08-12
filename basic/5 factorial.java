import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long fact=1;
        int i=1;
        while(i<=num)
        {
            fact = fact * i;
            i++;
        }
        
        System.out.println("Factorial of "+num+" is : " +fact);
    }
}
