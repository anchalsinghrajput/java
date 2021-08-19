import java.util.Scanner;
public class Main
{
  public static void main (String[] args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.print("Enter base radius and height of the cylinder : ");
      float r = sc.nextFloat();
      float h = sc.nextFloat();
      
      float csa = 2 * 3.14f * r * h;
      
      System.out.print("Curved surface area of the cylinder is : "+csa +" sq. units");
  }
}
