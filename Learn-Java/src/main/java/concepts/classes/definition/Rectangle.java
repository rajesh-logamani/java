package concepts.classes.definition;

public class Rectangle {

    Point topLeft;
    int height;
    int width;

    // Default constructor
    public Rectangle() {
        this.topLeft = new Point();
        this.height = 0;
        this.width = 0;
    }
    // Parameterized constructor
    public Rectangle(Point topLeft, int height, int width) {
        this.topLeft = topLeft;
        this.height = height;
        this.width = width;
    }

    public int getArea() {
        return height * width;
    }

    public int getPerimeter() {
        return 2 * (height + width);
    }

    public Point getBottomRight() {
        return new Point(topLeft.x + width, topLeft.y + height);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(new Point(1, 2), 5, 10);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        Point bottomRight = rect.getBottomRight();
        System.out.println("Bottom Right: (" + bottomRight.x + ", " + bottomRight.y + ")");

        Rectangle defaultRect = new Rectangle();
        System.out.println("Default Rectangle Area: " + defaultRect.getArea());
        System.out.println("Default Rectangle Perimeter: " + defaultRect.getPerimeter());
        Point defaultBottomRight = defaultRect.getBottomRight();
        System.out.println("Default Bottom Right: (" + defaultBottomRight.x + ", " + defaultBottomRight.y + ")");

    }
}
