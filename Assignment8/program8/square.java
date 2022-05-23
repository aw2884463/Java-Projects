package program8;

public class square extends rectangle{

    public square(point p1, point p2, point p3, point p4) {
        super(p1, p2, p3, p4);
    }

    //Get area of square
    public double getArea() {
        double base = distance(getP1(), getP2()); //AB
        double height = getP2().getY() - getP3().getY(); //Top Y - Bottom Y
        return base * height;
    }

    //Print area of square
    public void printArea() {
        System.out.println("The area of the square is: " + getArea());
    }
    
}
