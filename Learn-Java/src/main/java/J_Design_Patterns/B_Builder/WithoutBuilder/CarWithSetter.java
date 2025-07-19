package J_Design_Patterns.B_Builder.WithoutBuilder;

public class CarWithSetter {
    public static void main(String[] args) {
        // Using setters can lead to an inconsistent state if not all properties are set correctly.
        // For example, creating a car object and then setting properties one by one:
        CarWithSetter car = new CarWithSetter();
        car.setMake("Toyota");
        car.setModel("Corolla");
        car.setYear(2020);
        car.setColor("Blue");

        System.out.println(car);

        // Modifying the car's properties
        car.setColor("Red");
        System.out.println("After repainting: " + car);

        // Changing the model
        car.setModel("Camry");
        System.out.println("After changing model: " + car);
    }

    private String make;
    private String model;
    private int year;
    private String color;

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarWithSetter{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
