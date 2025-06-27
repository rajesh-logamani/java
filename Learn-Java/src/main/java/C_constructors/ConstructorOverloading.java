package C_constructors;

public class ConstructorOverloading {
    ConstructorOverloading() {
        this("Unknown Title");
    }

    ConstructorOverloading(String title) {
        System.out.println("title: " + title);
    }
}
