package Firstexercises;
import java.util.Scanner;

public class Exercise1 

{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        String lastname;
        String domain;

        System.out.println("Introduce your name: ");
        name = scan.nextLine();
        System.out.println("Introduce your last name: ");
        lastname = scan.nextLine();
        System.out.println("Introduce your domain: ");
        domain = scan.nextLine();
        System.out.format("Your mail address is %s%s%s", name, lastname, domain);

    }
}
