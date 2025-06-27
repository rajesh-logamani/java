package E_abstractions_Interfaces;

public interface InterfaceB {
    public void methodB(); // Abstract method with no body, must be implemented by any class that implements this interface

    public void shared();

    public String sharedWithDifferentReturnType(); // Abstract method with a different return type, must be implemented by any class that implements this interface
}
