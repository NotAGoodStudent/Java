import java.util.Scanner;
import java.util.*;
public class Practice {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce a string: ");
        String str1 = scan.nextLine();
        char letter;
        char n = ' ';
        System.out.println("Input a character: ");
        letter = scan.next().charAt(0);

        for(int x = 0; x < str1.length();x++)
        {
            if(str1.charAt(x) == letter)
            {
                str1.replace(str1.charAt(x), n);
            }
        }
        System.out.println(str1);





    }
}