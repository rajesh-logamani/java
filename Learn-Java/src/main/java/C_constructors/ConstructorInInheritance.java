package C_constructors;

public class ConstructorInInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}

class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // optional, added automatically if not written
        System.out.println("Dog constructor");
    }
}