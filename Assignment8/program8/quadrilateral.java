package program8;

public class quadrilateral {

    private point p1, p2, p3, p4;

    public quadrilateral(point p1, point p2, point p3, point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public point getP1() {
        return p1;
    }

    public point getP2() {
        return p2;
    }

    public point getP3() {
        return p3;
    }

    public point getP4() {
        return p4;
    }

    public void setP1(point p1) {
        this.p1 = p1;
    }

    public void setP2(point p2) {
        this.p2 = p2;
    }

    public void setP3(point p3) {
        this.p3 = p3;
    }

    public void setP4(point p4) {
        this.p4 = p4;
    }

    public static double distance(point p1, point p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

}