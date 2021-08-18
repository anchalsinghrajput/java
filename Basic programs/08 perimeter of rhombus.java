import java.util.Scanner;
class Main
{
   public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
         System.out.print("Enter the side of the rhombus : ");
         double side = s.nextDouble();
         double peri = 4*side;
      System.out.println("Perimeter of Rhombus is : " +peri);      
   }
}
