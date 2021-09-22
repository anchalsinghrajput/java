//Perfect Number In Java
/*
A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number. 
In other words, if the sum of positive divisors (excluding the number itself) of a number equals the number itself is called a perfect number. Let's understood it through an example.

Example of a Perfect Number
Let's take the number 496 and heck it is a perfect number or not.

First, we find the factors of 496 i.e. 1, 2, 4, 8, 16, 31, 62, 124, and 248. Let's find the sum of factors
(1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 +248 = 496). We observe that the sum of factors is equal to the number itself. 
Hence, the number 496 is a perfect number. Similarly, we can check other numbers also.
*/

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n/2)
        {
            if(n%i==0)
            {
               sum=sum+i; 
            }
            i++;
        }
        
        if(n==sum)
            System.out.println("Perfect number ");
        else
            System.out.println("Not a perfect number");
        
    }
}
