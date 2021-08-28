import java.util.Scanner;
public class  Main{
    public static void main (String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.print("Enter a number : ");
     int n = s.nextInt();
     int fact = 1 ;
     if(n<0)
     {
         System.out.print("Invalid input");
         System.exit(0);
     }
     else 
     {
         for(int i = 2; i <= n; i++)
         fact = fact*i;
     }
     
     System.out.print(+n +"! = "  +fact);
    }
}
