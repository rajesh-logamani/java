package B_accessModifiers.first;

public class SubClass extends Class {
    public void accessMethods() {
        // Accessing public method
        publicMethod(); // Accessible

        // Accessing protected method
        protectedMethod(); // Accessible since this is a subclass

        // Accessing default method
        defaultMethod(); // Accessible since this is in the same package

        // Accessing private method (will NOT work, as it's private to Class)
//         privateMethod(); // Uncommenting this line will cause a compilation error
    }
}
