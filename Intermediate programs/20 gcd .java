//GCD of 2 number
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        System.out.println("Enter two number : ");
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        int a = (n2>n1)? n1:n2;
        int b = (n2>n1)? n2:n1;
        
        while(n1%a!=0||n2%a!=0)
        {
            a=b%a;
        }
        
        System.out.println("HCF : "+a);
    }
}
