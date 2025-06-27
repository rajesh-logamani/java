package E_abstractions_Interfaces;

public class Main extends AbstractClassImplementsInterface {

    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implementation in Main class");
    }

    @Override
    public void methodA() {
        System.out.println("Method A implementation in Main class");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.methodA(); // Calls methodA from Main due to overriding
        main.methodB(); // Calls methodB from InterfaceB
        main.shared(); // Calls shared method from both interfaces
        System.out.println(main.sharedWithDifferentReturnType()); // Calls sharedWithDifferentReturnType from InterfaceB
        main.concreteMethod(); // Calls concreteMethod from AbstractClassImplementsInterface
        main.abstractMethod(); // Calls abstractMethod implemented in Main class
    }
}
