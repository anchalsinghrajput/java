import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
		System.out.print("Enter radius and height of the cylinder : ");
		float r = sc.nextFloat();
		float h = sc.nextFloat();
		double vol = 3.14*(r*r)*h;
		System.out.print("Volume of the cylinder is : "+vol +" cubic units");
	}
}
