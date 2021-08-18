import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
		System.out.print("Enter radius and height of the cone : ");
		float r = sc.nextFloat();
		float h = sc.nextFloat();
		double vol = 3.14*(r*r)*h/3;
		System.out.print("Volume of the cone is : "+vol +" cubic units");
	}
}
