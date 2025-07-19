package J_Design_Patterns.B_Builder.WithoutBuilder;

public class CarWithParameterizedConstructor {

    public static void main(String[] args) {
        // Parameter order in constructors can lead to confusion.
        // If the order of parameters is not clear, it can lead to confusion.
        // For example, creating a car object with the wrong parameters:
        // Creating a car object with parameters in the wrong order
        // This can lead to bugs that are hard to trace.

        // If the constructor parameters are changed, all the places where the constructor is called need to be updated.
        CarWithParameterizedConstructor car = new CarWithParameterizedConstructor("Toyota", "Corolla", 2020, "Blue");
        System.out.println(car);
    }

    public String make;
    public String model;
    public int year;
    public String color;

    public CarWithParameterizedConstructor(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarWithParameterizedConstructor{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
