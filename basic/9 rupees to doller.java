import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter currency in rupee : ");
		Scanner sc = new Scanner (System.in);
		float rupee = sc.nextLong();
		double doller = (rupee * 0.013);
		System.out.print("Rs. "+rupee+ " = $"+doller);
	}
}
