/*
Write a program to print the sum of negative numbers, 
sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. 
The list terminates when the user enters a zero.*/

import java.util.*;
public class Main{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int negativeSum=0;
    int positiveEvenSum=0;
    int positiveOddSum=0;
    int n=-1;
    while(n!=0)
    {
        n = sc.nextInt();
        if(n<0)
        {
          negativeSum=negativeSum+n;  
        }
        else if (n%2==0)
        {
            positiveEvenSum=positiveEvenSum+n;
        }
        else
        {
            positiveOddSum=positiveOddSum+n;
        }
    }
    
    System.out.println("Negative sum : "+negativeSum);
    System.out.println("Positive odd sum : "+positiveOddSum);
    System.out.println("Positive even sum : "+positiveEvenSum);
    
    }
}

