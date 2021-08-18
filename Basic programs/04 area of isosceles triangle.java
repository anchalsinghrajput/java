import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter the base and side of the isosceles triangle : ");
		Scanner sc = new Scanner(System.in);
		float base = sc.nextFloat();
		float side = sc.nextFloat();
		double height = Math.sqrt((side*side)-(base/2*base/2));
		double area = 0.5f*base *height;
		System.out.print("Area of isosceles triangle is : "+area +" sq.units");
	}
}
