/*Kunal is allowed to go out with his friends only on the even days of a given month. 
Write a program to count the number of days he can go out in the month of August.*/

import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int i = 1;
        int even_count = 0;
        while(i<31)
        {
            if(i%2==0)
            {
                even_count++;
            }
            i++;
        }
        
        System.out.println("Number of even days in august when kunal can go out is : "+even_count);
    }
}
