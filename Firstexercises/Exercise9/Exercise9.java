import java.util.Scanner;
import java.util.Random;


public class Exercise9 
{

    public static void main(String[] args) 
    {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        String[] players = new String[4];
        int[] dorsals = new int[4];
        long elapsed = 0;
        long start = System.nanoTime();
        double seconds = 0;
        int counter = 0;
        int x = 0;
        int i = 0;
        int dorsalnumb = 0;
        float time1 = 0, time2 = 0, time3 = 0, time4 = 0;
        int first = 0, second = 0, third = 0, foruth = 0;


        while(counter <= 3)
        {
            System.out.println("Introduce the name of the runner: ");
            players[x] = scan.next();
            System.out.println("Add a dorsal number: ");
            dorsals[i] = scan.nextInt();
            System.out.format("The player %s with the dorsal number %d added successfully!\n", players[x], dorsals[i]);
            x++;
            i++;
            counter++;
            

        }
        counter  = 0;

        System.out.println("The race is starting now!");

        while(counter <= 3)
        {
            System.out.println("Who did arrive? (Introduce dorsal number)");
            dorsalnumb = scan.nextInt();

            for(int j = 0; j < dorsals.length && j < dorsals.length;j++)
            {
                
                if(dorsalnumb == dorsals[0])
                {
                elapsed = System.nanoTime() - start;
                seconds = (double)elapsed / 1000000000.0;
                float value = (float)seconds;
                time1 = value;
                System.out.format("Woah %s first with a total time of: %.3f seconds\n", players[0], time1);
                break;
                }

                if(dorsalnumb == dorsals[1])
                {
                elapsed = System.nanoTime() - start;
                seconds = (double)elapsed / 1000000000.0;
                float value = (float)seconds;
                time2 = value;
                System.out.format("Woah %s first with a total time of: %.3f seconds\n", players[1], time2);
                break;
                }

                if(dorsalnumb == dorsals[2])
                {
                elapsed = System.nanoTime() - start;
                seconds = (double)elapsed / 1000000000.0;
                float value = (float)seconds;
                time3 = value;
                System.out.format("Woah %s arrived with a total time of: %.3f seconds\n", players[2], time3);
                break;
                }

                if(dorsalnumb == dorsals[3])
                {
                elapsed = System.nanoTime() - start;
                seconds = (double)elapsed / 1000000000.0;
                float value = (float)seconds;
                time4 = value;
                System.out.format("Woah %s arrived with a total time of: %.3f seconds\n", players[3], time4);
                break;
                }
            
            }
            counter++;
        }

        System.out.println("Final results: ");
        
        for(int j = 0; j < players.length && j < dorsals.length;j++)
        {
            //ONES
            if(time1 < time3 && time1 < time2 && time1 < time4 && time2 < time3 && time2 < time4 && time3 < time4)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[3], time3);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                break;
            }

            else if(time1 < time4 && time1 < time2 && time1 < time3 && time4 < time2 && time4 < time3 && time2 < time3)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                break;
            }

            else if(time1 < time3 && time1 < time2 && time1 < time4 && time3 < time2 && time3 < time4 && time2 < time4)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                break;
            }

            else if(time1 < time3 && time1 < time2 && time1 < time4 && time3 < time2 && time3 < time4 && time3 < time2)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                break;
            }

            else if(time1 < time3 && time1 < time2 && time1 < time4 && time4 < time2 && time4 < time3 && time3 < time2)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                break;
            }

            else if(time1 < time3 && time1 < time2 && time1 < time4 && time2 < time3 && time2 < time4 && time4 < time3)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                break;
            }
            //TWOS

            if(time2 < time3 && time2 < time1 && time2 < time4 && time1 < time3 && time1 < time4 && time3 < time4)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                break;
            }

            else if(time2 < time3 && time2 < time1 && time2 < time4 && time4 < time3 && time4 < time1 && time1 < time3)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                break;
            }

            else if(time2 < time3 && time2 < time1 && time2 < time4 && time3 < time1 && time3 < time4 && time1 < time4)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                break;
            }

            else if(time2 < time3 && time2 < time1 && time2 < time4 && time3 < time1 && time3 < time4 && time4 < time1)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                break;
            }

            else if(time2 < time3 && time2 < time1 && time2 < time4 && time4 < time3 && time4 < time1 && time3 < time1)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                break;
            }

            else if(time2 < time3 && time2 < time1 && time2 < time1 && time3 < time1 && time4 < time4 && time4 < time3)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                break;
            }

            //THREES

            if(time3 < time1 && time3 < time2 && time3 < time4 && time1 < time3 && time1 < time4 && time2 < time4)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                break;
            }

            else if(time3 < time1 && time3 < time2 && time3 < time4 && time4 < time2 && time4 < time1 && time1 < time2)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                break;
            }

            else if(time3 < time1 && time3 < time2 && time3 < time4 && time2 < time4 && time2 < time1 && time1 < time4)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                break;
            }

            else if(time3 < time1 && time3 < time2 && time3 < time4 && time2 < time1 && time2 < time4 && time4 < time1)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                break;
            }

            else if(time3 < time1 && time3 < time2 && time3 < time4 && time4 < time1 && time4 < time2 && time1 < time2)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                break;
            }

            else if(time3 < time1 && time3 < time2 && time3 < time4 && time1 < time2 && time1 < time4 && time4 < time2)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                break;
            }


            //fours
            else if(time4 < time1 && time4 < time2 && time4 < time3 && time1 < time2 && time1 < time3 && time2 < time3)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                break;
            }

            else if(time4 < time1 && time4 < time2 && time4 < time3 && time3 < time2 && time3 < time1 && time1 < time2)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                break;
            }

            else if(time4 < time1 && time4 < time2 && time4 < time3 && time2 < time1 && time2 < time3 && time1 < time3)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                break;
            }

            else if(time4 < time1 && time4 < time2 && time4 < time3 && time3 < time1 && time3 < time2 && time3 < time1)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);

                break;
            }

            else if(time4 < time1 && time4 < time2 && time4 < time3 && time3 < time1 && time3 < time2 && time1 < time2)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);
                break;
            }

            else if(time4 < time1 && time4 < time2 && time4 < time3 && time1 < time3 && time1 < time2 && time3 < time2)
            {
                System.out.format("In first position we have %s with the dorsal number %d and a total time of: %.3f\n", players[3], dorsals[3], time4);
                System.out.format("In second position we have %s with the dorsal number %d and a total time of: %.3f\n", players[0], dorsals[0], time1);
                System.out.format("In third position we have %s with the dorsal number %d and a total time of: %.3f\n", players[2], dorsals[2], time3);
                System.out.format("In fourth position we have %s with the dorsal number %d and a total time of: %.3f\n", players[1], dorsals[1], time2);

                break;
            }


            
           

            

            
            
            
            
        }
        
        

        

       

        
    }
}