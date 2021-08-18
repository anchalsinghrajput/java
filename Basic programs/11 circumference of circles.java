import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter the radius of the circle : ");
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		float peri = 2*3.14f*r; 
		System.out.print("Perimeter of the circles : "+peri);
	}
}
