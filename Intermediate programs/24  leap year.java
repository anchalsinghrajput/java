//   Check Leap Year Or Not

import java.util.*;
public class Main{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a year : ");
    int y = sc.nextInt();
    
    if(y%400==0)
        System.out.println("leap year");
    else if (y%4==0&&y%100!=0)
        System.out.println("leap year");
    else
        System.out.println("Not a leap year");
    }

}
