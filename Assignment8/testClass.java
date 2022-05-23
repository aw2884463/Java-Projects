import program8.*;
import java.time.LocalDateTime;

public class testClass {

    public static void main(String[] args) {

        point p1 = new point(1, 5);
        point p2 = new point(4, 5);
        point p3 = new point(5, 3);
        point p4 = new point(3, 3);

        trapezoid t = new trapezoid(p1, p2, p3, p4);
        t.printArea();

        p1 = new point(2, 3);
        p2 = new point(5, 3);
        p3 = new point(4, 1);
        p4 = new point(1, 1);

        parallelogram p = new parallelogram(p1, p2, p3, p4);
        p.printArea();

        p1 = new point(1, 5);
        p2 = new point(4, 5);
        p3 = new point(5, 3);
        p4 = new point(3, 3);
        rectangle r = new rectangle(p1, p2, p3, p4);
        r.printArea();

        p1 = new point(1, 4);
        p2 = new point(3, 4);
        p3 = new point(3, 2);
        p4 = new point(1, 2);

        square s = new square(p1, p2, p3, p4);
        s.printArea();

        System.out.printf("%s%n", "Thank you for using the Quadrilateral application.");
        LocalDateTime time = LocalDateTime.now();
        System.out.printf("%s%s%n", "Time of calculation is: ", time);
        System.exit(0);
    }   
}
