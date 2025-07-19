package J_Design_Patterns.B_Builder.WithoutBuilder;

public class CarTelescoping {
    public static void main(String[] args) {
        // Telescoping constructor pattern can lead to a large number of constructors.
        // This can make the code hard to read and maintain.
        // For example, creating a car object with different combinations of parameters:
        CarTelescoping car = new CarTelescoping("Toyota", "Corolla", 2020, "Blue");
        System.out.println(car);
    }

    public String make;
    public String model;
    public int year;
    public String color;

    public CarTelescoping(String make) {
        this(make, "Unknown", 0, "Unknown");
    }

    public CarTelescoping(String make, String model) {
        this(make, model, 0, "Unknown");
    }

    public CarTelescoping(String make, String model, int year) {
        this(make, model, year, "Unknown");
    }

    public CarTelescoping(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarTelescoping{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
