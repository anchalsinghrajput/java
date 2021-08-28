import java.util.Scanner;
public class Main
{
public static void main (String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.print("Enter Number of elements : ");
    int n = s.nextInt();
    System.out.print("Enter the elements : ");
    int i=0,sum=0;
    while(i<n)
    {
        int e = s.nextInt();
        sum = sum + e;
        i++;
    }
    
    double avg = (double)sum/n;
    System.out.print("Average : "+avg);
 }
}
