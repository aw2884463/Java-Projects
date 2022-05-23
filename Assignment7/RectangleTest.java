import java.util.Scanner;
import java.time.LocalDateTime;

public class RectangleTest {

    //main method
    public static void main(String[] args) {
        RectangleClass myRectangle = new RectangleClass();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the length of the rectangle: ");
        myRectangle.setLength(input.nextFloat());

        System.out.println("Please enter the width of the rectangle: ");
        myRectangle.setWidth(input.nextFloat());
        
        System.out.println("The area of the rectangle is " + myRectangle.getArea());

        System.out.printf("Thank you for using the Rectangle Application%n");
        LocalDateTime time = LocalDateTime.now();
        System.out.printf("%s%s%n", "Time of calculation is: ", time);
        System.exit(0);
    } 
}
