import java.util.Scanner;
import java.time.LocalDateTime;

public class Assignment3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float total = 0;
        int item = 0;
        int count = 1;
        System.out.printf("%s%n", "Hello Welcome to Austin's Sales Calculator!");
        System.out.printf("%s%n", "Product 1) $2.98");
        System.out.printf("%s%n", "Product 2) $4.50");
        System.out.printf("%s%n", "Product 3) $9.98");
        System.out.printf("%s%n", "Product 4) $4.49");
        System.out.printf("%s%n", "Product 5) $6.87");

        while(item != -1) {
            System.out.printf("%s%n", "Please enter the item you purchased by number!(Enter -1 to end the loop)");
            item = input.nextInt();
            if (item != -1) {
                System.out.printf("%s%n", "Please enter the amount of that item you purchased!");
                count = input.nextInt();
                switch(item) {

                    case 1:
                        total += 2.98 * count;    
                        break; 

                    case 2: 
                        total += 4.50 * count;    
                        break;

                    case 3:
                        total += 9.98 * count;  
                        break;

                    case 4:
                        total += 4.49 * count;     
                        break;

                    case 5: 
                        total += 6.87 * count;    
                        break;

                    default:
                        System.out.printf("%s%n", "Invalid input!");    
                        break;
                }
            }
        }
        System.out.printf("%s = $%f%n", "Your total is", total);
        System.out.printf("%s%n", "Thank you for using the Calculating Sales application.");
        LocalDateTime time = LocalDateTime.now();
        System.out.printf("%s%s%n", "Time of calculation is: ", time);
        input.close();
        System.Exit(0);
    }
}