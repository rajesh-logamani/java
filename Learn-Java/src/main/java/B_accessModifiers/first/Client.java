package B_accessModifiers.first;

public class Client {
    public static void main(String[] args) {
        Class first = new Class();

        // Accessing public variable
        System.out.println("Public Variable: " + first.publicVar);

        // Accessing protected variable (will work if this class is in the same package or a subclass)
        System.out.println("Protected Variable: " + first.protectedVar);

        // Accessing default variable (will work since this class is in the same package)
        System.out.println("Default Variable: " + first.defaultVar);

        // Accessing private variable (will NOT work, as it's private to First)
//         System.out.println("Private Variable: " + first.privateVar); // Uncommenting this line will cause a compilation error

        // Calling public method
        first.publicMethod();

        // Calling protected method (will work if this class is in the same package or a subclass)
         first.protectedMethod(); // Uncommenting this line will cause a compilation error

        // Calling default method (will work since this class is in the same package)
         first.defaultMethod(); // Uncommenting this line will cause a compilation error

        // Calling private method (will NOT work, as it's private to First)
        // first.privateMethod(); // Uncommenting this line will cause a compilation error
    }
}
