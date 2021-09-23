import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter two number : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        
        System.out.println("Product : "+product(n1,n2));
    }
    
    public static int product(int a, int b){
        int p = a*b;
        return p;
    }
    
}
