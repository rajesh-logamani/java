package J_Design_Patterns.B_Builder.WithBuilder;

public class CarWithBuilder {
    public String make;
    public String model;
    public int year;
    public String color;
    public int mileage;
    public String engineType;
    public String transmission;

    // Private constructor to enforce the use of the builder
    private static CarBuilder builder() {
        return new CarBuilder();
    }

    @Override
    public String toString() {
        return "CarWithBuilder{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", engineType='" + engineType + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Using the builder pattern to create a car object
        CarWithBuilder car = new CarWithBuilder.CarBuilder()
                .setMake("Toyota")
                .setModel("Corolla")
                .setYear(2020)
                .setColor("Blue")
                .setMileage(15000)
                .setEngineType("Hybrid")
                .setTransmission("Automatic").setColor("Red") // calling setColor twice to demonstrate method chaining.
                .build();

        System.out.println(car);
    }


    // Builder class for CarWithBuilder
    // This class is used to build the CarWithBuilder object step by step
    // Builder pattern lets you validate the parameters before creating the object
    // Memory efficient as it allows you to create an object with only the necessary parameters
    // Builder class memory efficient as it only holds the parameters needed to create the object
    // It also allows for method chaining, making the code more readable
    // It's memory gets garbage collected once the object is created
    private static class CarBuilder{
        private String make;
        private String model;
        private int year;
        private String color;
        private int mileage;
        private String engineType;
        private String transmission;

        //getter and setter methods for each field
        public CarBuilder setMake(String make) {
            this.make = make;
            return this;
        }
        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }
        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }
        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }
        public CarBuilder setMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }
        public CarBuilder setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public CarBuilder setTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }
        public CarWithBuilder build() {
            CarWithBuilder car = new CarWithBuilder();
            car.make = this.make;
            car.model = this.model;
            car.year = this.year;
            car.color = this.color;
            car.mileage = this.mileage;
            car.engineType = this.engineType;
            car.transmission = this.transmission;
            return car;
        }
    }
}
