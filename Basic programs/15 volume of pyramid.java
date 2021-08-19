import java.util.Scanner;
public class Main
{
  public static void main (String[] args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.print("Enter Base length ,Base width and height of pyramid : ");
      int l = sc.nextInt();
      int w = sc.nextInt();
      int h = sc.nextInt();
      
      float vol = (l * w * h)/3;
      
      System.out.print("Volume of pyramid is : "+vol +" cubic units");
  }
}
