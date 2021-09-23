//power
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        System.out.println("Enter a number and its power : ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int p=sc.nextInt();
        int i=0,ans=1;
        while(i<=3)
        {
            ans=ans*n;
            i++;
        }
        
        System.out.println("result : "+ans);
    }
}
