//Programmer Name: Austin Wroblos
//Assignment Start: 10:54am 3/1/2022
//Assignment Completion: 11:18am 3/5/2022
//Total Hours for Assignment: 1.0hr
//Comments: I'm still getting used to using printf so it took me a 
//          little more time then I thought it would

import java.time.LocalDateTime;
import java.util.Scanner; //Importing scanner library

public class Assignment2 {
    public static void main(String[] args) { //Main function start

        Scanner input = new Scanner(System.in); //Creating scanner input variable

        float tMiles = 0;//Total Miles
        float tGallons = 0; //Total Gallons
        float gasMileage = 0;
        int iMiles = 0; //Input Miles
        int iGallons = 0; //Input Gallons
        int tripCount = 0; //Trip Count
        while (iMiles != -1) {
            tripCount++;
            System.out.printf("%s%d", "Please enter how many miles you traveled for trip #",tripCount);//Asking for input
            System.out.printf("%s%n", "(Enter -1 to end the loop)");
            iMiles = input.nextInt(); //Input Miles
            if (iMiles == -1) {
                tripCount--;
                break;
            
            } else {
                System.out.printf("%s%d%n", "Please enter how many gallons of gas you used for trip #",tripCount);//Asking for input
                iGallons = input.nextInt(); //Input Gallons
    
                tMiles += iMiles; //Adding input to total
                tGallons += iGallons;//Adding input to total
            }
        }
        //System.out.printf("%f %f %d", tMiles , tGallons, tripCount);
        gasMileage = (tMiles/tripCount) / (tGallons/tripCount);
        System.out.printf("%s%f%n%s%f%n","Your average miles traveled is: ",tMiles/tripCount, "Your average gallons of gased used per trip: ",tGallons/tripCount);
        System.out.printf("%s%f%n", "Your average gas mileage would be: ", gasMileage);
        System.out.printf("%s%n", "Thank you for using the Gas Mileage application.");
        LocalDateTime time = LocalDateTime.now();
        System.out.printf("%s%s%n", "Time of calculation is: ", time);
        input.close();
        System.exit(0);
    }
}