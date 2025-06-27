package E_abstractions_Interfaces.abstraction;

public abstract class Shape  {

    // write code here
    private int positionX;
    private int positionY;
    private String fillColor;
    private String borderColor;

    public Shape(int positionX, int positionY, String fillColor, String borderColor){
        this.positionX = positionX;
        this.positionY = positionY;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public int getPositionX(){
        return this.positionX;
    }
    public int getPositionY(){
        return this.positionY;
    }
    public String getFillColor(){
        return this.fillColor;
    }
    public String getBorderColor(){
        return this.borderColor;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}