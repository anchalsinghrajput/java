import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
		System.out.print("Enter radius of the sphere : ");
		float r = sc.nextFloat();
		double vol =  3.14*r*r*r*4/3;
		System.out.print("Volume of the sphere is : "+vol +" cubic units");
	}
}
