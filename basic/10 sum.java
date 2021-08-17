//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter elements : ");
		Scanner sc = new Scanner (System.in);
		int ele,i,sum=0;
	    do{
	      ele=sc.nextInt(); 
	      sum=sum+ele; 
	    }while(ele!=0);
		
		System.out.print("Sum : "+sum);
	}
}
