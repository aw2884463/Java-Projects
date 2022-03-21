import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Creates scanner variable that takes in numbers

        System.out.print("Please enter your first number:"); // Asks user for the firt number

        int num1 = input.nextInt(); //Gets integer input from user and saves as num1

        System.out.print("Please enter your second number:");

        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.printf("The total is : %d%n", sum);
        input.close();
    }
}