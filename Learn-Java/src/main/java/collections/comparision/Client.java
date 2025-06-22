package collections.comparision;

import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Item item8 = new Item("8", "Strawberry", 0.4, 110, 1);
        Item item4 = new Item("4", "Grapes", 0.6, 80, 1);
        Item item5 = new Item("5", "Mango", 0.7, 90, 1);
        Item item1 = new Item("1", "Apple", 0.5, 100, 1);
        Item item6 = new Item("6", "Pineapple", 0.8, 70, 1);
        Item item2 = new Item("2", "Banana", 0.3, 150, 1);
        Item item7 = new Item("7", "Watermelon", 0.9, 60, 1);
        Item item3 = new Item("3", "Orange", 0.4, 120, 1);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item6);
        itemList.add(item4);
        itemList.add(item8);
        itemList.add(item5);
        itemList.add(item2);
        itemList.add(item7);
        itemList.add(item3);
        System.out.println("Before name:");
        for (Item item : itemList) {
            System.out.println(item.getName() + " - Price: " + item.getPrice() + ", Quantity: " + item.getQuantity());
        }

        Collections.sort(itemList);
        System.out.println("\nAfter sorting by name:");
        for (Item item : itemList) {
            System.out.println(item.getName() + " - Price: " + item.getPrice() + ", Quantity: " + item.getQuantity());
        }

        /** * Sorting by quantity */
        Collections.sort(itemList, new QuantityComparator());
        System.out.println("\nAfter sorting by quantity:");
        for (Item item : itemList) {
            System.out.println(item.getName() + " - Price: " + item.getPrice() + ", Quantity: " + item.getQuantity());
        }

    }
}
