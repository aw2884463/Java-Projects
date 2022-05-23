package program8;

public class rectangle extends parallelogram {

    public rectangle(point p1, point p2, point p3, point p4) {
       super(p1, p2, p3, p4);
    }

    //Get area of rectangle
    public double getArea() {
        double base = distance(getP1(), getP2()); //AB
        double height = getP2().getY() - getP3().getY(); //BC
        return base * height;
    }

    //Print area of rectangle
    public void printArea() {
        System.out.println("The area of the rectangle is: " + getArea());
    } 
}
