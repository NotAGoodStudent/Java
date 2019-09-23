import java.util.Scanner;

public class fast {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        int option = 0;
        float result = 0;
        System.out.println("Welcome to this small calculator program\nLet's start by deciding what you want to do: ");

        System.out.println("Press 1 to sum: ");
        System.out.println("Press 2 to substract: ");
        System.out.println("Press 3 to multiply: ");
        System.out.println("Press 4 to divide: ");

        option = scan.nextInt();

        if (option == 1) {

            System.out.println("Introduce a number: ");
            num1 = scan.nextFloat();
            System.out.println("Introduce a second number: ");
            num2 = scan.nextFloat();
            Sum(num1, num2, result);

        }

        if (option == 2) {
            System.out.println("Introduce a number: ");
            num1 = scan.nextInt();
            System.out.println("Introduce a second number: ");
            num2 = scan.nextInt();
            Substract(num1, num2, result);

        }

        if (option == 3) {
            System.out.println("Introduce a number: ");
            num1 = scan.nextFloat();
            System.out.println("Introduce a second number: ");
            num2 = scan.nextFloat();
            Multiply(num1, num2, result);

        }

        if (option == 4) {
            System.out.println("Introduce a number: ");
            num1 = scan.nextFloat();
            System.out.println("Introduce a second number: ");
            num2 = scan.nextFloat();
            Divide(num1, num2, result);

        }

    }

    public static void Sum(float num1, float num2, float result) {

        result = (num1 + num2);
        System.out.format("The result of the sum between %.0f and %.0f is: %.1f\n", num1, num2, result);

    }

    public static void Substract(float num1, float num2, float result) {
        result = (num1 - num2);
        System.out.format("The result of the substraction between %.0f and %.0f is: %.1f\n", num1, num2, result);
    }

    public static void Multiply(float num1, float num2, float result) {
        result = (num1 * num2);
        System.out.format("The result of the multiplication between %.0f and %.0f is: %.1f\n", num1, num2, result); 
    }

    public static void Divide(float num1, float num2, float result) {
        result = (num1 / num2);
        System.out.format("The result of the division between %.0f and %.0f is: %.1f\n", num1, num2, result);

    }

}