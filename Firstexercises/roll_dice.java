package Firstexercises;
import java.util.Random;
import java.util.Scanner;

public class roll_dice 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String player, player2;
        char option;
        int dice = 0;
        int dice2 = 0;
        int p1counter = 0;
        int p2counter = 0;
        int loop = 0;
        
        System.out.println("Insert a name for player1: ");
        player = scan.nextLine();
        System.out.println("Insert a name for player2: ");
        player2 = scan.nextLine();

        while(loop != 3)
        {
            System.out.format("Press 'q' to roll the dice, %s: ", player);
            option = scan.next().charAt(0);
            if(option == 'q')
            {   
                dice = random.nextInt(10);
                System.out.format("%s, scored: %d\n  ", player, dice);
                p1counter += dice;          
            }
            else
            {
                System.out.println("Closing the game...");
                break;
            }
                System.out.format("Press 'q' to roll the dice, %s: ", player2);
                option = scan.next().charAt(0);
            if(option == 'q')
            {
                dice2 = random.nextInt(10);
                System.out.format("%s, scored: %d\n ", player2, dice2);
                p2counter += dice2;
            }
            else
            {
                System.out.println("Closing the game...");
                break;
            }
            loop++;

        }
        if(p1counter > p2counter)
        {
        System.out.format("%s won with a total score of: %d to %d\n ", player, p1counter, p2counter);
        }

        if(p2counter > p1counter)
        {
            System.out.format("%s won with a total score of: %d to %d\n ", player2, p2counter, p1counter);
        }

        if(p1counter == p2counter)
        {
            System.out.format("It's a draw of a total score of: %d to % d\n ", p2counter, p1counter);
        }

        




        



    }
        
}