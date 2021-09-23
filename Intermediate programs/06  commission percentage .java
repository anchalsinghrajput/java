//power
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        long price , commisionPrice,commisionPercentage ;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount");
        price=sc.nextLong();
        System.out.println("enter commision amount ");
        commisionPrice=sc.nextLong();
        
        commisionPercentage = (commisionPrice*100)/price;
        System.out.println("Commision Percentage = "+commisionPercentage+"%");
    }
}
