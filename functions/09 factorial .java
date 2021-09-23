/*Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E
4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1 */

import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        
        System.out.println(+n+"! = "+factorial(n));
    }
    
    public static int factorial(int a){
            int fact = 1;
            for(int i = 2; i <= a ; i++)
            {
                fact = fact * i;
            }
           
           return fact;     
    }
    
}
