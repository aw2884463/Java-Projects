package program8;

public class parallelogram extends trapezoid{

    public parallelogram(point p1, point p2, point p3, point p4) {
        super(p1, p2, p3, p4);
    }

    //Get area of parallelogram
    public double getArea() {
        double base = distance(getP1(), getP2()); //AB
        double height = getP2().getY() - getP3().getY(); //BC
        return base * height;
    }

    //Print area of parallelogram
    public void printArea() {
        System.out.println("The area of the parallelogram is: " + getArea());
    } 
}
