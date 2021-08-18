import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter the base and side of the isosceles triangle : ");
		Scanner sc = new Scanner(System.in);
		float base = sc.nextFloat();
		float side = sc.nextFloat();
		double peri = base + (2*side);
		System.out.print("Perimeter of isosceles triangle is : "+peri);
	}
}
