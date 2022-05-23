package program8;
//   A ____ B   
//    /    \   
//   /      \  
// D/________\C

public class trapezoid extends quadrilateral {


    public trapezoid(point p1, point p2, point p3, point p4) {
        super(p1, p2, p3, p4);
    }

    //Calculate the area of the trapezoid
    public double getArea() {
        double base1 = distance(getP1(), getP2()); //AB
        double base2 = distance(getP3(), getP4()); //CD
        double height = getP2().getY() - getP3().getY(); //Top Y - Bottom Y
        return (base1 + base2) * height / 2;
    } 

    //Print the area of the trapezoid
    public void printArea() {
        System.out.println("The area of the trapezoid is: " + getArea());
    }
}
