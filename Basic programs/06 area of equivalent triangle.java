import java.util.Scanner;
class Main
{
   public static void main(String args[]) 
    {   
      Scanner sc= new Scanner(System.in);
         System.out.print("Enter the side of the equivalent triangle : ");
         double side= sc.nextDouble();
         double  area=(Math.sqrt(3)/4)*(side*side);
      System.out.println("Area of equivalent triangle is : " + area +" Sq.units");      
   }
}
