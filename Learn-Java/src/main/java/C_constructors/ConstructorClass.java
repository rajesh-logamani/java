package C_constructors;

public class ConstructorClass {
    private int x;
    private String name;

//    // Default constructor
//    public ConstructorClass() {
//        this.x = 0; // Initialize x to 0
//        this.name = "Default Name"; // Initialize name to a default value
//    }

    //Defatult constructor uses parameterized constructor to avoid code duplication
    public ConstructorClass() {
        this(0, "Default Name"); // Calls the parameterized constructor with default values
    }

    // Parameterized constructor
    public ConstructorClass(int x, String name) {
//        super(x,name) // Call to the superclass constructor, super is used to call the parent class constructor if inheriting from a parent class
        this.x = x; // Set x to the provided value
        this.name = name; // Set name to the provided value
    }
}
