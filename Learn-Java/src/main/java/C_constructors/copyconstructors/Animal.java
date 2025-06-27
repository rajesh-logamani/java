package C_constructors.copyconstructors;

public class Animal {
    private String name;
    private int age;

    // Default constructor
    public Animal() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Animal(Animal other) {
        this.name = other.name;
        this.age = other.age;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + '}';
    }
}
