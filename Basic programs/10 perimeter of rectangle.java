import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter the length and width of the rectangle : ");
		Scanner sc = new Scanner(System.in);
		float length = sc.nextFloat();
		float width = sc.nextFloat();
		float peri =2*(length + width);
		System.out.print("perimeter of the rectangle : "+peri);
	}
}
