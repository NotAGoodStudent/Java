import java.util.Scanner;
public class PseudoJava {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String str1 = "";
        String str2 = "";
        int counter = 0;
        int lastindex = 0;
        System.out.println("Introduce the first string: ");
        str1 = scan.nextLine();
        System.out.println("Introduce the second string: ");
        str2 = scan.nextLine();
        
        
        while((lastindex = str1.indexOf(str2, lastindex)) != -1)
        {
            
            counter++;
            lastindex += str2.length() -1;
        }

        System.out.format("The occurrence of '%s' in '%s' is of: %d ", str1, str2, counter);
            
        
        

       
    }
}