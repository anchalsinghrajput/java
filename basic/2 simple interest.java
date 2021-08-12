import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle : ");
        float p= sc.nextInt();
        System.out.print("Enter rate : ");
        float r= sc.nextInt();
        System.out.print("Enter time : ");
        float t= sc.nextInt();
        float si = (p*r*t)/100;
        System.out.print("Simple interest :  "+si);
    }
}
