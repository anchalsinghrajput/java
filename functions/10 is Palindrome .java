/*Write a function to find if a number is a palindrome or not. Take number as parameter.*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        
        isPalindrome(n);
    }
    
    public static void isPalindrome(int a){
        int rev = 0;
        int temp = a;
            while(a!=0)
            {
                rev = (rev*10)+(a%10);
                a=a/10;
            }
            
            if(rev==temp)
                System.out.println("palindrome");
            else
                System.out.println("Not a palindrome");
    
    }
    
}
