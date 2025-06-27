package E_abstractions_Interfaces;

public abstract class AbstractClassImplementsInterface implements InterfaceB,InterfaceA  {
    // If an interface has methods with the same name but different return types,
    // the implementing class must provide implementations for both methods.
    @Override
    public void methodA() {
        System.out.println("Method A implementation in AbstractClassImplementsInterface class");
    }

    @Override
    public void methodB() {
        System.out.println("Method B implementation in AbstractClassImplementsInterface class");
    }

    @Override
    public void shared() {
        System.out.println("Shared method implementation in AbstractClassImplementsInterface class");
    }

    @Override
    public String sharedWithDifferentReturnType() {
        return "1";
    }

    public abstract void abstractMethod(); // Abstract method that must be implemented by any subclass of this abstract class

    public void concreteMethod() {
        System.out.println("Concrete method implementation in AbstractClassImplementsInterface class");
    }
}
