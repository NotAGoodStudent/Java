import java.lang.reflect.Array;
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String phrase;
        String phrase2 = "";
        boolean palindromic = false;
        

        System.out.println("Introduce a string:  ");
        phrase = scan.next();
        
        
        for(int x = phrase.length() -1; x >= 0; x--)
        {
            
            phrase2 += phrase.charAt(x);
            
        }


        if(phrase.equals(phrase2))
        {
            palindromic = true;
            
        }

        else if(phrase != phrase2)
        {
            palindromic = false;
        }


        if(palindromic == true)
        {
            System.out.println("It is palindromic");            
        }


        else if(palindromic == false)
        {
            System.out.println("It is not palindromic...");
        }
    }
}