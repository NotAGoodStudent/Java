package Firstexercises;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        String sex;
        int age = 0;
        System.out.println("Introduce your name: ");
        name = scan.nextLine();
        System.out.println("Introduce your gender: ('Male' or 'Female')");
        sex = scan.nextLine();
        System.out.println("Introduce your age: ");
        age = scan.nextInt();
        

        if (sex.equals("Male") && age <= 16) 
        {
            System.out.format("Hi %s, you belong to the male junior category\n", name);
        } 

        else if (sex.equals("Female") && age <= 16) 
        {
            System.out.format("Hi %s , you belong to the female junior category\n", name);
        }

        if (sex.equals("Male") && age > 16 && age < 65) 
        {
            System.out.format("Hi %s , you belong to the male senior category\n", name);
        }

        else if (sex.equals("Female") && age > 16 && age < 65) 
        {
            System.out.format("Hi %s , you belong to the female senior category\n", name);
        }

        if (sex.equals("Male") && age >= 65) 
        {
            System.out.format("Hi %s, you belong to the male veteran category\n", name);
        }

        else if (sex.equals("Female") && age >= 65) 
        {
            System.out.format("Hi %s, you belong to the female veteran category\n", name);

            
        }

    }
}