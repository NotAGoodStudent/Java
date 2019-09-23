import java.util.Scanner;

public class Test {

        public static void main(String[] args) {   
        
        //Dev notes: This program was made so i can understand how this language works and i learn some of the syntax

        
        //Scanner makes us to be abele to read input from the user usage: Scanner name = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        //Defining basic variables such as strings and booleans
        String phrase;
        String phrase2;
        int numb = 0;
        boolean equals = false;
        //System.out.println allows us to show text on screen
        System.out.println("Introduce the very first string: ");
        //scan.next allows us to read the input
        phrase = scan.next();
        System.out.println("Introduce the very first string: ");
        phrase2 = scan.next();

        // A loop where we compare two strings character by character
        for(int x = 0; x < phrase.length(); x++)
        {
            for(int i = 0; i < phrase2.length();i++)
            {
                if(phrase.charAt(x) == phrase2.charAt(i))
                {

                    equals = true;

                }

                else
                {
                    equals = false;
                }
            }
        }

        //If this condition becomes true, it'll print the following text 
        if(equals == true)
        {
            System.out.println("Strings are equal");
        }
        //If the condition is not accomplished it'll print this other text
        else if(equals == false)
        {
            System.out.println("Strings are not equal");
        }
        
        //Chech character in a certain position
        System.out.println(phrase.charAt(3));

    
            
        }

        
}