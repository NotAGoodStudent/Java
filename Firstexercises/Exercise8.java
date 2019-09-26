package Firstexercises;
import java.util.Scanner;
import java.util.Random;
public class Exercise8 
{

    public static void main(String[] args) 
    {
        Random random = new Random();
        int number = random.nextInt(999);
        int counter = 0;
        int findnumb = random.nextInt(999);
        int learnt = 0;
        int counter2 = 0;
        int wrongnumb[] = new int[10000];
            
        for(int x = 0; x < wrongnumb.length;x++)
        {
            findnumb = random.nextInt(999);
            counter++;
            counter2++;

            if(wrongnumb[x] != findnumb && findnumb != number)
            {
                wrongnumb[x] = findnumb;

                if(findnumb == wrongnumb[x] && findnumb != number)
                {
                
                    learnt++;
                    counter--;
                
                
                
                }
            }
            
            if(findnumb == number)
            {
                
                System.out.format("It took %d tries to find the number: %d and the number has repeated itself %d times out of a total of %d times", counter, number, learnt, counter2);
                break;
            }
        }
    }
}