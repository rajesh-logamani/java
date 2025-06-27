package C_constructors.copyconstructors;

public class Dog extends Animal {
    private String breed;

    // Default constructor
    public Dog() {
        super(); // Calls the default constructor of Animal
        this.breed = "Unknown";
    }

    // Parameterized constructor
    public Dog(String name, int age, String breed) {
        super(name, age); // Calls the parameterized constructor of Animal
        this.breed = breed;
    }

//     Copy constructor - Deep copy
    public Dog(Dog other) {
        super(other); // Calls the copy constructor of Animal
        this.breed = other.breed;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + super.toString() + "', breed='" + breed + "'}";
    }
}
