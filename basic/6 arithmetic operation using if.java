import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        System.out.print("Enter two number : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter an operator (+,-,*,/) : ");
        char ope = sc.next().charAt(0);
        int ans=0;
        if(ope=='+')
        {
           ans=num1+num2; 
        }
        else if (ope=='-')
        {
            ans=num1-num2; 
        }
        else if (ope=='*')
        {
            ans=num1*num2; 
        }
        else if(ope=='/')
        {
           ans=num1/num2;  
        }
        
        System.out.printf("%d %c %d = %d", num1,ope,num2,ans);
    }
}
