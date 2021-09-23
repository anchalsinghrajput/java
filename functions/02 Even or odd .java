//Define a program to find out whether a given number is even or odd.

import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int n1 = in.nextInt();
        
        isEven(n1);
        
    }
    public static void isEven(int a){
        if(a%2==0)
            System.out.println("Even");
        else
            System.out.println("odd");
    }
    
}
