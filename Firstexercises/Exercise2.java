package Firstexercises;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        float height = 0;
        float weight = 0;
        float bmi = 0;

        System.out.println("Introduce your height: ");
        height = scan.nextFloat();
        System.out.println("Introduce yout weight: ");
        weight = scan.nextFloat();
        bmi =  weight / height * 2;

        if(bmi <= 18.5)
        {
            System.out.format("Your bmi is %1.f, you must gain some weight!", bmi);
        }

        else if(bmi >= 30.0)
        {
            System.out.println("You're obese, you must lose weight");
        }

        else if(bmi <= 25.0 && bmi >=29.9)
        {
            System.out.println("You have some extra weight, i recomend some sport and you'll be fine.");
        }

        else
        {
            System.out.println("Your weight is normal");
        }
        
    }
}