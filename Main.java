import java.util.Scanner;
public class Main{
    public Main(){

    }
    public static void main(String[] args)
    {
       // System.out.println("Hello World");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
    
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        // prompt user to input year of birth

        System.out.println("What is your year of birth");

        int year = myObj.nextInt();
        int age = 2025 - year;
        System.out.println("You are" + age + "years old");

        String decimal = "3.45";
        String integer = "4567";
        double double1 = Double.parseDouble(decimal); //convert to double

        int int1 = Integer.parseInt(integer); // convert to int

        System.out.println("double number" + double1);
        System.out.println("int number" + int1);
    }
}