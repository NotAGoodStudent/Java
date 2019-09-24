package Firstexercises;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        float height = 0;
        float weight = 0;
        

        System.out.println("Introduce your weight: ");
        weight = scan.nextFloat();
        System.out.println("Introduce your height: ");
        height = scan.nextFloat();
        float bmi =  (weight) / (height * height);

        if(bmi < 18.5)
        {
            System.out.format("Your bmi is %.1f, you must gain some weight! ", bmi);
        }

        else if(bmi < 30.0 && bmi > 25.0)
        {
            System.out.format("You're obese your bmi is of: %.1f, you must lose weight. ", bmi);
        }

        else if(bmi < 25.0 )
        {
            System.out.format("You have a normal weight, your bmi is of: %.1f, i recomend some sport and you'll be fine. ", bmi);
        }

        
        
    }
}