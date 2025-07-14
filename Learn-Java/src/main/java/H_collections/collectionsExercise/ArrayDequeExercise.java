package H_collections.collectionsExercise;

// This code is a placeholder for an ArrayDeque exercise.
// Deque (Double Ended Queue) is a linear collection that supports element insertion and removal at both ends.
// Diff between ArrayDeque and LinkedList:
// ArrayDeque is a resizable array implementation of the Deque interface, while LinkedList is a doubly linked list implementation.
// ArrayDeque is generally faster than LinkedList for most operations, especially when adding or removing elements at both ends.

// Notes
// Similar to LinkedList. But This will be useful for Queue and Stack implementation.
// Use LinkedList, If you want to perform Insertion and deletion in the middle.

import java.util.ArrayDeque;

public class ArrayDequeExercise {

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        // Adding elements to the ArrayDeque
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);

        System.out.println("Initial ArrayDeque: " + arrayDeque); // Output: [10, 20, 30]
        // Adding elements at the front
        arrayDeque.addFirst(5);
        System.out.println("ArrayDeque after adding 5 at the front: " + arrayDeque); // Output: [5, 10, 20, 30]
        arrayDeque.addLast(90);
        System.out.println("ArrayDeque after adding 90 at the end: " + arrayDeque); // Output: [5, 10, 20, 30,90]
    }
}
