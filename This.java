//A simple Calculator Programm

import java.util.Scanner;

public class This {
    public static void main(String[] args) {

        //initializing the scanner function to allow for user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to TK's first CALCULATOR, how can I assist you today?");
        System.out.println("<===========================================================>");

        //Gathering input from the user, which prompts the user to insert what type of math they would like to use
        System.out.println("Enter the following operator based off what type of math you want to do: \n (+ - * /)");
        String mathType = scan.nextLine();

        System.out.println("How many numbers would you like to include in the operation?");
        int count = scan.nextInt();

        //created an array to cater for a wider range of numbers with a for loop to iterate through the count array
        //until the amount of numbers specified in the previous prompt
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        //declare variable total as a double to cater for division
        double total = numbers[0];

        //created a switch case with a for loop to iterate through the count array based on the values and operator
        //selected by the user
        switch (mathType) {
            case "+":
                for (int i = 1; i < count; i++) {
                    total += numbers[i];
                }
                System.out.println("Total = " + total);
                break;
            case "-":
                for (int i = 1; i < count; i++) {
                    total -= numbers[i];
                }
                System.out.println("Total = " + total);
                break;
            case "*":
                for (int i = 1; i < count; i++) {
                    total *= numbers[i];
                }
                System.out.println("Total = " + total);
                break;
            case "/":       //In this for loop I added an if statement with an error text the user tries to divide by 0
                for (int i = 1; i < count; i++) {
                    if (numbers[i] == 0) {
                        System.out.println("Error: Cannot divide by 0!");
                        return;
                    }
                    total /= numbers[i];
                }
                System.out.println("Total = " + total);
                break;
            default:
                System.out.println("Invalid Input");
        }

        scan.close();
    }
}
