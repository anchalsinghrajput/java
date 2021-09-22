// LCM Of Two Numbers
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two number : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int i ;
        int a =(n1 > n2)? n1 : n2;  
  
        for(i = a ; i <= n1*n2 ; i = i + a)  
        {  
            if(i % n1 == 0 && i % n2 == 0)
                break;
        }
        System.out.println("LCM of " +n1 +" and " +n2 +" is " +i);
    }
}
