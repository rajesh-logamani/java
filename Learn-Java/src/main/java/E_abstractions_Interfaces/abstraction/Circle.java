package E_abstractions_Interfaces.abstraction;


public class Circle extends Shape  {

    // write code here
    private final int radius;

    public int getRadius(){
        return this.radius;
    }

    public Circle(int positionX, int positionY, String fillColor, String borderColor, int radius){
        super(positionX, positionY, fillColor, borderColor);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 *  Math.PI * this.radius;
    }

}
