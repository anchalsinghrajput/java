/*
1-50 units at 1.45
51-100 Units at 2.6
>100 at 3.6 rupees*/

import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the electricity reading in units : ");
        int u = s.nextInt();
        double amt=0;
        if (u<=50)
        {
            amt = u * 1.45;
        }
        else if (u>50&&u<=100)
        {
            amt = (50*1.45) + ((u-50)*2.6);
        }
        else if (u>100)
        {
            amt = (50*1.45) + (50*2.6) + ((u - 100)*3.6);
        }
        System.out.print("Total electricity bill : " +amt);
    }
}
