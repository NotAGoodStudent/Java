package Firstexercises;

import java.sql.Date;
import java.util.Scanner;
import java.util.Timer;
public class Exercise6 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String answer;
        long elapsed;
        long start = System.nanoTime();
        double seconds;
        

        
        System.out.println("Hello and welcome to this non sense program. I hope you enjoy your stay. Jokes aside you gotta write 'setze jutges d'un jutgat menjen fetge d'un penjat");
        
        answer = scan.nextLine();
        if(answer.equals("setze jutges d'un jutgat menjen fetge d'un penjat"))
        {
            elapsed = System.nanoTime() - start;
            seconds = (double)elapsed / 1000000000.0;
            int value = (int)seconds;
            
            System.out.format("It took: %d seconds to complete ", value);
            
        }
        
        else
        {
            System.out.println("Check for typos");
        }

        
    }
}