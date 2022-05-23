import java.util.Scanner;

public class RectangleClass {

    public float length;
    public float width;
    Scanner input = new Scanner(System.in);

    public RectangleClass() {
        this.length = 1;
        this.width = 1;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    public void setWidth(float width) {
        if (width > 0 && width < 20) {
            this.width = width;
        }
        else {
            while (width < 0 || width > 20) {
                System.out.println("Please enter a valid width: ");
                width = input.nextFloat();
            }
            this.width = width;
        }
    }

    public void setLength(float length) {
        if (length > 0 && length < 20) {
            this.length = length;
        }
        else {
            while(length < 0 || length > 20) {
                System.out.println("Please enter a valid length: ");
                length = input.nextFloat();
            }
            this.length = length;
        }
    }
    
    public float getArea() {
        return getWidth() * getLength();
    }

}
