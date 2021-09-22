// Sum of a digit a number 

import java.util.*;
public class Main{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt();
    int  sum = 0;
    
    while (n!=0)
    {
        sum++;
        n = n/10;
    }
    System.out.println("Number of digits : "+sum);
    
    }
}

