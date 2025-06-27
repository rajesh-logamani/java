package B_accessModifiers.first;

public class Class {
    public int publicVar;       // Accessible everywhere
    protected int protectedVar; // Accessible in package + subclasses
    int defaultVar;             // Accessible only in same package
    private int privateVar;     // Accessible only within this class

    private void privateMethod() {
        // Only accessible within MyClass
        System.out.println("Private Method");
    }

    public void publicMethod() {
        // Accessible from anywhere
        System.out.println("Public Method");
    }
    protected void protectedMethod() {
        // Accessible in package and subclasses
        System.out.println("Protected Method");
    }
    void defaultMethod() {
        // Accessible only within the same package
        System.out.println("Default Method");
    }
}
