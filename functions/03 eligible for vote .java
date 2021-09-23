//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the age of the person : ");
        int age = in.nextInt();
        
        isEligible(age);
        
    }
    public static void isEligible(int a){
        if(a>=18)
            System.out.println("Eligible");
        else
            System.out.println("Not eligible");
    }
    
}
