//Take integer inputs till the user enters 0 and print the largest number from all

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter elements : ");
		Scanner sc = new Scanner (System.in);
		int ele,large=-1,i,sum=0;
	    do{
	        ele=sc.nextInt(); 
	        if(ele>large)
	        {
	            large=ele;    
	        }
	    }while(ele!=0);
		System.out.print("Large : " +large);
	}
}
