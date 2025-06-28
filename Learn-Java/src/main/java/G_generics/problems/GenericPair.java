package G_generics.problems;

public class GenericPair{
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("One", 1);
        System.out.println(pair.getFirst() + ", " + pair.getSecond()); // Output: ?

        Pair<Double, String> anotherPair = new Pair<>(3.14, "Pi");
        System.out.println(anotherPair.getFirst() + ", " + anotherPair.getSecond()); // Output: 3.14, Pi
    }
}