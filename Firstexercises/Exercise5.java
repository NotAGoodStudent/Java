package Firstexercises;
import java.util.Scanner;
public class Exercise5 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int right = 0, wrong = 0, option = 0;
        Questions(scan, right, wrong, option);
       
        
    }
    
    public static void Questions(Scanner scan, int right, int wrong, int option)
    {
        System.out.println("Who's the president from united states? ");
        System.out.println("1: Obama");
        System.out.println("2: Trump");
        System.out.println("3: Clinton");
        option = scan.nextInt();

        if(option == 2)
        {
            System.out.println("Indeed, trump is the president of the united states. Good job!");
            right++;
        }
        else
        {
            System.out.println("Incorrect, better luck next time!");
            wrong++;
            System.out.format("Seems like you failed, let's chech the results.\n Right: %d\n Wrong: %d ", right, wrong);
            System.exit(0);
        }

        System.out.println("Who's the president of Spain? ");
        System.out.println("1: No one yet");
        System.out.println("2: Pablo iglesias");
        System.out.println("3: Pablo casado");
        option = scan.nextInt();

        if(option == 1)
        {
            System.out.println("Indeed, it seems like a joke but we really have no president yet. Good job!");
            right++;
        }

        else
        {
            System.out.println("Ugh, i see tough one, better luck next time");
            wrong++;
            System.out.format("Seems like you failed, let's chech the results.\n Right: %d\n Wrong: %d ", right, wrong);
            System.exit(0);
        }

        System.out.println("Who's the richest man in the world? ");
        System.out.println("1: Bill Gates");
        System.out.println("2: Amancio Ortega");
        System.out.println("3: Jeff Bezos");
        option = scan.nextInt();

        if(option == 3)
        {
            System.out.println("Indeed, Jeff Bezos is the richest man alive. Good job!");
            right++;
        }
        
        else
        {
            System.out.println("I can see you're not very familiar with money ;), neither am i don't worry.");
            wrong++;
            System.out.format("Seems like you failed, let's chech the results.\n Right: %d\n Wrong: %d ", right, wrong);
            System.exit(0);
        }

        System.out.println("Who's the owner of Tesla? ");
        System.out.println("1: Mike Conrad");
        System.out.println("2: Luka Stein");
        System.out.println("3: Elon Musk");
        option = scan.nextInt();

        if(option == 3)
        {
            System.out.println("Indeed, Elon Musk is the owner of Tesla, and i'll tell you something else, he's also the owner of spcace x.");
            right++;
        }
        else
        {
            System.out.println("Don't worry, next time you go through those questions, you'll do better!");
            wrong++;
            System.out.format("Seems like you failed, let's chech the results.\n Right: %d\n Wrong: %d ", right, wrong);
            System.exit(0);
            
        }

        System.out.format("You did all the questions properly. I'm impressed! ");

    }    

    
}