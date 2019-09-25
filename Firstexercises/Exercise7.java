package Firstexercises;
import java.util.Scanner;
import java.util.Random;
public class Exercise7 
{

    public static void main(String[] args) 
    {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int number = random.nextInt(999);
        boolean found = false;
        int counter = 0;
        int findnumb;
        
        while(!found)
        {
            findnumb = random.nextInt(999);
            counter++;

            if(findnumb == number)
            {
                found = true;
                System.out.format("It took %d tries to find the number: %d ", counter, number);
            }
        }
    }
}