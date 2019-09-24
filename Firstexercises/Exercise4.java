package Firstexercises;
 
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        String product;
        Float price;
        int off = 0;
        Float finalpr;

        System.out.println("Introduce the product's name: ");
        product = scan.nextLine();
        System.out.println("Introduce the product's price: ");
        price = scan.nextFloat();
        System.out.println("Introduce the poduct's discount: ");
        off = scan.nextInt();


        finalpr = (price * off) / 100;

        System.out.format("The final price of the %s is of: %.2f€\n", product, finalpr);




    }
}