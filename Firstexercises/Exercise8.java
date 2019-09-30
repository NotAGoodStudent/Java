
import java.util.Random;
public class Exercise8 {
    public static void main(String[] args) 
    {
     
        Random random = new Random();
        int number = random.nextInt(20);
        int findnumb = random.nextInt(20);
        int counter = 0;
        int counter2 = 0;
        int repeated = 0;
        int[] wrongnumb = new int[40];
        int i = 0;
        boolean save = false;

        while(findnumb != number)
        {
            counter++;
            counter2++;
            save = true;
            

            for(int x = 0; x < wrongnumb.length;x++)
            {
                

                if(wrongnumb[x] == findnumb)
                {
                    
                    save = false;
                    repeated++;
                    counter--;
                    break;
                }
                
            }


            if(save)
            {
                wrongnumb[i] = findnumb;
                i++;
                
                
                
            }

            findnumb = random.nextInt(20);

           

            
        }

        if(counter == 0)
        {
            counter = 1;
        }
        

        System.out.format("It took %d tries to find the number: %d and the number has repeated itself %d times out of a total of %d times\n ", counter, number, repeated, counter2);

        for(int x = 0; x < wrongnumb.length; x++)
        {
            
            System.out.println(wrongnumb[x]);
        }
    }
}