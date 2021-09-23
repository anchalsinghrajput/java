/*Write a program that will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks entered as below
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail */

import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter marks out of 100 : ");
        int m = in.nextInt();
        
        grade(m);
    }
    
    public static void grade(int a){
        
            if(a<=100 && a>=91)
                System.out.println("AA");
                
            else if (a<=90 && a>=81)
                System.out.println("AB");
                
            else if (a<=80 && a>=71)
                System.out.println("BB");
                
            else if (a<=70 && a>=61)
                System.out.println("BC");
                
            else if (a<=60 && a>=51)
                System.out.println("CD");
                
            else if (a<=50 && a>=41)
                System.out.println("DD");
                
            else
                System.out.println("fail");
    }
    
}
