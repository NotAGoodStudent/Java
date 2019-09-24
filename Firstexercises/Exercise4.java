package Firstexercises;
 
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        String product;
        float price;
        float discount;
        float finalpr;

        System.out.println("Introduce the product's name: ");
        product = scan.nextLine();
        System.out.println("Introduce the product's price: ");
        price = scan.nextFloat();
        System.out.println("Introduce the poduct's discount: ");
        discount = scan.nextFloat();


        finalpr = price - (price * discount / 100);

        System.out.format("The final price of the %s is of: %.2f€\n", product, finalpr);




    }
}