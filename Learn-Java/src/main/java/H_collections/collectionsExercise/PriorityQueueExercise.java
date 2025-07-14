package H_collections.collectionsExercise;

// This code demonstrates the use of a Priority Queue in Java.
// Priority Queue is a data structure that stores elements in a way that allows for efficient retrieval of the highest or lowest priority element.
// It uses a binary heap to maintain the order of elements based on their natural ordering or a custom comparator.
// The elements in a Priority Queue are ordered according to their natural ordering or by a Comparator provided at queue construction time.
// The head of the queue is the least element with respect to the specified ordering, and elements are ordered according to their natural ordering or by a Comparator provided at queue construction time.

public class PriorityQueueExercise implements Comparable<PriorityQueueExercise> {
    @Override
    public int compareTo(PriorityQueueExercise o) {
        return this.name.compareTo(o.name); // Compare by name for natural ordering
    }

    int age;
    String name;
    public PriorityQueueExercise(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        // Example of using Priority Queue
        System.out.println("Priority Queue Example:");
        java.util.PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue<>();

        // Adding elements to the priority queue
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(10);
        priorityQueue.add(40);

        System.out.println("Initial Priority Queue: " + priorityQueue); // 10, 20, 30, 40

        // Priority Queue with custom comparator
        java.util.PriorityQueue<Integer> customPriorityQueue = new java.util.PriorityQueue<>((a, b) -> b - a); // Max-Heap
        customPriorityQueue.add(30);
        customPriorityQueue.add(10);
        customPriorityQueue.add(20);

        System.out.println("Custom Priority Queue (Max-Heap): " + customPriorityQueue); // 30, 20, 10

        // Priority Queue with Strings
        java.util.PriorityQueue<String> stringPriorityQueue = new java.util.PriorityQueue<>();
        stringPriorityQueue.add("Banana");
        stringPriorityQueue.add("Apple");
        stringPriorityQueue.add("Cherry");

        System.out.println("String Priority Queue: " + stringPriorityQueue); // Apple, Banana, Cherry

        // Priority Queue with Objects with custom comparator
        java.util.PriorityQueue<PriorityQueueExercise> personPriorityQueue = new java.util.PriorityQueue<>((p1, p2) -> p1.age - p2.age);
        personPriorityQueue.add(new PriorityQueueExercise(25, "Alice"));
        personPriorityQueue.add(new PriorityQueueExercise(30, "Bob"));
        personPriorityQueue.add(new PriorityQueueExercise(20, "Charlie"));
        System.out.println("Person Priority Queue (by age):");
        while (!personPriorityQueue.isEmpty()) {
            PriorityQueueExercise person = personPriorityQueue.poll();
            System.out.println("Name: " + person.name + ", Age: " + person.age); // Charlie, Alice, Bob
        }

        // Priority Queue with class implementing Comparable
        java.util.PriorityQueue<PriorityQueueExercise> comparablePriorityQueue = new java.util.PriorityQueue<>();
        comparablePriorityQueue.add(new PriorityQueueExercise(25, "Alice"));
        comparablePriorityQueue.add(new PriorityQueueExercise(30, "Bob"));
        comparablePriorityQueue.add(new PriorityQueueExercise(20, "Charlie"));

        System.out.println("Comparable Priority Queue (by name):");
        while (!comparablePriorityQueue.isEmpty()) {
            PriorityQueueExercise person = comparablePriorityQueue.poll();
            System.out.println("Name: " + person.name + ", Age: " + person.age); // Alice, Bob, Charlie
        }
    }
}
