import java.util.Scanner;
public class Main
{
  public static void main (String[] args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.print("Enter the side of the cube : ");
      float s = sc.nextFloat();
      
      double tsa = 6 * Math.pow(s,2);
      
      System.out.print("Total surface area of the cube is : "+tsa +" sq. units");
  }
}
