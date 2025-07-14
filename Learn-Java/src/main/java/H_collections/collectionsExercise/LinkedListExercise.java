package H_collections.collectionsExercise;

import java.util.LinkedList;

public class LinkedListExercise {

    public static void main(String[] args) {
        // Example of using Linked List
        System.out.println("Linked List Example:");
       LinkedList<Integer> linkedList = new LinkedList<>();
       linkedList.add(10);
         linkedList.add(20);
         linkedList.add(30);
            linkedList.add(40);

        System.out.println("Initial Linked List: " + linkedList);
        // Adding an element at the end
        linkedList.add(50);
        System.out.println("Linked List after adding 50: " + linkedList);
        // poll
        // pollfirst and pollLast are available in LinkedList, which inherits from Deque interface
        // poll() removes the first element and returns it, or returns null if the list is empty. And it inherits from Queue interface
        //Similarly, addFirst, addLast, removeFirst, removeLast, getFirst and getLast are available in LinkedList, which inherits from Deque interface
        // Removing the first element
        System.out.println(linkedList.pollFirst());
        // Removing the last element
        System.out.println(linkedList.pollLast());
        // Displaying the Linked List after removals
        System.out.println("Linked List after removals: " + linkedList);

    }
}
