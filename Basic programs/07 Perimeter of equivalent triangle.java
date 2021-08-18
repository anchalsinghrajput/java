import java.util.Scanner;
class Main
{
   public static void main(String args[]) 
    {   
      Scanner sc= new Scanner(System.in);
         System.out.print("Enter the side of the equivalent triangle : ");
         double side= sc.nextDouble();
         double peri= 3 * side;
      System.out.println("Perimeter of equivalent triangle is : " + peri );      
   }
}
