import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter the base and height of the triangle : ");
		Scanner sc = new Scanner(System.in);
		float base = sc.nextFloat();
		float height = sc.nextFloat();
		float area = 0.5f * base * height;
		System.out.print("Area of the triangle : "+area +" sq.units");
	}
}
