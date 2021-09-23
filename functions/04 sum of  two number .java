// Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter two number : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        
        System.out.println("Sum : "+sum(n1,n2));
    }
    
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    
}
