
import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter radius : ");
        double r = in.nextDouble();
 
        System.out.println("Circumference : "+cir(r));
    }
    
    public static double cir(double a){
        double c = 2*3.14*a;
        return c;
    }
    
}
