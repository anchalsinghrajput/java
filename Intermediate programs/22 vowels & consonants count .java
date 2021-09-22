//Java Program Vowel Or Consonant
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of the character : ");
        int n = sc.nextInt();
        
        char arr;
        
        int vowels = 0;
        int consonants = 0;
        
        for(int i = 0 ; i < n ; i++){
            arr=sc.next().charAt(0);
            if(arr== 'a' || arr== 'e' || arr== 'i' || arr== 'o' || arr== 'u')
                vowels++;
            else
                consonants++;
        }
        System.out.println("Number of vowels : "+vowels);
        System.out.println("Number of Consonant : "+consonants);
    }
}
