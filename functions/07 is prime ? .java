
import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        int f = isPrime(n);
        if(f==1)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
 
    }
    
    public static int isPrime(int a){
        int i = 2,flag=1;
        while(i<Math.sqrt(a))
        {
            if(a%i==0)
                flag++;   
                
            i++;
        }
        return flag;
    }
    
}
