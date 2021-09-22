//Distance b/w two point

import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int x1, y1,x2, y2;
        double distance = 0;
        System.out.println("Enter the coordinates  (x1,y1): ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter the coordinates  (x2,y2): ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        
        distance=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y2),2));
        System.out.print("Distance : "+distance);
    }
}
