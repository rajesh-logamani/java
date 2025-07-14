package H_collections.collectionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExercise {

    public static void main(String[] args) {
        System.out.println("Enter 5 numbers to add to the list:");
        List<Integer> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in); // Scanner to read user input. One Scanner instance is enough for the whole program.
        for(int i = 1; i <= 5; i++) {
            int number = i * 10;
            list.add(number);
        }
        System.out.println("List after adding 5 numbers: " + list);
        /*Remove the value by value*/
        RemoveByValue(scn, list);
        // Boolean isRemoved = list.remove(Integer.valueOf(numberToRemove));

        /*Remove the value by index*/
        RemoveByIndex(list, scn);
        // int removedValue = list.remove(indexToRemove);

        /*Add a new value at a specific index*/
        AddAtIndex(list, scn);
        // list.add(indexToAdd, numberToAdd);

        /*Add a new value at the end of the list*/
        AddAtEnd(list, scn);
        // list.add(numberToAdd);

        /*Replace value by index*/
        ReplaceByIndex(list, scn);
        // list.set(indexToReplace, newValue);

//        List<String,String> stringList = new ArrayList<>();
//        stringList.add({name:"Hello"},);
//        stringList.add("World");
//        stringList.add("Java");
//        System.out.println("String List: " + stringList);
        // String Cont

    }

    private static void ReplaceByIndex(List<Integer> list, Scanner scn) {
        int indexToReplace = 0; // Hardcoded index to replace
        int newValue = 50; // Hardcoded new value
        if (indexToReplace >= 0 && indexToReplace < list.size()) {
            list.set(indexToReplace, newValue);
            System.out.println("Replaced value at index " + indexToReplace + " with " + newValue);
        } else {
            System.out.println("Invalid index! No element replaced.");
        }
        System.out.println("List after replacing the element: " + list);
    }

    private static void AddAtEnd(List<Integer> list, Scanner scn) {
        int numberToAdd = 100; // Hardcoded number to add
        list.add(numberToAdd);
        System.out.println("Number " + numberToAdd + " added at the end of the list.");
        System.out.println("List after adding the number: " + list);
    }

    private static void AddAtIndex(List<Integer> list, Scanner scn) {
        int numberToAdd = 99; // Hardcoded number to add
        int indexToAdd = 2;   // Hardcoded index
        if (indexToAdd >= 0 && indexToAdd <= list.size()) {
            list.add(indexToAdd, numberToAdd);
            System.out.println("Number " + numberToAdd + " added at index " + indexToAdd);
        } else {
            System.out.println("Invalid index! Number not added.");
        }
        System.out.println("List after adding the number: " + list);
    }

    private static void RemoveByIndex(List<Integer> list, Scanner scn) {
        int indexToRemove = 1; // Hardcoded index to remove
        if (indexToRemove >= 0 && indexToRemove < list.size()) {
            int removedValue = list.remove(indexToRemove);
            System.out.println("Removed value at index " + indexToRemove + ": " + removedValue);
        } else {
            System.out.println("Invalid index! No element removed.");
        }
        System.out.println("List after removing the element: " + list);
    }

    private static void RemoveByValue(Scanner scn, List<Integer> list) {
        int numberToRemove = 42; // Hardcoded value to remove
        Boolean isRemoved = list.remove(Integer.valueOf(numberToRemove));
        if (isRemoved) {
            System.out.println("Number " + numberToRemove + " removed from the list.");
        } else {
            System.out.println("Number " + numberToRemove + " not found in the list.");
        }
        System.out.println("List after removing the number by value: " + list);
    }
}


/**
 * Note: Commonly used inbuilt methods for {@code ArrayList} in Java:
 * <ul>
 *   <li>{@code add(E e)}: Adds an element to the end of the list.</li>
 *   <li>{@code add(int index, E element)}: Inserts an element at the specified position.</li>
 *   <li>{@code addAll(Collection<? extends E> c)}: Adds all elements from another collection.</li>
 *   <li>{@code addAll(int index, Collection<? extends E> c)}: Inserts all elements from another collection at the specified position.</li>
 *   <li>{@code get(int index)}: Returns the element at the specified position.</li>
 *   <li>{@code set(int index, E element)}: Replaces the element at the specified position.</li>
 *   <li>{@code remove(int index)}: Removes the element at the specified position.</li>
 *   <li>{@code remove(Object o)}: Removes the first occurrence of the specified element.</li>
 *   <li>{@code removeAll(Collection<?> c)}: Removes all elements in the specified collection.</li>
 *   <li>{@code clear()}: Removes all elements from the list.</li>
 *   <li>{@code contains(Object o)}: Checks if the list contains the specified element.</li>
 *   <li>{@code indexOf(Object o)}: Returns the index of the first occurrence of the element.</li>
 *   <li>{@code lastIndexOf(Object o)}: Returns the index of the last occurrence of the element.</li>
 *   <li>{@code isEmpty()}: Checks if the list is empty.</li>
 *   <li>{@code size()}: Returns the number of elements in the list.</li>
 *   <li>{@code toArray()}: Returns an array containing all elements.</li>
 *   <li>{@code toArray(T[] a)}: Returns an array containing all elements in the specified array type.</li>
 *   <li>{@code iterator()}: Returns an iterator over the elements.</li>
 *   <li>{@code listIterator()}: Returns a list iterator over the elements.</li>
 *   <li>{@code subList(int fromIndex, int toIndex)}: Returns a view of the portion of the list.</li>
 *   <li>{@code retainAll(Collection<?> c)}: Retains only the elements in the list that are contained in the specified collection.</li>
 *   <li>{@code ensureCapacity(int minCapacity)}: Increases the capacity of the list if necessary.</li>
 *   <li>{@code trimToSize()}: Trims the capacity to the current size.</li>
 * </ul>
 * <p>
 * These methods are inherited from the {@code List} interface and implemented by {@code ArrayList}.
 */
