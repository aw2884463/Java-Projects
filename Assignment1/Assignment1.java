import java.util.Scanner;
/*
//Programmer Name: Austin Wroblos
//Assignment Start: 10:54am 2/22/2022
//Assignment Completion: 11:18am 2/22/2022
//Total Hours for Assignment: 0.25hr
//Comments: I enjoyed the assignment its a nice starting program
*/
public class Assignment1 {

    public static void main(String[] args) { // Start of main

        Scanner input = new Scanner(System.in); //Creating a input variable with type Scanner

        System.out.printf("%s", "Please enter the radius of the circle:"); //Asking the user for input
        int r = input.nextInt(); //Storing input in variable r
        System.out.printf("%s = %f%n", "Diameter", 2 * Math.PI); //Output diameter
        System.out.printf("%s = %f%n", "Circumference", 2 * Math.PI * r); //Output circumference
        System.out.printf("%s = %f%n", "Area", Math.PI * (r * r)); //Output area

        input.close();
        System.exit(0);
    }  
}
